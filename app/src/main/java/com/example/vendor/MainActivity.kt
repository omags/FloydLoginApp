package com.example.vendor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity() {

    private lateinit var  btnClick: Button
    private lateinit var tvMessage: TextView
    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText

    private val tag: String = MainActivity::class.java.simpleName.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPassword = findViewById(R.id.etPassword)
        etEmail = findViewById(R.id.etEmail)
        etName = findViewById(R.id.etName)
        tvMessage = findViewById(R.id.tvMessages)
        btnClick = findViewById(R.id.btnClick)

        btnClick.setOnClickListener{

            val name = etName.text
            val email =etEmail.text
            val password =etPassword.text

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()){

                MotionToast.createToast(this,
                    "Failed to login ☹️",
                    "all the fields must be filled!",
                    MotionToast.TOAST_ERROR,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular))

            }else{
                tvMessage.text = "you have entered whit:${name}${email}${password}"
            }


        }
    }
}