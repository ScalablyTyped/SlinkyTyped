package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** When supported, allows an app to enable optical image stabilization on the capture device. */
@js.native
trait OpticalImageStabilizationControl extends StObject {
  
  /** Gets or sets a value indicating the current optical image stabilization mode of the capture device. */
  var mode: OpticalImageStabilizationMode = js.native
  
  /** Gets a value that indicates if the capture device supports the OpticalImageStabilizationControl . */
  var supported: Boolean = js.native
  
  /** Gets the list of OpticalImageStabilizationMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[OpticalImageStabilizationMode] = js.native
}
object OpticalImageStabilizationControl {
  
  @scala.inline
  def apply(
    mode: OpticalImageStabilizationMode,
    supported: Boolean,
    supportedModes: IVectorView[OpticalImageStabilizationMode]
  ): OpticalImageStabilizationControl = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpticalImageStabilizationControl]
  }
  
  @scala.inline
  implicit class OpticalImageStabilizationControlMutableBuilder[Self <: OpticalImageStabilizationControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: OpticalImageStabilizationMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModes(value: IVectorView[OpticalImageStabilizationMode]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
  }
}
