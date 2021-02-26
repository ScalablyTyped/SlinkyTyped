package typingsSlinky.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackButtonOptions extends MenuButtonOptions {
  
  var track: js.Array[Track] = js.native
}
object TrackButtonOptions {
  
  @scala.inline
  def apply(track: js.Array[Track]): TrackButtonOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackButtonOptions]
  }
  
  @scala.inline
  implicit class TrackButtonOptionsMutableBuilder[Self <: TrackButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: js.Array[Track]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackVarargs(value: Track*): Self = StObject.set(x, "track", js.Array(value :_*))
  }
}
