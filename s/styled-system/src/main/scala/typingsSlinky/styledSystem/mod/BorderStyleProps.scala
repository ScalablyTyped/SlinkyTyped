package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BorderBottomStyleProperty
import typingsSlinky.csstype.mod.BorderLeftStyleProperty
import typingsSlinky.csstype.mod.BorderRightStyleProperty
import typingsSlinky.csstype.mod.BorderStyleProperty
import typingsSlinky.csstype.mod.BorderTopStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The border-bottom-style CSS property sets the line style of an element's bottom border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style)
    */
  var borderBottomStyle: js.UndefOr[ResponsiveValue[BorderBottomStyleProperty, ThemeType]] = js.native
  /**
    * The border-left-style CSS property sets the line style of an element's left border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style)
    */
  var borderLeftStyle: js.UndefOr[ResponsiveValue[BorderLeftStyleProperty, ThemeType]] = js.native
  /**
    * The border-right-style CSS property sets the line style of an element's right border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style)
    */
  var borderRightStyle: js.UndefOr[ResponsiveValue[BorderRightStyleProperty, ThemeType]] = js.native
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[ResponsiveValue[BorderStyleProperty, ThemeType]] = js.native
  /**
    * The border-top-style CSS property sets the line style of an element's top border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style)
    */
  var borderTopStyle: js.UndefOr[ResponsiveValue[BorderTopStyleProperty, ThemeType]] = js.native
}

object BorderStyleProps {
  @scala.inline
  def apply[ThemeType](): BorderStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps[ThemeType]]
  }
  @scala.inline
  implicit class BorderStylePropsOps[Self[themetype] <: BorderStyleProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withBorderBottomStyle(value: ResponsiveValue[BorderBottomStyleProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomStyle: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomStyleNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(null)
        ret
    }
    @scala.inline
    def withBorderLeftStyle(value: ResponsiveValue[BorderLeftStyleProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftStyle: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftStyleNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(null)
        ret
    }
    @scala.inline
    def withBorderRightStyle(value: ResponsiveValue[BorderRightStyleProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightStyle: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightStyleNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(null)
        ret
    }
    @scala.inline
    def withBorderStyle(value: ResponsiveValue[BorderStyleProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStyleNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(null)
        ret
    }
    @scala.inline
    def withBorderTopStyle(value: ResponsiveValue[BorderTopStyleProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopStyle: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopStyleNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(null)
        ret
    }
  }
  
}

