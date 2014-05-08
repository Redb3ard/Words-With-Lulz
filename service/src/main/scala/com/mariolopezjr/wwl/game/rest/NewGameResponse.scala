package com.mariolopezjr.wwl.game.rest

/**
 * New game response (output)
 */
case class NewGameResponse(gameCreated: Boolean, gameId: String, letters: Array[Char]) {}
