package com.example.loginproject

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.loginproject.databinding.ActivityMainBinding

class MainActivity : ComponentActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener(this)
    }

    private fun checkCredentials(email: String, password: String): Boolean{
        return email == "admin@cin.ufpe.br" && password == "admin"
    }

    override fun onClick(v: View?) {
        binding.submitButton.setOnClickListener(){
            val email = binding.email.text.toString().trim()
            val password = binding.password.text.toString().trim()
            if(checkCredentials(email, password))
                Toast.makeText(this, "success", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "invalid credentials", Toast.LENGTH_LONG).show()
        }
    }
}



