package com.mariolopezjr.wwl.game

import com.mariolopezjr.wwl.game.rest.NewGameRequest

/**
 * Manages games
 */
class GameService {
  val gameDataStore: GameDataStore = new InMemoryGameDataStore()


  /**
   * Create a new game
   * @param gameId String the name of the game
   * @param request NewGameRequest new game details
   * @return Game
   */
  def createNewGame(gameId: String, request: NewGameRequest): Game = {
    // todo: get actual player name and generate random letters
    val player1 = new Player("player1", Array('A', 'B', 'C', 'D', 'E', 'F', 'G'))

    new Game(gameId, player1, null, null)
  }
}
