package typingsSlinky.scrolltofixed.ScrollToFixed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToFixedOptions extends js.Object {
  var baseClassName: js.UndefOr[String] = js.native
  var bottom: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.native
  var dontSetWidth: js.UndefOr[Boolean] = js.native
  var fixed: js.UndefOr[js.Function0[Unit]] = js.native
  var limit: js.UndefOr[Double | js.Function0[Double]] = js.native
  var marginTop: js.UndefOr[Double | js.Function0[Double]] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var offsets: js.UndefOr[Boolean] = js.native
  var postAbsolute: js.UndefOr[js.Function0[Unit]] = js.native
  var postFixed: js.UndefOr[js.Function0[Unit]] = js.native
  var postUnfixed: js.UndefOr[js.Function0[Unit]] = js.native
  var preAbsolute: js.UndefOr[js.Function0[Unit]] = js.native
  var preFixed: js.UndefOr[js.Function0[Unit]] = js.native
  var preUnfixed: js.UndefOr[js.Function0[Unit]] = js.native
  var removeOffsets: js.UndefOr[Boolean] = js.native
  var spacerClass: js.UndefOr[String] = js.native
  var unfixed: js.UndefOr[js.Function0[Unit]] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ScrollToFixedOptions {
  @scala.inline
  def apply(): ScrollToFixedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToFixedOptions]
  }
  @scala.inline
  implicit class ScrollToFixedOptionsOps[Self <: ScrollToFixedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDontCheckForPositionFixedSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCheckForPositionFixedSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontCheckForPositionFixedSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCheckForPositionFixedSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDontSetWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontSetWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontSetWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTopFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarginTop(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(js.undefined)
        ret
    }
    @scala.inline
    def withPostAbsolute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postAbsolute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPostAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postAbsolute")(js.undefined)
        ret
    }
    @scala.inline
    def withPostFixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPostFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withPostUnfixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUnfixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPostUnfixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postUnfixed")(js.undefined)
        ret
    }
    @scala.inline
    def withPreAbsolute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAbsolute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAbsolute")(js.undefined)
        ret
    }
    @scala.inline
    def withPreFixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withPreUnfixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preUnfixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreUnfixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preUnfixed")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOffsets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOffsets")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnfixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfixed")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

