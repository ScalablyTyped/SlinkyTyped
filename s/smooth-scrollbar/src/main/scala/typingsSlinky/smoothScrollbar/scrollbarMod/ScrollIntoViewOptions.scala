package typingsSlinky.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollIntoViewOptions extends js.Object {
  var alignToTop: Boolean = js.native
  var offsetBottom: Double = js.native
  var offsetLeft: Double = js.native
  var offsetTop: Double = js.native
  var onlyScrollIfNeeded: Boolean = js.native
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(
    alignToTop: Boolean,
    offsetBottom: Double,
    offsetLeft: Double,
    offsetTop: Double,
    onlyScrollIfNeeded: Boolean
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(alignToTop = alignToTop.asInstanceOf[js.Any], offsetBottom = offsetBottom.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], onlyScrollIfNeeded = onlyScrollIfNeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
  @scala.inline
  implicit class ScrollIntoViewOptionsOps[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
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
    def withOffsetBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyScrollIfNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyScrollIfNeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

