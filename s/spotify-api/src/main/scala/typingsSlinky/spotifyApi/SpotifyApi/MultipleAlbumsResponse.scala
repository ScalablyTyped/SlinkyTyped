package typingsSlinky.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get Several Albums
  * 
  * GET /v1/albums?ids={ids}
  * https://developer.spotify.com/web-api/get-several-albums/ 
  */
@js.native
trait MultipleAlbumsResponse extends StObject {
  
  var albums: js.Array[AlbumObjectFull] = js.native
}
object MultipleAlbumsResponse {
  
  @scala.inline
  def apply(albums: js.Array[AlbumObjectFull]): MultipleAlbumsResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleAlbumsResponse]
  }
  
  @scala.inline
  implicit class MultipleAlbumsResponseMutableBuilder[Self <: MultipleAlbumsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbums(value: js.Array[AlbumObjectFull]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumsVarargs(value: AlbumObjectFull*): Self = StObject.set(x, "albums", js.Array(value :_*))
  }
}
