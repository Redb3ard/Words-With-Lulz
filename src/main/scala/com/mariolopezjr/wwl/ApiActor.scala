package com.mariolopezjr.wwl

import akka.actor._

import spray.routing._
import com.mariolopezjr.wwl.game.rest.GameRestService

/**
 * Boiler plate code
 */
object ApiActor {
  def props = Props[ApiActor]
}

/**
 * REST API
 */
class ApiActor extends HttpServiceActor with ActorLogging with GameRestService {
  def receive = runRoute(
    pathPrefix("wwl") {
      gameRestService
    }
  )
}
