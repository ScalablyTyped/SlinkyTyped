package typingsSlinky.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a hardware key is pressed in the view.
  */
@js.native
trait ScrollableViewKeypressedEvent extends ScrollableViewBaseEvent {
  
  /**
    * The code for the physical key that was pressed. For more details, see [KeyEvent](https://developer.android.com/reference/android/view/KeyEvent.html). This API is experimental and subject to change.
    */
  var keyCode: Double = js.native
}
object ScrollableViewKeypressedEvent {
  
  @scala.inline
  def apply(keyCode: Double, source: ScrollableView): ScrollableViewKeypressedEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollableViewKeypressedEvent]
  }
  
  @scala.inline
  implicit class ScrollableViewKeypressedEventMutableBuilder[Self <: ScrollableViewKeypressedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
  }
}
