package typingsSlinky.storybookComponents.withTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithHideFn extends js.Object {
  def onHide(): Unit = js.native
}

object WithHideFn {
  @scala.inline
  def apply(onHide: () => Unit): WithHideFn = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    __obj.asInstanceOf[WithHideFn]
  }
  @scala.inline
  implicit class WithHideFnOps[Self <: WithHideFn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

