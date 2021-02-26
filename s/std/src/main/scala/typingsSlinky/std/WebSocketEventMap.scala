package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketEventMap extends StObject {
  
  var close: org.scalajs.dom.raw.CloseEvent = js.native
  
  var error: org.scalajs.dom.raw.Event = js.native
  
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  
  var open: org.scalajs.dom.raw.Event = js.native
}
object WebSocketEventMap {
  
  @scala.inline
  def apply(
    close: org.scalajs.dom.raw.CloseEvent,
    error: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    open: org.scalajs.dom.raw.Event
  ): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  
  @scala.inline
  implicit class WebSocketEventMapMutableBuilder[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
