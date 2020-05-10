package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundPositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The background-position CSS property sets the initial position for each background image. The
    * position is relative to the position layer set by background-origin.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-position)
    */
  var backgroundPosition: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BackgroundPositionProps {
  @scala.inline
  def apply[ThemeType, TVal](): BackgroundPositionProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BackgroundPositionPropsOps[Self[themetype, tval] <: BackgroundPositionProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withBackgroundPosition(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundPosition: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundPositionNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(null)
        ret
    }
  }
  
}

