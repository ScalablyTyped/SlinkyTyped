package typingsSlinky.spotifyWebApiJs.SpotifyApi

import typingsSlinky.spotifyWebApiJs.spotifyWebApiJsStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait TrackObjectSimplified extends StObject {
  
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
  implicit class TrackObjectSimplifiedMutableBuilder[Self <: TrackObjectSimplified] (val x: Self) extends AnyVal {
    
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
    def setDisc_number(value: Double): Self = StObject.set(x, "disc_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playable(value: Boolean): Self = StObject.set(x, "is_playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_playableUndefined: Self = StObject.set(x, "is_playable", js.undefined)
    
    @scala.inline
    def setLinked_from(value: TrackLinkObject): Self = StObject.set(x, "linked_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinked_fromUndefined: Self = StObject.set(x, "linked_from", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_url(value: String): Self = StObject.set(x, "preview_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack_number(value: Double): Self = StObject.set(x, "track_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: track): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
