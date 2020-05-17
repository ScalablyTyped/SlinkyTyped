package typingsSlinky.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<weixin-app.wx.PageLifetimes> */
@js.native
trait PartialPageLifetimes extends js.Object {
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialPageLifetimes {
  @scala.inline
  def apply(): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageLifetimes]
  }
  @scala.inline
  implicit class PartialPageLifetimesOps[Self <: PartialPageLifetimes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

