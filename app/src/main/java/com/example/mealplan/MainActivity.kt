/*  referencing List*/
/* https://www.youtube.com/watch?v=_u8zA1CxxV4&t=2642s*/
/* https://www.youtube.com/watch?v=xAslJ-f9PWs*/
/*https://www.programiz.com/kotlin-programming/functions*/
/*(Tutor"IMAD lessons Anjali Sunil Morar,2025)*/


package com.example.mealplan
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.handleCoroutineException


class MainActivity : AppCompatActivity() {

    //  Declared variables for Xml components but are not initialised
    private lateinit var suggestionTv: TextView
    private lateinit var editTextTime: EditText
    private lateinit var mealSuggestionBtn: Button
    private lateinit var resetBtn: Button
    private lateinit var resultsTv: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //  linked Id components to the variables

        suggestionTv = findViewById(R.id.suggestionTv)
        editTextTime = findViewById(R.id.editTextTime)
        mealSuggestionBtn = findViewById(R.id.mealSuggestionBtn)
        resultsTv = findViewById(R.id.ResultsTv)
        resetBtn = findViewById(R.id.ResetBtn)

        mealSuggestionBtn.setOnClickListener(){  // adding functionality to the button to provide meal  suggestions
            mealSuggestion()
        }
        resetBtn.setOnClickListener(){    // adding functionality to the Reset button to clear input
            editTextTime.text.clear()
            resultsTv.text=""
        }

    }
    // initialising the if, Else statementB


   fun mealSuggestion() {
        val time = editTextTime.text.toString().trim().lowercase()
        var suggestion = ""
        if (time == "morning") {
            suggestion = " breakfast=omelette with croissant" // we are comparing different time of day for different meal suggestions
        } else if (time == "mid-morning") {
            suggestion = "Snacks =chia pudding"
        } else if (time == "afternoon") {
            suggestion = " Lunch =salmon with mix veg"
        } else if (time == "mid-afternoon") {
            suggestion = "Nibbles= fruit sald"
        } else if (time == "evening") {
            suggestion = " Dinner=  Dinner- ( lamb curry with mashed potatoes"
        } else {
            suggestion = "invalid time of day"   // incorporated message for users when invalid  input entered
        }
        resultsTv.text = suggestion




    }



}