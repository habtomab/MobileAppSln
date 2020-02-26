package com.example.dinnerdecider

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

      // array list of Foods

        var foodOptions= ArrayList<String>(
            arrayListOf(
                "Hamburger", "Pizza",
                "Mexican", "American", "Chinese"
            )
        )

    //Override method

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }


    //Random Access

        fun randomDecision(view: View) {
            var s=foodOptions.size
            val randomInt = (s * Math.random()).toInt()
            txtYourChoice.text=foodOptions.get(randomInt)

        }



    // addd  new food
        fun addNewFood(view: View) {
            var input=etAddNewFood?.text.toString().trim()

            if (!input.isNullOrBlank()){

                foodOptions.add(etAddNewFood.text.toString())
                Toast.makeText(this,"New FoodType is added Successfully: "+ input, Toast.LENGTH_SHORT).show()
                //for reset the EditText
                etAddNewFood.text=null
                txtYourChoice.text=input
            }

        }


    }

