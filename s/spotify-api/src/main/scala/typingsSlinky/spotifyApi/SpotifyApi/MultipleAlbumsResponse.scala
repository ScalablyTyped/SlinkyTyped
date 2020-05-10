package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get Several Albums
  * 
  * GET /v1/albums?ids={ids}
  * https://developer.spotify.com/web-api/get-several-albums/ 
  */
@js.native
trait MultipleAlbumsResponse extends js.Object {
  var albums: js.Array[AlbumObjectFull] = js.native
}

object MultipleAlbumsResponse {
  @scala.inline
  def apply(albums: js.Array[AlbumObjectFull]): MultipleAlbumsResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAlbumsResponse]
  }
  @scala.inline
  implicit class MultipleAlbumsResponseOps[Self <: MultipleAlbumsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbums(value: js.Array[AlbumObjectFull]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

