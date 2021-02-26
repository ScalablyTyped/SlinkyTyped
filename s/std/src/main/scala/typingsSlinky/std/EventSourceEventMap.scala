package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceEventMap extends StObject {
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  
  var open: org.scalajs.dom.raw.Event = js.native
}
object EventSourceEventMap {
  
  @scala.inline
  def apply(
    error: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    open: org.scalajs.dom.raw.Event
  ): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceEventMap]
  }
  
  @scala.inline
  implicit class EventSourceEventMapMutableBuilder[Self <: EventSourceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
