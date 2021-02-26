package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Holding event. */
@js.native
trait HoldingEventArgs extends StObject {
  
  /** Gets the state of the Holding event. */
  var holdingState: HoldingState = js.native
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point = js.native
}
object HoldingEventArgs {
  
  @scala.inline
  def apply(holdingState: HoldingState, pointerDeviceType: PointerDeviceType, position: Point): HoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldingEventArgs]
  }
  
  @scala.inline
  implicit class HoldingEventArgsMutableBuilder[Self <: HoldingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoldingState(value: HoldingState): Self = StObject.set(x, "holdingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
