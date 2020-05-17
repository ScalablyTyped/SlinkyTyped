package typingsSlinky.svgPanZoom.SvgPanZoom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEventHandler extends js.Object {
  var destroy: js.Function = js.native
  var haltEventListeners: js.Array[String] = js.native
  def init(options: CustomEventOptions): Unit = js.native
}

object CustomEventHandler {
  @scala.inline
  def apply(destroy: js.Function, haltEventListeners: js.Array[String], init: CustomEventOptions => Unit): CustomEventHandler = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], haltEventListeners = haltEventListeners.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CustomEventHandler]
  }
  @scala.inline
  implicit class CustomEventHandlerOps[Self <: CustomEventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHaltEventListeners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haltEventListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: CustomEventOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

