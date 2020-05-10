package typingsSlinky.workboxWindow.workboxEventMapMod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import typingsSlinky.std.Event_
import typingsSlinky.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkboxWaitingEvent extends WorkboxUpdatableEvent {
  val wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.native
}

object WorkboxWaitingEvent {
  @scala.inline
  def apply(originalEvent: Event_, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxWaitingEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxWaitingEvent]
  }
  @scala.inline
  implicit class WorkboxWaitingEventOps[Self <: WorkboxWaitingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWasWaitingBeforeRegister(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasWaitingBeforeRegister")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWasWaitingBeforeRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasWaitingBeforeRegister")(js.undefined)
        ret
    }
  }
  
}

