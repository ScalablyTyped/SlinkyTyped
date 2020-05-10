package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventController extends js.Object {
  var onStartListening: js.UndefOr[js.Function2[/* events */ IEventManager, /* type */ String, Unit]] = js.native
  var onStopListening: js.UndefOr[js.Function2[/* events */ IEventManager, /* type */ String, Unit]] = js.native
}

object IEventController {
  @scala.inline
  def apply(): IEventController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventController]
  }
  @scala.inline
  implicit class IEventControllerOps[Self <: IEventController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnStartListening(value: (/* events */ IEventManager, /* type */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartListening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStartListening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartListening")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStopListening(value: (/* events */ IEventManager, /* type */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStopListening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStopListening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStopListening")(js.undefined)
        ret
    }
  }
  
}

