package com.example.aa_dice_roller.ui.dice

import android.widget.Button
import android.widget.ImageView
import com.example.aa_dice_roller.R
import com.example.aa_dice_roller.model.*
import com.example.aa_dice_roller.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class DiceThrower : BaseActivity() {
    override fun getLayoutResourceId(): Int = R.layout.activity_main

    override fun setUpUi() {

        var dice1: ImageView = findViewById(R.id.dice1)
        var dice2: ImageView = findViewById(R.id.dice2)
        var dice3: ImageView = findViewById(R.id.dice3)
        var dice4: ImageView = findViewById(R.id.dice4)
        var dice5: ImageView = findViewById(R.id.dice5)
        var dice6: ImageView = findViewById(R.id.dice6)

        val diceRollButton: Button = findViewById(R.id.diceRoll)
        val diceResetButton: Button = findViewById(R.id.resetRolls)
        val diceImg = mutableListOf(dice1, dice2, dice3, dice4, dice5, dice6)

        diceRollButton.setOnClickListener{
            roll(diceFlag, diceImg)
        }
        diceResetButton.setOnClickListener{
            reset()
        }

}
    private fun setFlag(diceFlag:MutableList<Boolean>, diceImg:MutableList<ImageView>){
        for(i in 0..5){
            diceImg[i].setOnClickListener{
                diceFlag[i] = diceFlagChanger(diceFlag[i])
            }
        }
    }

    private fun diceFlagReturnAfterReset(diceFlag:MutableList<Boolean>){
        for(i in 0..5){
            diceFlag[i] = true
        }
    }
    private fun reset(){
        diceRollsLeft = 2
        updateRollsText()
        diceFlagReturnAfterReset(diceFlag)
    }
    fun updateRollsText(){
        rollsLeft.text = diceRollsLeft.toString()
    }
    private fun roll(diceFlag:MutableList<Boolean>, diceImg:MutableList<ImageView>) {
        when(diceRollsLeft) {
            2 ->{
                for (i in 0..5) {
                    diceImg[i].setImageResource(setDiceImg())
                }
                diceRollsLeft--
                updateRollsText()
                }

            1 -> {
                setFlag(diceFlag, diceImg)
                for (i in 0..5) {
                    if (diceFlag[i] == true) {
                        diceImg[i].setImageResource(setDiceImg())
                    }
                }
                diceRollsLeft--
                updateRollsText()
            }
        }
    }
}
