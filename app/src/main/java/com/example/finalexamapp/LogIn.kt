package com.example.finalexamapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
data class Horoscopes(
    val status: String = ""
    val title: String="" )

class HoroscopesViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)


class LogIn : AppCompatActivity() {
    fun onNextPage(view: View?) {
        val MainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(MainActivityIntent)
    }

    fun onNextPage3(view: View?) {
        val MainActivity2Intent = Intent(this, MainActivity2::class.java)
        startActivity(MainActivity2Intent)
    }


class LogIn : AppCompatActivity() {
    private lateinit var Login : Button
    private lateinit var Regist : Button
    private lateinit var LogInEmail : EditText
    private lateinit var LogInPass : EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        Login=findViewById(R.id.Login)
        Regist=findViewById(R.id.Regist)
        LogInEmail=findViewById(R.id.LogInEmail)
        LogInPass=findViewById(R.id.LogInPass)
        auth= FirebaseAuth.getInstance()

    }
    val buttonOne = findViewById<Button>(R.id.Login)
      buttonOne.setOnClickListener {
        println("Button Clicked")
        val MainActivity2Intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(MainActivity2Intent)
    }
    val buttonTwo = findViewById<Button>(R.id.Regist)
    buttonTwo.setOnClickListener {
        println("Button Clicked")
        val MainActivityIntent = Intent(applicationContext, MainActivity::class.java)
        startActivity(MainActivityIntent)
    }

