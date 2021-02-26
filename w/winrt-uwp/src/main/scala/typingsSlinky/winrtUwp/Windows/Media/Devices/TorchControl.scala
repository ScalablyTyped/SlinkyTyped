package typingsSlinky.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the torch LED settings on a capture device. */
@js.native
trait TorchControl extends StObject {
  
  /** Gets or sets a value that enables and disables the torch LED on the device. */
  var enabled: Boolean = js.native
  
  /** Gets or sets the intensity of the torch LED. */
  var powerPercent: Double = js.native
  
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean = js.native
  
  /** Gets a value that specifies if the capture device supports the torch control. */
  var supported: Boolean = js.native
}
object TorchControl {
  
  @scala.inline
  def apply(enabled: Boolean, powerPercent: Double, powerSupported: Boolean, supported: Boolean): TorchControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], powerSupported = powerSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorchControl]
  }
  
  @scala.inline
  implicit class TorchControlMutableBuilder[Self <: TorchControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPercent(value: Double): Self = StObject.set(x, "powerPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSupported(value: Boolean): Self = StObject.set(x, "powerSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
