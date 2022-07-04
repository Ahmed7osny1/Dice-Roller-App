package com.example.diceroller

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn.setOnClickListener{
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

       
        twitter.setOnClickListener{
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("http://twitter.com")
            startActivity(i)
        }

        facebook.setOnClickListener{
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("http://facebook.com")
            startActivity(i)
        }

        email.setOnClickListener{
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("http://gmail.com")
            startActivity(i)
        }

    }

}