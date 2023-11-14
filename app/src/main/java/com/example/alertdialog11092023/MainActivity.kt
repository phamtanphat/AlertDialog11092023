package com.example.alertdialog11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var btnOpenAlertDialog: Button
    private lateinit var btnOpenCustomDialog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenAlertDialog = findViewById(R.id.button_open_alert_dialog)
        btnOpenCustomDialog = findViewById(R.id.button_open_custom_dialog)

        btnOpenAlertDialog.setOnClickListener {
            openAlertDialogSingleChoiceItems()
        }

        isMale(Gender.FEMALE)
    }

    private fun openAlertDialogSingleChoiceItems() {
        var tmpIndexItemColor = -1
        AlertDialog.Builder(this@MainActivity).apply {
            setTitle("Pick color")
            setCancelable(false)

            val listItemColors: Array<String> = arrayOf("Red", "Green", "Blue", "Orange")
            setSingleChoiceItems(listItemColors, -1) { dialogInterface, index ->
                tmpIndexItemColor = index
            }

            // Button Positive
            setPositiveButton("Ok") { _, _ ->
                val color = listItemColors.getOrNull(tmpIndexItemColor) ?: ""
                Toast.makeText(this@MainActivity, color, Toast.LENGTH_SHORT).show()
            }

            // Button Negative
            setNegativeButton("Cancel") { _, _ -> }

            show()
        }
    }

    private fun openAlertDialogBasic() {
        AlertDialog.Builder(this@MainActivity).apply {
            setTitle("Thông báo")
            setMessage("Có phiên bản mới. Bạn cần cập nhật ứng dụng?")
            setIcon(android.R.drawable.ic_menu_upload_you_tube)
            setCancelable(false)

            // Button Positive
            setPositiveButton("Đồng ý") { _, _ ->
                Toast.makeText(
                    this@MainActivity,
                    "Đồng ý",
                    Toast.LENGTH_SHORT
                ).show()
            }

            // Button Negative
            setNegativeButton("Thoát app") { _, _ ->
                Toast.makeText(
                    this@MainActivity,
                    "Thoát",
                    Toast.LENGTH_SHORT
                ).show()
            }

            // Button Neutral
            setNeutralButton("Help") { _, _ ->
                Toast.makeText(
                    this@MainActivity,
                    "Help",
                    Toast.LENGTH_SHORT
                ).show()
            }
            show()
        }
    }

    fun isMale(gender: Gender): Boolean {
       return when (gender) {
           Gender.MALE -> true
           else -> false
       }
    }
}

enum class Gender {
    MALE, FEMALE
}