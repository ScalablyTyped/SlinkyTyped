package typingsSlinky.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToOptions extends js.Object {
  def callback(): Unit = js.native
  def easing(percent: Double): Double = js.native
}

object ScrollToOptions {
  @scala.inline
  def apply(callback: () => Unit, easing: Double => Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), easing = js.Any.fromFunction1(easing))
    __obj.asInstanceOf[ScrollToOptions]
  }
  @scala.inline
  implicit class ScrollToOptionsOps[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEasing(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

