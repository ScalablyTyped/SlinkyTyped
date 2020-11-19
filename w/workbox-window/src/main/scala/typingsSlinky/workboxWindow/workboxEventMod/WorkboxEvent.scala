package typingsSlinky.workboxWindow.workboxEventMod

import org.scalajs.dom.raw.Event
import typingsSlinky.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkboxEvent extends js.Object {
  
  val originalEvent: Event = js.native
  
  val target: Workbox = js.native
  
  val `type`: String = js.native
}
object WorkboxEvent {
  
  @scala.inline
  def apply(originalEvent: Event, target: Workbox, `type`: String): WorkboxEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxEvent]
  }
  
  @scala.inline
  implicit class WorkboxEventOps[Self <: WorkboxEvent] (val x: Self) extends AnyVal {
    
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
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Workbox): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
