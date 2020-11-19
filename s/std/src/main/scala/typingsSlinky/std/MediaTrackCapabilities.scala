package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackCapabilities extends js.Object {
  
  var aspectRatio: js.UndefOr[DoubleRange] = js.native
  
  var autoGainControl: js.UndefOr[js.Array[scala.Boolean]] = js.native
  
  var channelCount: js.UndefOr[ULongRange] = js.native
  
  var deviceId: js.UndefOr[java.lang.String] = js.native
  
  var echoCancellation: js.UndefOr[js.Array[scala.Boolean]] = js.native
  
  var facingMode: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var frameRate: js.UndefOr[DoubleRange] = js.native
  
  var groupId: js.UndefOr[java.lang.String] = js.native
  
  var height: js.UndefOr[ULongRange] = js.native
  
  var latency: js.UndefOr[DoubleRange] = js.native
  
  var noiseSuppression: js.UndefOr[js.Array[scala.Boolean]] = js.native
  
  var resizeMode: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var sampleRate: js.UndefOr[ULongRange] = js.native
  
  var sampleSize: js.UndefOr[ULongRange] = js.native
  
  var width: js.UndefOr[ULongRange] = js.native
}
object MediaTrackCapabilities {
  
  @scala.inline
  def apply(): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  
  @scala.inline
  implicit class MediaTrackCapabilitiesOps[Self <: MediaTrackCapabilities] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: DoubleRange): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControlVarargs(value: scala.Boolean*): Self = this.set("autoGainControl", js.Array(value :_*))
    
    @scala.inline
    def setAutoGainControl(value: js.Array[scala.Boolean]): Self = this.set("autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGainControl: Self = this.set("autoGainControl", js.undefined)
    
    @scala.inline
    def setChannelCount(value: ULongRange): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setEchoCancellationVarargs(value: scala.Boolean*): Self = this.set("echoCancellation", js.Array(value :_*))
    
    @scala.inline
    def setEchoCancellation(value: js.Array[scala.Boolean]): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoCancellation: Self = this.set("echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingModeVarargs(value: java.lang.String*): Self = this.set("facingMode", js.Array(value :_*))
    
    @scala.inline
    def setFacingMode(value: js.Array[java.lang.String]): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: DoubleRange): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: java.lang.String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: ULongRange): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLatency(value: DoubleRange): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setNoiseSuppressionVarargs(value: scala.Boolean*): Self = this.set("noiseSuppression", js.Array(value :_*))
    
    @scala.inline
    def setNoiseSuppression(value: js.Array[scala.Boolean]): Self = this.set("noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoiseSuppression: Self = this.set("noiseSuppression", js.undefined)
    
    @scala.inline
    def setResizeModeVarargs(value: java.lang.String*): Self = this.set("resizeMode", js.Array(value :_*))
    
    @scala.inline
    def setResizeMode(value: js.Array[java.lang.String]): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: ULongRange): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: ULongRange): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: ULongRange): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
