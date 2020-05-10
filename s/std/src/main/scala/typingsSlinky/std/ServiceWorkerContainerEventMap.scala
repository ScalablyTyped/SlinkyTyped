package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerContainerEventMap extends js.Object {
  var controllerchange: Event_ = js.native
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
}

object ServiceWorkerContainerEventMap {
  @scala.inline
  def apply(
    controllerchange: Event_,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent
  ): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  @scala.inline
  implicit class ServiceWorkerContainerEventMapOps[Self <: ServiceWorkerContainerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllerchange(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: org.scalajs.dom.raw.MessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageerror")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

