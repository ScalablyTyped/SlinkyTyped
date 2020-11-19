package typingsSlinky.workboxWindow.workboxEventMapMod

import org.scalajs.dom.raw.Event
import typingsSlinky.workboxWindow.workboxEventMod.WorkboxEvent
import typingsSlinky.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkboxMessageEvent extends WorkboxEvent {
  
  val data: js.Any = js.native
}
object WorkboxMessageEvent {
  
  @scala.inline
  def apply(data: js.Any, originalEvent: Event, target: Workbox, `type`: String): WorkboxMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxMessageEvent]
  }
  
  @scala.inline
  implicit class WorkboxMessageEventOps[Self <: WorkboxMessageEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
