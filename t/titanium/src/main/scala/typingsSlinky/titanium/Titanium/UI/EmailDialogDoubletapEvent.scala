package typingsSlinky.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a double tap against the view.
  */
@js.native
trait EmailDialogDoubletapEvent extends EmailDialogBaseEvent {
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object EmailDialogDoubletapEvent {
  
  @scala.inline
  def apply(source: EmailDialog, x: Double, y: Double): EmailDialogDoubletapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailDialogDoubletapEvent]
  }
  
  @scala.inline
  implicit class EmailDialogDoubletapEventMutableBuilder[Self <: EmailDialogDoubletapEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
