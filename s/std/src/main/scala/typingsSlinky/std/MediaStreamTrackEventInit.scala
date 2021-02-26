package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackEventInit extends EventInit {
  
  var track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
}
object MediaStreamTrackEventInit {
  
  @scala.inline
  def apply(track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): org.scalajs.dom.experimental.mediastream.MediaStreamTrackEventInit = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.experimental.mediastream.MediaStreamTrackEventInit]
  }
  
  @scala.inline
  implicit class MediaStreamTrackEventInitMutableBuilder[Self <: org.scalajs.dom.experimental.mediastream.MediaStreamTrackEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
