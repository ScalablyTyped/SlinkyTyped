package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDataChannelEventMap extends StObject {
  
  var bufferedamountlow: org.scalajs.dom.raw.Event = js.native
  
  var close: org.scalajs.dom.raw.Event = js.native
  
  var error: RTCErrorEvent = js.native
  
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  
  var open: org.scalajs.dom.raw.Event = js.native
}
object RTCDataChannelEventMap {
  
  @scala.inline
  def apply(
    bufferedamountlow: org.scalajs.dom.raw.Event,
    close: org.scalajs.dom.raw.Event,
    error: RTCErrorEvent,
    message: org.scalajs.dom.raw.MessageEvent,
    open: org.scalajs.dom.raw.Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  
  @scala.inline
  implicit class RTCDataChannelEventMapMutableBuilder[Self <: RTCDataChannelEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferedamountlow(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "bufferedamountlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: RTCErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
