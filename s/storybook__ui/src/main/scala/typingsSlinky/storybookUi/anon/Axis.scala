package typingsSlinky.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axis extends StObject {
  
  var axis: typingsSlinky.storybookUi.draggersMod.Axis = js.native
  
  var isDragging: Boolean = js.native
}
object Axis {
  
  @scala.inline
  def apply(axis: typingsSlinky.storybookUi.draggersMod.Axis, isDragging: Boolean): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisMutableBuilder[Self <: Axis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: typingsSlinky.storybookUi.draggersMod.Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
  }
}
