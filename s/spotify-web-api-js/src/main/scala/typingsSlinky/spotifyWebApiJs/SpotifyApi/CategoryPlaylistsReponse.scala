package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a categorys playlists
  * 
  * GET /v1/browse/categories/{id}/playlists
  * https://developer.spotify.com/web-api/get-categorys-playlists/
  */
@js.native
trait CategoryPlaylistsReponse extends js.Object {
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}

object CategoryPlaylistsReponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): CategoryPlaylistsReponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryPlaylistsReponse]
  }
  @scala.inline
  implicit class CategoryPlaylistsReponseOps[Self <: CategoryPlaylistsReponse] (val x: Self) extends AnyVal {
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

