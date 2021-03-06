package typingsSlinky.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackCapabilities extends StObject {
  
  var brightness: MediaSettingsRange = js.native
  
  var colorTemperature: MediaSettingsRange = js.native
  
  var contrast: MediaSettingsRange = js.native
  
  var exposureCompensation: MediaSettingsRange = js.native
  
  var exposureMode: js.Array[MeteringMode] = js.native
  
  var focusDistance: MediaSettingsRange = js.native
  
  var focusMode: js.Array[MeteringMode] = js.native
  
  var iso: MediaSettingsRange = js.native
  
  var saturation: MediaSettingsRange = js.native
  
  var sharpness: MediaSettingsRange = js.native
  
  var torch: Boolean = js.native
  
  var whiteBalanceMode: js.Array[MeteringMode] = js.native
  
  var zoom: MediaSettingsRange = js.native
}
object MediaTrackCapabilities {
  
  @scala.inline
  def apply(
    brightness: MediaSettingsRange,
    colorTemperature: MediaSettingsRange,
    contrast: MediaSettingsRange,
    exposureCompensation: MediaSettingsRange,
    exposureMode: js.Array[MeteringMode],
    focusDistance: MediaSettingsRange,
    focusMode: js.Array[MeteringMode],
    iso: MediaSettingsRange,
    saturation: MediaSettingsRange,
    sharpness: MediaSettingsRange,
    torch: Boolean,
    whiteBalanceMode: js.Array[MeteringMode],
    zoom: MediaSettingsRange
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  
  @scala.inline
  implicit class MediaTrackCapabilitiesMutableBuilder[Self <: MediaTrackCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: MediaSettingsRange): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTemperature(value: MediaSettingsRange): Self = StObject.set(x, "colorTemperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: MediaSettingsRange): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensation(value: MediaSettingsRange): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureMode(value: js.Array[MeteringMode]): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureModeVarargs(value: MeteringMode*): Self = StObject.set(x, "exposureMode", js.Array(value :_*))
    
    @scala.inline
    def setFocusDistance(value: MediaSettingsRange): Self = StObject.set(x, "focusDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusMode(value: js.Array[MeteringMode]): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusModeVarargs(value: MeteringMode*): Self = StObject.set(x, "focusMode", js.Array(value :_*))
    
    @scala.inline
    def setIso(value: MediaSettingsRange): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: MediaSettingsRange): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpness(value: MediaSettingsRange): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorch(value: Boolean): Self = StObject.set(x, "torch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalanceMode(value: js.Array[MeteringMode]): Self = StObject.set(x, "whiteBalanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalanceModeVarargs(value: MeteringMode*): Self = StObject.set(x, "whiteBalanceMode", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: MediaSettingsRange): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
