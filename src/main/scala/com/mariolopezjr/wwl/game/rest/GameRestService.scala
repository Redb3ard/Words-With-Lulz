package com.mariolopezjr.wwl.game.rest

import spray.routing.HttpService
import JsonProtocol._
import com.mariolopezjr.wwl.game.GameService

/**
 * REST API for the managing games (creating, joining, and listing)
 */
trait GameRestService extends HttpService {
  val gameService = new GameService()

  val gameRestService =
    path("games") {
      get {
        complete("--> no games available\n")
      }
    } ~
    path("game" / Segment) { gameId =>
      get {
        complete("--> game not found: " + gameId + "\n")
      } ~
      post {
        decompressRequest() {
          entity(as[NewGameRequest]) { newGameRequest =>
            detach() {
              // TODO: exception handling, just return a 201 if successfully created
              gameService.createNewGame(gameId, newGameRequest).fold(
                error => complete("TODO: write an exception handler"),
                game => complete(
                  new NewGameResponse(
                    true,
                    game.name,
                    game.player1.letters))
              )
            }
          }
        }
      }
    }
}
