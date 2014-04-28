package com.mariolopezjr.wwl.game.rest

import spray.json.DefaultJsonProtocol
import spray.httpx.SprayJsonSupport

/**
 * New game data
 */
case class NewGame(players: List[String]) {}

object NewGameJsonSupport extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val PortofolioFormats = jsonFormat1(NewGame)
}