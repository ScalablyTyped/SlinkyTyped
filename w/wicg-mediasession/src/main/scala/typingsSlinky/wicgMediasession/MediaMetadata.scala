package typingsSlinky.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaMetadata extends js.Object {
  // Media's album.
  var album: String = js.native
  // Media's artist.
  var artist: String = js.native
  // Media's artwork.
  var artwork: js.Array[MediaImage] = js.native
  // Media's title.
  var title: String = js.native
}

object MediaMetadata {
  @scala.inline
  def apply(album: String, artist: String, artwork: js.Array[MediaImage], title: String): MediaMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork = artwork.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaMetadata]
  }
  @scala.inline
  implicit class MediaMetadataOps[Self <: MediaMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtwork(value: js.Array[MediaImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

