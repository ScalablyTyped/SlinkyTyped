package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManipulationInertiaStartingEventArgs extends StObject {
  
  var cumulative: ManipulationDelta = js.native
  
  var delta: ManipulationDelta = js.native
  
  var pointerDeviceType: PointerDeviceType = js.native
  
  var position: Point = js.native
  
  var velocities: ManipulationVelocities = js.native
}
object IManipulationInertiaStartingEventArgs {
  
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationInertiaStartingEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManipulationInertiaStartingEventArgs]
  }
  
  @scala.inline
  implicit class IManipulationInertiaStartingEventArgsMutableBuilder[Self <: IManipulationInertiaStartingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCumulative(value: ManipulationDelta): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: ManipulationDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocities(value: ManipulationVelocities): Self = StObject.set(x, "velocities", value.asInstanceOf[js.Any])
  }
}
