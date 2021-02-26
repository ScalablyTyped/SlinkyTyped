package typingsSlinky.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get a categorys playlists
  * 
  * GET /v1/browse/categories/{id}/playlists
  * https://developer.spotify.com/web-api/get-categorys-playlists/
  */
@js.native
trait CategoryPlaylistsReponse extends StObject {
  
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}
object CategoryPlaylistsReponse {
  
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): CategoryPlaylistsReponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryPlaylistsReponse]
  }
  
  @scala.inline
  implicit class CategoryPlaylistsReponseMutableBuilder[Self <: CategoryPlaylistsReponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
  }
}
