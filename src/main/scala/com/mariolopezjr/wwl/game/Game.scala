package com.mariolopezjr.wwl.game

/**
 * Game data
 */
case class Game(name: String, player1: Player, player2: Player, board: Board)

case class Player(name: String, letters: Array[Char], score: Int = 0)

