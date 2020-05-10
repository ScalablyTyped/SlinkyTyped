package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for an album
  * 
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait AlbumSearchResponse extends js.Object {
  var albums: PagingObject[AlbumObjectSimplified] = js.native
}

object AlbumSearchResponse {
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified]): AlbumSearchResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumSearchResponse]
  }
  @scala.inline
  implicit class AlbumSearchResponseOps[Self <: AlbumSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbums(value: PagingObject[AlbumObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

