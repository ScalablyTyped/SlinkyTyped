package typingsSlinky.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the settings for a frame in a variable photo sequence. */
@js.native
trait FrameController extends StObject {
  
  /** Gets the exposure compensation settings for a frame in a variable photo sequence. */
  var exposureCompensationControl: FrameExposureCompensationControl = js.native
  
  /** Gets the exposure settings for a frame in a variable photo sequence. */
  var exposureControl: FrameExposureControl = js.native
  
  /** Gets the flash settings for a frame in a variable photo sequence. */
  var flashControl: FrameFlashControl = js.native
  
  /** Gets the focus settings for a frame in a variable photo sequence. */
  var focusControl: FrameFocusControl = js.native
  
  /** Gets the ISO speed settings for a frame in a variable photo sequence. */
  var isoSpeedControl: FrameIsoSpeedControl = js.native
  
  /** Gets or sets whether photo confirmation is enabled for a frame in a variable photo sequence. */
  var photoConfirmationEnabled: Boolean = js.native
}
object FrameController {
  
  @scala.inline
  def apply(
    exposureCompensationControl: FrameExposureCompensationControl,
    exposureControl: FrameExposureControl,
    flashControl: FrameFlashControl,
    focusControl: FrameFocusControl,
    isoSpeedControl: FrameIsoSpeedControl,
    photoConfirmationEnabled: Boolean
  ): FrameController = {
    val __obj = js.Dynamic.literal(exposureCompensationControl = exposureCompensationControl.asInstanceOf[js.Any], exposureControl = exposureControl.asInstanceOf[js.Any], flashControl = flashControl.asInstanceOf[js.Any], focusControl = focusControl.asInstanceOf[js.Any], isoSpeedControl = isoSpeedControl.asInstanceOf[js.Any], photoConfirmationEnabled = photoConfirmationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameController]
  }
  
  @scala.inline
  implicit class FrameControllerMutableBuilder[Self <: FrameController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExposureCompensationControl(value: FrameExposureCompensationControl): Self = StObject.set(x, "exposureCompensationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureControl(value: FrameExposureControl): Self = StObject.set(x, "exposureControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashControl(value: FrameFlashControl): Self = StObject.set(x, "flashControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusControl(value: FrameFocusControl): Self = StObject.set(x, "focusControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoSpeedControl(value: FrameIsoSpeedControl): Self = StObject.set(x, "isoSpeedControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoConfirmationEnabled(value: Boolean): Self = StObject.set(x, "photoConfirmationEnabled", value.asInstanceOf[js.Any])
  }
}
