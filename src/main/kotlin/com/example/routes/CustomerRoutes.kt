package com.example.routes

import com.example.models.*
import io.ktor.http.*
import io.ktor.server.application.call
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.Route
import io.ktor.server.routing.delete
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route

fun Route.customerRouting() {
  route("/customer") {
    get {
      if (customerStorage.isNotEmpty()) {
        call.respond(customerStorage)
      } else {
        call.respondText("No customers found", status = HttpStatusCode.OK)
      }
    }
    get("{id?}") {}
    post {}
    delete("{id?}") {}
  }
}
