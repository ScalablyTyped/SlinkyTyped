package typingsSlinky.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for a playlist
  * 
  * GET /v1/search?type=playlist
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait PlaylistSearchResponse extends StObject {
  
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}
object PlaylistSearchResponse {
  
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): PlaylistSearchResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSearchResponse]
  }
  
  @scala.inline
  implicit class PlaylistSearchResponseMutableBuilder[Self <: PlaylistSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
