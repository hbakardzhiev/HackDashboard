package com.threat.plugins

import com.apurebase.kgraphql.GraphQL
import com.threat.graphl.api
import io.ktor.application.*

fun Application.configureRouting() {
    install(GraphQL) {
        playground = true
        schema {
            api() // every graphql api call
        }
    }
}
