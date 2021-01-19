/*
 *
 *  * (c) 2015 - 2021 ENisco GmbH & Co. KG
 *
 */

package server;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@OpenAPIDefinition(
        info = @Info(
                title = "Band API",
                version = "1.0",
                description = "API of Bands"
        ),
        servers = {
                @Server(
                        description = "SwaggerHub API Auto Mocking",
                        url = "https://virtserver.swaggerhub.com/JonasT3000/Band/1"
                )
        }
)
@Path("/Tracks")
public class TrackServices
{
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(tags = {"Bands"}, summary = "Legt eine Band an", responses = @ApiResponse(responseCode = "201", description = "Created!"))
    public Response createTrack(Track track)
    {
        String result = "Created track: " + track.getBand() + ", " + track.getTitle();

        return Response.status(Status.OK).entity(result).build();
    }
}
