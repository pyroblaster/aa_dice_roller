package com.example.aa_dice_roller.model

var dice1Flag = true
var dice2Flag = true
var dice3Flag = true
var dice4Flag = true
var dice5Flag = true
var dice6Flag = true
var diceRollsLeft = 2

fun diceFlagChanger(diceFlag:Boolean):Boolean = !diceFlag

var diceFlag = mutableListOf(dice1Flag, dice2Flag, dice3Flag, dice4Flag, dice5Flag, dice6Flag)
