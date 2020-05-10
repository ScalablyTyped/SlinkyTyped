package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.album
import typingsSlinky.spotifyApi.spotifyApiStrings.appears_on
import typingsSlinky.spotifyApi.spotifyApiStrings.compilation
import typingsSlinky.spotifyApi.spotifyApiStrings.day
import typingsSlinky.spotifyApi.spotifyApiStrings.month
import typingsSlinky.spotifyApi.spotifyApiStrings.single
import typingsSlinky.spotifyApi.spotifyApiStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Album Object
  * [album object (simplified)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
@js.native
trait AlbumObjectSimplified extends ContextObject {
  /**
    * The field is present when getting an artist’s albums.
    * Possible values are “album”, “single”, “compilation”, “appears_on”.
    * Compare to album_type this field represents relationship between the artist and the album.
    */
  var album_group: js.UndefOr[album | single | compilation | appears_on] = js.native
  /**
    * The type of the album: one of “album”, “single”, or “compilation”.
    */
  var album_type: album | single | compilation = js.native
  /**
    * The artists of the album.
    * Each artist object includes a link in href to more detailed information about the artist.
    */
  var artists: js.Array[ArtistObjectSimplified] = js.native
  /**
    * The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    * Note that an album is considered available in a market when at least 1 of its tracks is available in that market.
    */
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the album.
    */
  var id: String = js.native
  /**
    * The cover art for the album in various sizes, widest first.
    */
  var images: js.Array[ImageObject] = js.native
  /**
    * The name of the album. In case of an album takedown, the value may be an empty string.
    */
  var name: String = js.native
  /**
    * The date the album was first released, for example `1981`.
    * Depending on the precision, it might be shown as `1981-12` or `1981-12-15`.
    */
  var release_date: String = js.native
  /**
    * The precision with which release_date value is known: `year`, `month`, or `day`.
    */
  var release_date_precision: year | month | day = js.native
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * the original track is not available in the given market, and Spotify did not have any tracks to relink it with.
    * The track response will still contain metadata for the original track,
    * and a restrictions object containing the reason why the track is not available: `"restrictions" : {"reason" : "market"}`
    */
  var restrictions: js.UndefOr[RestrictionsObject] = js.native
  @JSName("type")
  var type_AlbumObjectSimplified: album = js.native
}

object AlbumObjectSimplified {
  @scala.inline
  def apply(
    album_type: album | single | compilation,
    artists: js.Array[ArtistObjectSimplified],
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    release_date: String,
    release_date_precision: year | month | day,
    `type`: album,
    uri: String
  ): AlbumObjectSimplified = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumObjectSimplified]
  }
  @scala.inline
  implicit class AlbumObjectSimplifiedOps[Self <: AlbumObjectSimplified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum_type(value: album | single | compilation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtists(value: js.Array[ArtistObjectSimplified]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[ImageObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date_precision(value: year | month | day): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date_precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: album): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlbum_group(value: album | single | compilation | appears_on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbum_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album_group")(js.undefined)
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

