package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStreamConstraints extends StObject {
  
  var audio: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.native
  
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  
  var video: js.UndefOr[scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints] = js.native
}
object MediaStreamConstraints {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.mediastream.MediaStreamConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.mediastream.MediaStreamConstraints]
  }
  
  @scala.inline
  implicit class MediaStreamConstraintsMutableBuilder[Self <: org.scalajs.dom.experimental.mediastream.MediaStreamConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioMediaTrackConstraints(value: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    @scala.inline
    def setVideo(value: scala.Boolean | org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMediaTrackConstraints(value: org.scalajs.dom.experimental.mediastream.MediaTrackConstraints): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
