package com.example.alertdialog11092023

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isGone

class MainActivity : AppCompatActivity() {

    private lateinit var btnOpenAlertDialog: Button
    private lateinit var btnOpenCustomDialog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenAlertDialog = findViewById(R.id.button_open_alert_dialog)
        btnOpenCustomDialog = findViewById(R.id.button_open_custom_dialog)

        btnOpenAlertDialog.setOnClickListener {
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


    }
}