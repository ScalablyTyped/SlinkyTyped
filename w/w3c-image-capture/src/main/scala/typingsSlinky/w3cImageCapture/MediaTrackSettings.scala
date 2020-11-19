package typingsSlinky.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackSettings extends js.Object {
  
  var brightness: Double = js.native
  
  var colorTemperature: Double = js.native
  
  var contrast: Double = js.native
  
  var exposureCompensation: Double = js.native
  
  var exposureMode: MeteringMode = js.native
  
  var focusDistance: Double = js.native
  
  var focusMode: MeteringMode = js.native
  
  var iso: Double = js.native
  
  var pointsOfInterest: js.Array[Point2D] = js.native
  
  var saturation: Double = js.native
  
  var sharpness: Double = js.native
  
  var torch: Boolean = js.native
  
  var whiteBalanceMode: MeteringMode = js.native
  
  var zoom: Double = js.native
}
object MediaTrackSettings {
  
  @scala.inline
  def apply(
    brightness: Double,
    colorTemperature: Double,
    contrast: Double,
    exposureCompensation: Double,
    exposureMode: MeteringMode,
    focusDistance: Double,
    focusMode: MeteringMode,
    iso: Double,
    pointsOfInterest: js.Array[Point2D],
    saturation: Double,
    sharpness: Double,
    torch: Boolean,
    whiteBalanceMode: MeteringMode,
    zoom: Double
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], pointsOfInterest = pointsOfInterest.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
  
  @scala.inline
  implicit class MediaTrackSettingsOps[Self <: MediaTrackSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrightness(value: Double): Self = this.set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTemperature(value: Double): Self = this.set("colorTemperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensation(value: Double): Self = this.set("exposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureMode(value: MeteringMode): Self = this.set("exposureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusDistance(value: Double): Self = this.set("focusDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusMode(value: MeteringMode): Self = this.set("focusMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso(value: Double): Self = this.set("iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsOfInterestVarargs(value: Point2D*): Self = this.set("pointsOfInterest", js.Array(value :_*))
    
    @scala.inline
    def setPointsOfInterest(value: js.Array[Point2D]): Self = this.set("pointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpness(value: Double): Self = this.set("sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorch(value: Boolean): Self = this.set("torch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalanceMode(value: MeteringMode): Self = this.set("whiteBalanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
