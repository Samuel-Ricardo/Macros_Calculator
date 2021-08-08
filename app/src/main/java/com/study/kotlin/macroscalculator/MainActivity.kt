package com.study.kotlin.macroscalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigateButton:Button = findViewById<Button>(R.id.button_letsgo)
        val credits = findViewById<TextView>(R.id.textView_credits)

        navigateButton.setOnClickListener(View.OnClickListener {
            nextPage();
        })

      //  credits.setOnClickListener { openLinkedIn() }
    }
/*
    public fun openLinkedIn() {

    }
*/
    fun nextPage() {

        val itent:Intent = Intent(this, UserDataActivity::class.java);
        startActivity(itent);
    }

    fun openLinkedIn(view: View) {

    }
}
