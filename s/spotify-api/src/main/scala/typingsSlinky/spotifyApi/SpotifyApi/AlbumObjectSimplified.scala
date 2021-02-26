package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.album
import typingsSlinky.spotifyApi.spotifyApiStrings.appears_on
import typingsSlinky.spotifyApi.spotifyApiStrings.compilation
import typingsSlinky.spotifyApi.spotifyApiStrings.day
import typingsSlinky.spotifyApi.spotifyApiStrings.month
import typingsSlinky.spotifyApi.spotifyApiStrings.single
import typingsSlinky.spotifyApi.spotifyApiStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class AlbumObjectSimplifiedMutableBuilder[Self <: AlbumObjectSimplified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum_group(value: album | single | compilation | appears_on): Self = StObject.set(x, "album_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbum_groupUndefined: Self = StObject.set(x, "album_group", js.undefined)
    
    @scala.inline
    def setAlbum_type(value: album | single | compilation): Self = StObject.set(x, "album_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtists(value: js.Array[ArtistObjectSimplified]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistsVarargs(value: ArtistObjectSimplified*): Self = StObject.set(x, "artists", js.Array(value :_*))
    
    @scala.inline
    def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_marketsUndefined: Self = StObject.set(x, "available_markets", js.undefined)
    
    @scala.inline
    def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date(value: String): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_date_precision(value: year | month | day): Self = StObject.set(x, "release_date_precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictions(value: RestrictionsObject): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setType(value: album): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
