package typingsSlinky.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets the capabilities of a camera setting. */
@js.native
trait MediaDeviceControlCapabilities extends StObject {
  
  /** Gets the default value of the camera setting. */
  var default: Double = js.native
  
  /** Queries whether the camera supports automatic adjustment of the setting. */
  var autoModeSupported: Boolean = js.native
  
  /** Sets the maximum value of the camera setting. */
  var max: Double = js.native
  
  /** Gets the minimum value of the camera setting. */
  var min: Double = js.native
  
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  var step: Double = js.native
  
  /** Indicates whether the camera supports this camera setting. */
  var supported: Boolean = js.native
}
object MediaDeviceControlCapabilities {
  
  @scala.inline
  def apply(
    autoModeSupported: Boolean,
    default: Double,
    max: Double,
    min: Double,
    step: Double,
    supported: Boolean
  ): MediaDeviceControlCapabilities = {
    val __obj = js.Dynamic.literal(autoModeSupported = autoModeSupported.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDeviceControlCapabilities]
  }
  
  @scala.inline
  implicit class MediaDeviceControlCapabilitiesMutableBuilder[Self <: MediaDeviceControlCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoModeSupported(value: Boolean): Self = StObject.set(x, "autoModeSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
