package com.mariolopezjr.wwl.game

/**
 * The tile board
 */
case class Board(tiles: Array[Array[Tile]] = Array.ofDim[Tile](15, 15))

case class Tile(letter: Char = ' ', multiplier: TileMultiplier = new TileMultiplier)

case class TileMultiplier(letter: Int = 1, word: Int = 1)