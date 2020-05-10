package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for an artist
  * 
  * GET /v1/search?type=artist
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait ArtistSearchResponse extends js.Object {
  var artists: PagingObject[ArtistObjectFull] = js.native
}

object ArtistSearchResponse {
  @scala.inline
  def apply(artists: PagingObject[ArtistObjectFull]): ArtistSearchResponse = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistSearchResponse]
  }
  @scala.inline
  implicit class ArtistSearchResponseOps[Self <: ArtistSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtists(value: PagingObject[ArtistObjectFull]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

