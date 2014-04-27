package com.mariolopezjr.wwl

import akka.actor._

import spray.routing._

object ApiActor {
  def props = Props[ApiActor]
}

class ApiActor extends HttpServiceActor with ActorLogging {
  def receive = runRoute(
    pathPrefix("wwl") {
      path("games") {
        get {
          complete("-- none --\n")
        } ~
          put {
            complete("foo, bar!")
          }
      }
    }
  )
}
