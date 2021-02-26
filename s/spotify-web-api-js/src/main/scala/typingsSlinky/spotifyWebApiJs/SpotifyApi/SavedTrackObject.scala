package typingsSlinky.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-track-object)
  */
@js.native
trait SavedTrackObject extends StObject {
  
  var added_at: String = js.native
  
  var track: TrackObjectFull = js.native
}
object SavedTrackObject {
  
  @scala.inline
  def apply(added_at: String, track: TrackObjectFull): SavedTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedTrackObject]
  }
  
  @scala.inline
  implicit class SavedTrackObjectMutableBuilder[Self <: SavedTrackObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded_at(value: String): Self = StObject.set(x, "added_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: TrackObjectFull): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
