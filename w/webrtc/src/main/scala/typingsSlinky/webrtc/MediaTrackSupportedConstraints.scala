package typingsSlinky.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackSupportedConstraints extends StObject {
  
  var aspectRatio: js.UndefOr[Boolean] = js.native
  
  var deviceId: js.UndefOr[Boolean] = js.native
  
  var echoCancellation: js.UndefOr[Boolean] = js.native
  
  var facingMode: js.UndefOr[Boolean] = js.native
  
  var frameRate: js.UndefOr[Boolean] = js.native
  
  var groupId: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Boolean] = js.native
  
  var latency: js.UndefOr[Boolean] = js.native
  
  var sampleRate: js.UndefOr[Boolean] = js.native
  
  var sampleSize: js.UndefOr[Boolean] = js.native
  
  var volume: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Boolean] = js.native
}
object MediaTrackSupportedConstraints {
  
  @scala.inline
  def apply(): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
  
  @scala.inline
  implicit class MediaTrackSupportedConstraintsMutableBuilder[Self <: MediaTrackSupportedConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Boolean): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setDeviceId(value: Boolean): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingMode(value: Boolean): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Boolean): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: Boolean): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatency(value: Boolean): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Boolean): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: Boolean): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setVolume(value: Boolean): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
