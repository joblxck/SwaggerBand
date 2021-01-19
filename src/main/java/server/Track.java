/*
 *
 *  * (c) 2015 - 2021 ENisco GmbH & Co. KG
 *
 */

package server;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Track with Band and Title")
public class Track
{
    private String band;
    private String title;

    @Schema(maximum = "20", example = "Metallica")
    public String getBand()
    {
        return band;
    }

    public void setBand(String band)
    {
        this.band = band;
    }

    @Schema(maximum = "20", example = "Master of Puppets")
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}
