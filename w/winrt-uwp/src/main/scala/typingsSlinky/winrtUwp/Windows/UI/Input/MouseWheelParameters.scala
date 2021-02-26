package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties associated with the button wheel of a mouse device. */
@js.native
trait MouseWheelParameters extends StObject {
  
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  var charTranslation: Point = js.native
  
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  var deltaRotationAngle: Double = js.native
  
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  var deltaScale: Double = js.native
  
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  var pageTranslation: Point = js.native
}
object MouseWheelParameters {
  
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): MouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelParameters]
  }
  
  @scala.inline
  implicit class MouseWheelParametersMutableBuilder[Self <: MouseWheelParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharTranslation(value: Point): Self = StObject.set(x, "charTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaRotationAngle(value: Double): Self = StObject.set(x, "deltaRotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaScale(value: Double): Self = StObject.set(x, "deltaScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTranslation(value: Point): Self = StObject.set(x, "pageTranslation", value.asInstanceOf[js.Any])
  }
}
