package com.example.aa_dice_roller.model

import com.example.aa_dice_roller.R


fun setDiceImg():Int{
    var randFerit = (1..6).random()
    var drawableLoc:Int
    when (randFerit){
        1 -> drawableLoc = R.drawable.feritroll1
        2 -> drawableLoc = R.drawable.feritroll2
        3 -> drawableLoc = R.drawable.feritroll3
        4 -> drawableLoc = R.drawable.feritroll4
        5 -> drawableLoc = R.drawable.feritroll5
        else -> drawableLoc = R.drawable.feritroll6
    }
    return drawableLoc
}
