package typingsSlinky.smoothScrollbar.anon

import typingsSlinky.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
@js.native
trait PartialScrollToOptionsCallback extends js.Object {
  var callback: js.UndefOr[js.ThisFunction0[/* this */ Scrollbar, Unit]] = js.native
  var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.native
}

object PartialScrollToOptionsCallback {
  @scala.inline
  def apply(): PartialScrollToOptionsCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollToOptionsCallback]
  }
  @scala.inline
  implicit class PartialScrollToOptionsCallbackOps[Self <: PartialScrollToOptionsCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.ThisFunction0[/* this */ Scrollbar, Unit]): Self = {
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

