package com.threat

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.threat.plugins.*
import io.ktor.application.*
import io.ktor.routing.*

fun main() {
    val port = 8080;
    println("Go to http://localhost:$port/graphql")
    embeddedServer(Netty, port = port, host = "localhost") {
        configureHTTP()
        configureRouting()
        configureSecurity()
    }.start(wait = true)

}
