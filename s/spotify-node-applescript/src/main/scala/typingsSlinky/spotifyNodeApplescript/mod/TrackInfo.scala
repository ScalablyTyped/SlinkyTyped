package typingsSlinky.spotifyNodeApplescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackInfo extends js.Object {
  var album: String = js.native
  var album_artist: String = js.native
  var artist: String = js.native
  var artwork_url: String = js.native
  var disc_number: Double = js.native
  var duration: Double = js.native
  var id: String = js.native
  var name: String = js.native
  var played_count: Double = js.native
  var popularity: Double = js.native
  var spotify_url: String = js.native
  var starred: Boolean = js.native
  var track_number: Double = js.native
}

object TrackInfo {
  @scala.inline
  def apply(
    album: String,
    album_artist: String,
    artist: String,
    artwork_url: String,
    disc_number: Double,
    duration: Double,
    id: String,
    name: String,
    played_count: Double,
    popularity: Double,
    spotify_url: String,
    starred: Boolean,
    track_number: Double
  ): TrackInfo = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], album_artist = album_artist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], artwork_url = artwork_url.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], played_count = played_count.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], spotify_url = spotify_url.asInstanceOf[js.Any], starred = starred.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackInfo]
  }
  @scala.inline
  implicit class TrackInfoOps[Self <: TrackInfo] (val x: Self) extends AnyVal {
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
    def withAlbum_artist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtwork_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisc_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disc_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayed_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("played_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpotify_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotify_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

