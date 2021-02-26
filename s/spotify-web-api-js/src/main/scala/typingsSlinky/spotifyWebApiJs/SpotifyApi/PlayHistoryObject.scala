package typingsSlinky.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Play History Object
  * [](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/#play-history-object)
  */
@js.native
trait PlayHistoryObject extends StObject {
  
  var context: ContextObject = js.native
  
  var played_at: String = js.native
  
  var track: TrackObjectSimplified = js.native
}
object PlayHistoryObject {
  
  @scala.inline
  def apply(context: ContextObject, played_at: String, track: TrackObjectSimplified): PlayHistoryObject = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], played_at = played_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayHistoryObject]
  }
  
  @scala.inline
  implicit class PlayHistoryObjectMutableBuilder[Self <: PlayHistoryObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: ContextObject): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayed_at(value: String): Self = StObject.set(x, "played_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: TrackObjectSimplified): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
