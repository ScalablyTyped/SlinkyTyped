package typingsSlinky.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a long press.
  */
@js.native
trait SplitWindowLongpressEvent extends SplitWindowBaseEvent {
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object SplitWindowLongpressEvent {
  
  @scala.inline
  def apply(source: SplitWindow, x: Double, y: Double): SplitWindowLongpressEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitWindowLongpressEvent]
  }
  
  @scala.inline
  implicit class SplitWindowLongpressEventMutableBuilder[Self <: SplitWindowLongpressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
