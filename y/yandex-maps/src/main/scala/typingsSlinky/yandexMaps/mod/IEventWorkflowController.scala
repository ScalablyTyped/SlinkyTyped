package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventWorkflowController extends IEventController {
  var onAfterEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.native
  var onBeforeEventFiring: js.UndefOr[
    js.Function3[/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent], Unit]
  ] = js.native
}

object IEventWorkflowController {
  @scala.inline
  def apply(): IEventWorkflowController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventWorkflowController]
  }
  @scala.inline
  implicit class IEventWorkflowControllerOps[Self <: IEventWorkflowController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAfterEventFiring(value: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterEventFiring")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAfterEventFiring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterEventFiring")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeEventFiring(value: (/* events */ IEventManager, /* type */ String, /* event */ js.UndefOr[IEvent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeEventFiring")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeEventFiring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeEventFiring")(js.undefined)
        ret
    }
  }
  
}

