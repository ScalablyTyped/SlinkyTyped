package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-color CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties border-color or border-bottom.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color)
    */
  var borderBottomColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-left-color CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties border-color or border-left.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color)
    */
  var borderLeftColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-right-color CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties border-color or border-right.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color)
    */
  var borderRightColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-top-color CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties border-color or border-top.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color)
    */
  var borderTopColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderColorProps {
  @scala.inline
  def apply[ThemeType, TVal](): BorderColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderColorPropsOps[Self[themetype, tval] <: BorderColorProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withBorderBottomColor(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomColor: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomColorNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(null)
        ret
    }
    @scala.inline
    def withBorderColor(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(null)
        ret
    }
    @scala.inline
    def withBorderLeftColor(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftColor: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftColorNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(null)
        ret
    }
    @scala.inline
    def withBorderRightColor(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightColor: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightColorNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(null)
        ret
    }
    @scala.inline
    def withBorderTopColor(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopColor: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopColorNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(null)
        ret
    }
  }
  
}

