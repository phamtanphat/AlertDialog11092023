package com.example.alertdialog11092023

import android.app.Dialog
import android.content.Context

class DialogUtil {
    companion object {
        fun showLoginDialog(context: Context) {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.layout_login_dialog)
            dialog.show()
        }
    }
}