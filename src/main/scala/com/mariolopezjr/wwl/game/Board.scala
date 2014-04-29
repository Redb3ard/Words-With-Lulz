package com.mariolopezjr.wwl.game

/**
 * The tile board
 */
class Board(tiles: Array[Array[Tile]] = Array.ofDim[Tile](15, 15))

class Tile(letter: Char = ' ', multiplier: TileMultiplier = new TileMultiplier())

class TileMultiplier(letter: Int = 1, word: Int = 1)