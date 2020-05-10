package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderWidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-width CSS property sets the width of the bottom border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width)
    */
  var borderBottomWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-left-width CSS property sets the width of the left border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width)
    */
  var borderLeftWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-right-width CSS property sets the width of the right border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width)
    */
  var borderRightWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-top-width CSS property sets the width of the top border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width)
    */
  var borderTopWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderWidthProps {
  @scala.inline
  def apply[ThemeType, TVal](): BorderWidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderWidthPropsOps[Self[themetype, tval] <: BorderWidthProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withBorderBottomWidth(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomWidth: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomWidthNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(null)
        ret
    }
    @scala.inline
    def withBorderLeftWidth(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftWidth: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftWidthNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(null)
        ret
    }
    @scala.inline
    def withBorderRightWidth(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightWidth: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightWidthNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(null)
        ret
    }
    @scala.inline
    def withBorderTopWidth(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopWidth: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopWidthNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(null)
        ret
    }
    @scala.inline
    def withBorderWidth(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidthNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(null)
        ret
    }
  }
  
}

