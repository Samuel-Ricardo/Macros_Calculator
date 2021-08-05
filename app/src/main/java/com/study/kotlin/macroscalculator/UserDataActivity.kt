package com.study.kotlin.macroscalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user_data.*
import com.study.kotlin.macroscalculator.R.id.txtCalories as txtCalories1

class UserDataActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)

        val etxtWeigth = findViewById<EditText>(R.id.editTextWeigth)

        val weigth: Double = etxtWeigth.getText() as Double

        val btnCalc:Button = findViewById(R.id.btnCalc) as Button;

      //  val txtCalories = findViewById<TextView>(txtCalories1)
      //  val txtProtein = findViewById<TextView>(R.id.txtProtein)
      //  val txtCarbs = findViewById<TextView>(R.id.txtCarb)


    }

    fun calcDiet(view:View) {

        val txtWeigth:String = editTextWeigth.getText().toString()

        val weigth = txtWeigth.toDoubleOrNull()

        val calories =

        txtCalories.setText("${weigth!!*41} ~ ${weigth!!*50} Kcal")

    }
}