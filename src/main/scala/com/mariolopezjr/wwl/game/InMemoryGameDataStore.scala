package com.mariolopezjr.wwl.game

import scala.collection.mutable

/**
 * Stores game data in memory
 */
class InMemoryGameDataStore extends GameDataStore {

  val inMemoryGames = new mutable.HashMap[String, Game]()

  /** Get list of games */
  override def games: Iterable[Game] = {
    inMemoryGames.values
  }

  /** Gets the specified game data */
  override def game(gameId: String): Game = {
    inMemoryGames.getOrElse(gameId, null)
  }

  /** Adds a game to the data store */
  override def ::(game: Game): Unit = {
    inMemoryGames.put(game.name, game)
  }
}
