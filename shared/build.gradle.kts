plugins {
    id("org.jetbrains.kotlin.jvm").version("1.6.10")
    id("com.apollographql.apollo3").version("3.2.2")
}

apollo {
    packageName.set("com.example")
    introspection {
        endpointUrl.set("https://kiki-conf.ew.r.appspot.com/graphql")
        schemaFile.set(file("src/commonMain/graphql/schema.sdl"))
    }
}