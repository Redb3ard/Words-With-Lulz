package com.mariolopezjr.wwl

import akka.actor._

import spray.routing._
import com.mariolopezjr.wwl.game.rest.GameService

/**
 * Boiler plate code
 */
object ApiActor {
  def props = Props[ApiActor]
}

/**
 * REST API
 */
class ApiActor extends HttpServiceActor with ActorLogging with GameService {
  def receive = runRoute(
    pathPrefix("wwl") {
      gameService
    }
  )
}
