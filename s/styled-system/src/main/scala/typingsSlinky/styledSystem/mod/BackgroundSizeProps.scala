package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundSizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The background-size CSS property sets the size of the element's background image. The
    * image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-size)
    */
  var backgroundSize: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BackgroundSizeProps {
  @scala.inline
  def apply[ThemeType, TVal](): BackgroundSizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSizeProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BackgroundSizePropsOps[Self[themetype, tval] <: BackgroundSizeProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withBackgroundSize(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundSize: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundSizeNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(null)
        ret
    }
  }
  
}

