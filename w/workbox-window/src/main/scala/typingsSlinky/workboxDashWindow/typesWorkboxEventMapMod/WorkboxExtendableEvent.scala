package typingsSlinky.workboxDashWindow.typesWorkboxEventMapMod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import org.scalajs.dom.raw.Event
import typingsSlinky.workboxDashWindow.typesWorkboxEventMod.WorkboxEvent
import typingsSlinky.workboxDashWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxExtendableEvent extends WorkboxEvent {
  val sw: ServiceWorker
}

object WorkboxExtendableEvent {
  @scala.inline
  def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxExtendableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxExtendableEvent]
  }
}

