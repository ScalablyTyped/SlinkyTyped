package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object TextColorProps {
  @scala.inline
  def apply[ThemeType, TVal](): TextColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColorProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class TextColorPropsOps[Self[themetype, tval] <: TextColorProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withColor(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(null)
        ret
    }
  }
  
}

