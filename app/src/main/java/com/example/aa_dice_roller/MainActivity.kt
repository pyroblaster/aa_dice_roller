package com.example.aa_dice_roller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dice1Flag = true
        var dice2Flag = true
        var dice3Flag = true
        var dice4Flag = true
        var dice5Flag = true
        var dice6Flag = true
        var diceRollsLeft = 2

        val dice1Img: ImageView = findViewById(R.id.dice1)
        dice1Img.setOnClickListener{
            dice1Flag = diceFlag(dice1Flag)
        }

        val dice2Img: ImageView = findViewById(R.id.dice2)
        dice2Img.setOnClickListener{
            dice2Flag = diceFlag(dice2Flag)
        }

        val dice3Img: ImageView = findViewById(R.id.dice3)
        dice3Img.setOnClickListener{
            dice3Flag = diceFlag(dice3Flag)
        }

        val dice4Img: ImageView = findViewById(R.id.dice4)
        dice4Img.setOnClickListener{
            dice4Flag = diceFlag(dice4Flag)
        }

        val dice5Img: ImageView = findViewById(R.id.dice5)
        dice5Img.setOnClickListener{
            dice5Flag = diceFlag(dice5Flag)
        }

        val dice6Img: ImageView = findViewById(R.id.dice6)
        dice6Img.setOnClickListener{
            dice6Flag = diceFlag(dice6Flag)
        }


        val diceRollButton: Button = findViewById(R.id.diceRoll)
        diceRollButton.setOnClickListener {
            if(diceRollsLeft>0) {
                if(dice1Flag == true) diceRoll1()
                if(dice2Flag == true) diceRoll2()
                if(dice3Flag == true) diceRoll3()
                if(dice4Flag == true) diceRoll4()
                if(dice5Flag == true) diceRoll5()
                if(dice6Flag == true) diceRoll6()
                diceRollsLeft--
                rollsLeft.text = diceRollsLeft.toString()
                }
        }

        val diceResetButton: Button = findViewById(R.id.resetRolls)
        diceResetButton.setOnClickListener {
            diceRollsLeft = 2
            rollsLeft.text = diceRollsLeft.toString()
            dice1Flag = true
            dice2Flag = true
            dice3Flag = true
            dice4Flag = true
            dice5Flag = true
            dice6Flag = true
        }

    }

    private fun diceFlag(diceFlag:Boolean):Boolean{
        var dFlag = diceFlag
        if (dFlag==true) dFlag == false
        else dFlag = true
        return dFlag
    }

    private fun diceRoll1(){
        var randFerit = (1..6).random()
        when (randFerit){
            1 -> dice1.setImageResource(R.drawable.feritroll1)
            2 -> dice1.setImageResource(R.drawable.feritroll2)
            3 -> dice1.setImageResource(R.drawable.feritroll3)
            4 -> dice1.setImageResource(R.drawable.feritroll4)
            5 -> dice1.setImageResource(R.drawable.feritroll5)
            6 -> dice1.setImageResource(R.drawable.feritroll6)
        }
    }

    private fun diceRoll2(){
        var randFerit = (1..6).random()
        when (randFerit){
            1 -> dice2.setImageResource(R.drawable.feritroll1)
            2 -> dice2.setImageResource(R.drawable.feritroll2)
            3 -> dice2.setImageResource(R.drawable.feritroll3)
            4 -> dice2.setImageResource(R.drawable.feritroll4)
            5 -> dice2.setImageResource(R.drawable.feritroll5)
            6 -> dice2.setImageResource(R.drawable.feritroll6)
        }
    }

    private fun diceRoll3(){
        var randFerit = (1..6).random()
        when (randFerit){
            1 -> dice3.setImageResource(R.drawable.feritroll1)
            2 -> dice3.setImageResource(R.drawable.feritroll2)
            3 -> dice3.setImageResource(R.drawable.feritroll3)
            4 -> dice3.setImageResource(R.drawable.feritroll4)
            5 -> dice3.setImageResource(R.drawable.feritroll5)
            6 -> dice3.setImageResource(R.drawable.feritroll6)
        }
    }

    private fun diceRoll4(){
        var randFerit = (1..6).random()
        when (randFerit){
            1 -> dice4.setImageResource(R.drawable.feritroll1)
            2 -> dice4.setImageResource(R.drawable.feritroll2)
            3 -> dice4.setImageResource(R.drawable.feritroll3)
            4 -> dice4.setImageResource(R.drawable.feritroll4)
            5 -> dice4.setImageResource(R.drawable.feritroll5)
            6 -> dice4.setImageResource(R.drawable.feritroll6)
        }
    }

    private fun diceRoll5(){
        var randFerit = (1..6).random()
        when (randFerit){
            1 -> dice5.setImageResource(R.drawable.feritroll1)
            2 -> dice5.setImageResource(R.drawable.feritroll2)
            3 -> dice5.setImageResource(R.drawable.feritroll3)
            4 -> dice5.setImageResource(R.drawable.feritroll4)
            5 -> dice5.setImageResource(R.drawable.feritroll5)
            6 -> dice5.setImageResource(R.drawable.feritroll6)
        }
    }

    private fun diceRoll6(){
        var randFerit = (1..6).random()
        when (randFerit){
            1 -> dice6.setImageResource(R.drawable.feritroll1)
            2 -> dice6.setImageResource(R.drawable.feritroll2)
            3 -> dice6.setImageResource(R.drawable.feritroll3)
            4 -> dice6.setImageResource(R.drawable.feritroll4)
            5 -> dice6.setImageResource(R.drawable.feritroll5)
            6 -> dice6.setImageResource(R.drawable.feritroll6)
        }
    }


}
