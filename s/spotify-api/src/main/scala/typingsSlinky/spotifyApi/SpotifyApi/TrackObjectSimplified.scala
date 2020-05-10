package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait TrackObjectSimplified extends js.Object {
  /**
    * The artists who performed the track.
    */
  var artists: js.Array[ArtistObjectSimplified] = js.native
  /**
    * A list of the countries in which the track can be played,
    * identified by their [ISO 3166-1 alpha-2 code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    */
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  /**
    * The disc number (usually `1` unless the album consists of more than one disc).
    */
  var disc_number: Double = js.native
  /**
    * The track length in milliseconds.
    */
  var duration_ms: Double = js.native
  /**
    * Whether or not the track has explicit lyrics (`true` = yes it does; `false` = no it does not OR unknown).
    */
  var explicit: Boolean = js.native
  /**
    * Known external URLs for this track.
    */
  var external_urls: ExternalUrlObject = js.native
  /**
    * A link to the Web API endpoint providing full details of the track.
    */
  var href: String = js.native
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the track.
    */
  var id: String = js.native
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied.
    * If `true`, the track is playable in the given market. Otherwise, `false`.
    */
  var is_playable: js.UndefOr[Boolean] = js.native
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * and the requested track has been replaced with different track.
    * The track in the `linked_from` object contains information about the originally requested track.
    */
  var linked_from: js.UndefOr[TrackLinkObject] = js.native
  /**
    * The name of the track.
    */
  var name: String = js.native
  /**
    * A link to a 30 second preview (MP3 format) of the track. Can be null
    */
  var preview_url: String | Null = js.native
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * the original track is not available in the given market, and Spotify did not have any tracks to relink it with.
    * The track response will still contain metadata for the original track, and a restrictions object containing the reason
    * why the track is not available: `"restrictions" : {"reason" : "market"}`.
    */
  var restrictions: js.UndefOr[RestrictionsObject] = js.native
  /**
    * The number of the track. If an album has several discs, the track number is the number on the specified disc.
    */
  var track_number: Double = js.native
  /**
    * The object type: “track”.
    */
  var `type`: track = js.native
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the track.
    */
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
    track_number: Double,
    `type`: track,
    uri: String
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
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
    @scala.inline
    def withPreview_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview_urlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview_url")(null)
        ret
    }
    @scala.inline
    def withRestrictions(value: RestrictionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
  }
  
}

