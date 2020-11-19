package typingsSlinky.workboxWindow.workboxEventMapMod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import org.scalajs.dom.raw.Event
import typingsSlinky.workboxWindow.workboxEventMod.WorkboxEvent
import typingsSlinky.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkboxExtendableEvent extends WorkboxEvent {
  
  val sw: ServiceWorker = js.native
}
object WorkboxExtendableEvent {
  
  @scala.inline
  def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxExtendableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxExtendableEvent]
  }
  
  @scala.inline
  implicit class WorkboxExtendableEventOps[Self <: WorkboxExtendableEvent] (val x: Self) extends AnyVal {
    
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
    def setSw(value: ServiceWorker): Self = this.set("sw", value.asInstanceOf[js.Any])
  }
}
