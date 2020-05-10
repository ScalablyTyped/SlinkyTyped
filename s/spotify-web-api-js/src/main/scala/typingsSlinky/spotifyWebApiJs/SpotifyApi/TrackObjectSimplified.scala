package typingsSlinky.spotifyWebApiJs.SpotifyApi

import typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait TrackObjectSimplified extends js.Object {
  var artists: js.Array[ArtistObjectSimplified] = js.native
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  var disc_number: Double = js.native
  var duration_ms: Double = js.native
  var explicit: Boolean = js.native
  var external_urls: ExternalUrlObject = js.native
  var href: String = js.native
  var id: String = js.native
  var is_playable: js.UndefOr[Boolean] = js.native
  var linked_from: js.UndefOr[TrackLinkObject] = js.native
  var name: String = js.native
  var preview_url: String = js.native
  var track_number: Double = js.native
  var `type`: track = js.native
  var uri: String = js.native
}

object TrackObjectSimplified {
  @scala.inline
  def apply(
    artists: js.Array[ArtistObjectSimplified],
    disc_number: Double,
    duration_ms: Double,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    preview_url: String,
    track_number: Double,
    `type`: track,
    uri: String
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_url = preview_url.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectSimplified]
  }
  @scala.inline
  implicit class TrackObjectSimplifiedOps[Self <: TrackObjectSimplified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtists(value: js.Array[ArtistObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisc_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disc_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExplicit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_urls(value: ExternalUrlObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
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
    def withPreview_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: track): Self = {
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
    def withAvailable_markets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available_markets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailable_markets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available_markets")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_playable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_playable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_playable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_playable")(js.undefined)
        ret
    }
    @scala.inline
    def withLinked_from(value: TrackLinkObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linked_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinked_from: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linked_from")(js.undefined)
        ret
    }
  }
  
}

