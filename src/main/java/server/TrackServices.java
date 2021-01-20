/*
 *
 *  * (c) 2015 - 2021 ENisco GmbH & Co. KG
 *
 */

package server;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(tags = {"Bands"}, summary = "Legt eine Band an", responses = @ApiResponse(responseCode = "201",
            description = "Created!", content = @Content(mediaType = MediaType.TEXT_PLAIN,
            schema = @Schema(implementation = String.class))))
    public Response createTrack(TrackItem track)
    {
        String result = "Created track: " + track.getBand() + ", " + track.getTitle();

        return Response.status(Status.OK).entity(result).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(tags = {"Bands"}, summary = "Liste aller Bands", responses = @ApiResponse(responseCode = "200",
            description = "OK", content = @Content(mediaType = MediaType.APPLICATION_JSON,
            array = @ArraySchema(schema = @Schema(implementation = Track.class)))))
    public List<Track> getTracks()
    {
        List<Track> tracks = new ArrayList<>();

        Track track = new Track();

        track.setBand("ACDC");
        track.setTitle("Hells Bells");
        tracks.add(track);

        track.setBand("Queen");
        track.setTitle("Bohemian Rhapsody");
        tracks.add(track);

        return tracks;
    }
}
