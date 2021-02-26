package typingsSlinky.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get an Artist’s Top Tracks
  *
  * GET /v1/artists/{id}/top-tracks
  * https://developer.spotify.com/web-api/get-artists-top-tracks/
  */
@js.native
trait ArtistsTopTracksResponse extends StObject {
  
  var tracks: js.Array[TrackObjectFull] = js.native
}
object ArtistsTopTracksResponse {
  
  @scala.inline
  def apply(tracks: js.Array[TrackObjectFull]): ArtistsTopTracksResponse = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistsTopTracksResponse]
  }
  
  @scala.inline
  implicit class ArtistsTopTracksResponseMutableBuilder[Self <: ArtistsTopTracksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: js.Array[TrackObjectFull]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: TrackObjectFull*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
