package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCXMLEventMeta[TEvent /* <: EventObject */] extends js.Object {
  
  var _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent] = js.native
}
object SCXMLEventMeta {
  
  @scala.inline
  def apply[TEvent /* <: EventObject */](_event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): SCXMLEventMeta[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCXMLEventMeta[TEvent]]
  }
  
  @scala.inline
  implicit class SCXMLEventMetaOps[Self <: SCXMLEventMeta[_], TEvent /* <: EventObject */] (val x: Self with SCXMLEventMeta[TEvent]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_event(value: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent]): Self = this.set("_event", value.asInstanceOf[js.Any])
  }
}
