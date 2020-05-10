package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for a playlist
  * 
  * GET /v1/search?type=playlist
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait PlaylistSearchResponse extends js.Object {
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}

object PlaylistSearchResponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): PlaylistSearchResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSearchResponse]
  }
  @scala.inline
  implicit class PlaylistSearchResponseOps[Self <: PlaylistSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

