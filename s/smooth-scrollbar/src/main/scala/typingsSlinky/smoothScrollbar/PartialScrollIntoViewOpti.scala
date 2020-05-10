package typingsSlinky.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollIntoViewOptions> */
@js.native
trait PartialScrollIntoViewOpti extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.native
  var offsetBottom: js.UndefOr[Double] = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.native
}

object PartialScrollIntoViewOpti {
  @scala.inline
  def apply(): PartialScrollIntoViewOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollIntoViewOpti]
  }
  @scala.inline
  implicit class PartialScrollIntoViewOptiOps[Self <: PartialScrollIntoViewOpti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignToTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignToTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignToTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignToTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyScrollIfNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyScrollIfNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyScrollIfNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyScrollIfNeeded")(js.undefined)
        ret
    }
  }
  
}

