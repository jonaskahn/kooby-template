package io.github.jonaskahn.controller

import io.jooby.annotation.GET
import io.jooby.annotation.Path
import io.swagger.v3.oas.annotations.Operation

@Path("/")
class HealthController {

    @Operation(summary = "Health Check Endpoints")
    @GET
    fun up(): String {
        return "API is Running!"
    }
}
