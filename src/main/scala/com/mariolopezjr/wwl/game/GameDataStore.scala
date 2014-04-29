package com.mariolopezjr.wwl.game

/**
 * Interface for accessing the game data store
 */
trait GameDataStore {

  /** Get list of games */
  def games: Iterable[Game]

  /** Gets the specified game data */
  def game(gameId: String): Game

  /** Adds a game to the data store */
  def ::(game: Game)
}