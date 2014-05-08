package com.mariolopezjr.wwl.game

import com.mariolopezjr.wwl.game.rest.NewGameRequest

/**
 * Manages games
 */
class GameService {
  val gameDataStore: GameDataStore = new InMemoryGameDataStore()
  val letterGenerator = new LetterGenerator()


  /**
   * Create a new game
   * @param gameId String the name of the game
   * @param request NewGameRequest new game details
   * @return Either[String, Game] Game if it's successfully created, error message otherwise
   */
  def createNewGame(gameId: String, request: NewGameRequest): Either[String, Game] = {
    // create players
    val player1 = Player(request.players(0), Array.fill(7) {letterGenerator.letter})
    val player2 = Player(request.players(1), Array.fill(7) {letterGenerator.letter})

    // create and store game data
    val game = Game(gameId, player1, player2, Board())
    if (game :: gameDataStore) {
      Right(game)
    } else {
      Left("Game already exists.")
    }
  }
}
