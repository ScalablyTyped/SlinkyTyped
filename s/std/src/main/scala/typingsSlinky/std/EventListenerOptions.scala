package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListenerOptions extends StObject {
  
  var capture: js.UndefOr[scala.Boolean] = js.native
}
object EventListenerOptions {
  
  @scala.inline
  def apply(): org.scalajs.dom.raw.EventListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.raw.EventListenerOptions]
  }
  
  @scala.inline
  implicit class EventListenerOptionsMutableBuilder[Self <: org.scalajs.dom.raw.EventListenerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: scala.Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
  }
}
