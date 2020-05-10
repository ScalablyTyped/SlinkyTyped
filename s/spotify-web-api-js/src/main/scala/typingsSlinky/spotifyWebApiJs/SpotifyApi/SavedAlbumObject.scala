package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait SavedAlbumObject extends js.Object {
  var added_at: String = js.native
  var album: AlbumObjectFull = js.native
}

object SavedAlbumObject {
  @scala.inline
  def apply(added_at: String, album: AlbumObjectFull): SavedAlbumObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], album = album.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedAlbumObject]
  }
  @scala.inline
  implicit class SavedAlbumObjectOps[Self <: SavedAlbumObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlbum(value: AlbumObjectFull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

