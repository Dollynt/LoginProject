package com.example.loginproject

import android.app.AlertDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import com.example.loginproject.databinding.ActivitySecondBinding

class SecondActivity : ComponentActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            showExitConfirmationDialog()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = "${getString(R.string.user)} ${intent.getStringExtra("USER")}"
        val dateHour = "${getString(R.string.logged_in)} ${intent.getStringExtra("DATE_HOUR")}"

        binding.userTxt.text = user
        binding.loggedIn.text = dateHour

        onBackPressedDispatcher.addCallback(this, callback)
    }

    private fun showExitConfirmationDialog() {
        AlertDialog.Builder(this)
            .setMessage("Are you sure you want to exit?")
            .setPositiveButton("Yes") { _, _ -> finish() }
            .setNegativeButton("No", null)
            .show()
    }
}