package com.example.loginproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginproject.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = "${getString(R.string.user)} ${intent.getStringExtra("USER")}"
        val dateHour = "${getString(R.string.logged_in)} ${intent.getStringExtra("DATE_HOUR")}"
        println(user)

        binding.userTxt.text = user
        println(binding.userTxt.text)
        binding.loggedIn.text = dateHour
    }
}