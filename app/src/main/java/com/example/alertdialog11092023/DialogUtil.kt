package com.example.alertdialog11092023

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.Constraints.LayoutParams

class DialogUtil {
    companion object {
        fun showLoginDialog(context: Context, onListenLoginSuccess: ((String, String) -> Unit)? = null) {
            Dialog(context).apply {
                setContentView(R.layout.layout_login_dialog)
                // Set window
                window?.setLayout(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
                window?.setGravity(Gravity.CENTER)

                // FindViewById
                val edtAccount = findViewById<EditText>(R.id.edit_text_account)
                val edtPassword = findViewById<EditText>(R.id.edit_text_password)
                val btnLogin = findViewById<AppCompatButton>(R.id.button_login)

                btnLogin.setOnClickListener {
                    val accountStr: String = edtAccount.text.toString()
                    val passwordStr: String = edtPassword.text.toString()

                    if (accountStr == "phat" && passwordStr == "123") {
                        onListenLoginSuccess?.invoke(accountStr, passwordStr)
                    }
                }

                // Display dialog
                show()
            }
        }
    }
}