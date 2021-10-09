package com.threat.graphl

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder

fun SchemaBuilder.api() {
    query("helloWorld") {
        resolver { ->
            "GraphQL is here"
        }
    }
}