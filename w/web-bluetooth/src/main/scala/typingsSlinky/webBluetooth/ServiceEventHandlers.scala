package typingsSlinky.webBluetooth

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEventHandlers extends js.Object {
  def onserviceadded(ev: Event): js.Any = js.native
  def onservicechanged(ev: Event): js.Any = js.native
  def onserviceremoved(ev: Event): js.Any = js.native
}

object ServiceEventHandlers {
  @scala.inline
  def apply(
    onserviceadded: Event => js.Any,
    onservicechanged: Event => js.Any,
    onserviceremoved: Event => js.Any
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction1(onserviceadded), onservicechanged = js.Any.fromFunction1(onservicechanged), onserviceremoved = js.Any.fromFunction1(onserviceremoved))
    __obj.asInstanceOf[ServiceEventHandlers]
  }
  @scala.inline
  implicit class ServiceEventHandlersOps[Self <: ServiceEventHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnserviceadded(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onserviceadded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnservicechanged(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onservicechanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnserviceremoved(value: Event => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onserviceremoved")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

