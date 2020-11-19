package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackSupportedConstraints extends js.Object {
  
  var aspectRatio: js.UndefOr[scala.Boolean] = js.native
  
  var autoGainControl: js.UndefOr[scala.Boolean] = js.native
  
  var channelCount: js.UndefOr[scala.Boolean] = js.native
  
  var deviceId: js.UndefOr[scala.Boolean] = js.native
  
  var echoCancellation: js.UndefOr[scala.Boolean] = js.native
  
  var facingMode: js.UndefOr[scala.Boolean] = js.native
  
  var frameRate: js.UndefOr[scala.Boolean] = js.native
  
  var groupId: js.UndefOr[scala.Boolean] = js.native
  
  var height: js.UndefOr[scala.Boolean] = js.native
  
  var latency: js.UndefOr[scala.Boolean] = js.native
  
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.native
  
  var resizeMode: js.UndefOr[scala.Boolean] = js.native
  
  var sampleRate: js.UndefOr[scala.Boolean] = js.native
  
  var sampleSize: js.UndefOr[scala.Boolean] = js.native
  
  var width: js.UndefOr[scala.Boolean] = js.native
}
object MediaTrackSupportedConstraints {
  
  @scala.inline
  def apply(): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
  
  @scala.inline
  implicit class MediaTrackSupportedConstraintsOps[Self <: org.scalajs.dom.experimental.mediastream.MediaTrackSupportedConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAspectRatio(value: scala.Boolean): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControl(value: scala.Boolean): Self = this.set("autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGainControl: Self = this.set("autoGainControl", js.undefined)
    
    @scala.inline
    def setChannelCount(value: scala.Boolean): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    
    @scala.inline
    def setDeviceId(value: scala.Boolean): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: scala.Boolean): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoCancellation: Self = this.set("echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingMode(value: scala.Boolean): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: scala.Boolean): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: scala.Boolean): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: scala.Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLatency(value: scala.Boolean): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setNoiseSuppression(value: scala.Boolean): Self = this.set("noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoiseSuppression: Self = this.set("noiseSuppression", js.undefined)
    
    @scala.inline
    def setResizeMode(value: scala.Boolean): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: scala.Boolean): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: scala.Boolean): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: scala.Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
