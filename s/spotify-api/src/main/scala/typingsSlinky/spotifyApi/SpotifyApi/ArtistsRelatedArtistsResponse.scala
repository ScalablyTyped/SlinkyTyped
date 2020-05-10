package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get an Artist’s Related Artists
  * 
  * GET /v1/artists/{id}/related-artists
  * https://developer.spotify.com/web-api/get-related-artists/
  */
@js.native
trait ArtistsRelatedArtistsResponse extends js.Object {
  var artists: js.Array[ArtistObjectFull] = js.native
}

object ArtistsRelatedArtistsResponse {
  @scala.inline
  def apply(artists: js.Array[ArtistObjectFull]): ArtistsRelatedArtistsResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistsRelatedArtistsResponse]
  }
  @scala.inline
  implicit class ArtistsRelatedArtistsResponseOps[Self <: ArtistsRelatedArtistsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtists(value: js.Array[ArtistObjectFull]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

