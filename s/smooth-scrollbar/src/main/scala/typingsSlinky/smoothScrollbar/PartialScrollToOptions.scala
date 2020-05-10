package typingsSlinky.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
@js.native
trait PartialScrollToOptions extends js.Object {
  var callback: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.native
}

object PartialScrollToOptions {
  @scala.inline
  def apply(): PartialScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollToOptions]
  }
  @scala.inline
  implicit class PartialScrollToOptionsOps[Self <: PartialScrollToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.ThisFunction0[PartialScrollToOptions, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: /* percent */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
  }
  
}

