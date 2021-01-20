/*
 *
 *  * (c) 2015 - 2021 ENisco GmbH & Co. KG
 *
 */

package server;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/Tracks/{trackid}")
public class TrackServices2
{
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(tags = {"Tracks"}, summary = "Ändert einen Track", responses = @ApiResponse(responseCode = "200", description = "OK"))
    public void changeTrack(@Parameter(description = "ID des Tracks", required = true) @PathParam("trackid") int trackid, TrackItem track)
    {
        String result = "Change track with id " + trackid + ":" + track.getBand() + ", " + track.getTitle();
        System.out.println(result);
    }
}
