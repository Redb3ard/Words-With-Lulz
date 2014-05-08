package com.mariolopezjr.wwl.game.rest

import spray.json.DefaultJsonProtocol
import spray.httpx.SprayJsonSupport

/**
 * JSON support object
 */
object JsonProtocol extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val newGameRequestFormat = jsonFormat1(NewGameRequest)
  implicit val newGameResponseFormat = jsonFormat3(NewGameResponse)
}
