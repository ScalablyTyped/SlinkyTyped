package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamAudioSourceOptions extends StObject {
  
  var mediaStream: org.scalajs.dom.experimental.mediastream.MediaStream = js.native
}
object MediaStreamAudioSourceOptions {
  
  @scala.inline
  def apply(mediaStream: org.scalajs.dom.experimental.mediastream.MediaStream): MediaStreamAudioSourceOptions = {
    val __obj = js.Dynamic.literal(mediaStream = mediaStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamAudioSourceOptions]
  }
  
  @scala.inline
  implicit class MediaStreamAudioSourceOptionsMutableBuilder[Self <: MediaStreamAudioSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaStream(value: org.scalajs.dom.experimental.mediastream.MediaStream): Self = StObject.set(x, "mediaStream", value.asInstanceOf[js.Any])
  }
}
