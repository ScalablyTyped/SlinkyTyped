package typingsSlinky.spotifyWebPlaybackSdk.Spotify

import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ad
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.audio
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.episode
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.track
import typingsSlinky.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Track extends js.Object {
  var album: Album = js.native
  var artists: js.Array[Artist] = js.native
  var id: String | Null = js.native
  var is_playable: Boolean = js.native
  var media_type: audio | video = js.native
  var name: String = js.native
  var `type`: track | episode | ad = js.native
  var uri: String = js.native
}

object Track {
  @scala.inline
  def apply(
    album: Album,
    artists: js.Array[Artist],
    is_playable: Boolean,
    media_type: audio | video,
    name: String,
    `type`: track | episode | ad,
    uri: String
  ): Track = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], is_playable = is_playable.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  @scala.inline
  implicit class TrackOps[Self <: Track] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: Album): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtists(value: js.Array[Artist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_playable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_playable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_type(value: audio | video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: track | episode | ad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
  }
  
}

