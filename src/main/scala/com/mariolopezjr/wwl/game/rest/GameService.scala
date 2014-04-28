package com.mariolopezjr.wwl.game.rest

import spray.routing.HttpService
import NewGameJsonSupport._

/**
 * REST API for the managing games (creating, joining, and listing)
 */
trait GameService extends HttpService {
  val gameService =
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
          entity(as[NewGame]) { newGame =>
            detach() {
              complete("--> unable to start game: " + newGame + "\n")
            }
          }
        }
      }
    }
}
