package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceEventMap extends js.Object {
  
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
  implicit class EventSourceEventMapOps[Self <: EventSourceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: org.scalajs.dom.raw.Event): Self = this.set("open", value.asInstanceOf[js.Any])
  }
}
