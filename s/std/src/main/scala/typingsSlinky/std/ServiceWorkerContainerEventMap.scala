package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerContainerEventMap extends js.Object {
  var controllerchange: org.scalajs.dom.raw.Event = js.native
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
}

object ServiceWorkerContainerEventMap {
  @scala.inline
  def apply(
    controllerchange: org.scalajs.dom.raw.Event,
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setControllerchange(value: org.scalajs.dom.raw.Event): Self = this.set("controllerchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = this.set("messageerror", value.asInstanceOf[js.Any])
  }
  
}

