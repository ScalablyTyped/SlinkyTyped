package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamTrackAudioSourceOptions extends StObject {
  
  var mediaStreamTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
}
object MediaStreamTrackAudioSourceOptions {
  
  @scala.inline
  def apply(mediaStreamTrack: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): MediaStreamTrackAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStreamTrack = mediaStreamTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MediaStreamTrackAudioSourceOptionsMutableBuilder[Self <: MediaStreamTrackAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStreamTrack(value: org.scalajs.dom.experimental.mediastream.MediaStreamTrack): Self = StObject.set(x, "mediaStreamTrack", value.asInstanceOf[js.Any])
  }
}
