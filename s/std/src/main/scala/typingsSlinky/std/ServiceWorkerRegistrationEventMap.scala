package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerRegistrationEventMap extends js.Object {
  var updatefound: Event_ = js.native
}

object ServiceWorkerRegistrationEventMap {
  @scala.inline
  def apply(updatefound: Event_): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  @scala.inline
  implicit class ServiceWorkerRegistrationEventMapOps[Self <: ServiceWorkerRegistrationEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdatefound(value: Event_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatefound")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

