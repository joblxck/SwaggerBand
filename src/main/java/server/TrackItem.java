/*
 *
 *  * (c) 2015 - 2021 ENisco GmbH & Co. KG
 *
 */

package server;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "More infos about a Track")
public class TrackItem
{
    private String band;
    private String title;
    private String time;
    private String genre;

    @Schema(maximum = "20", example = "Rammstein")
    public String getBand()
    {
        return band;
    }

    public void setBand(String band)
    {
        this.band = band;
    }

    @Schema(maximum = "20", example = "Engel")
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Schema(maximum = "6", minimum = "6", example = "04m26s")
    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    @Schema(maximum = "20", example = "Metal")
    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
