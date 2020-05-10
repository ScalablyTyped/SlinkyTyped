package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BorderBottomProperty
import typingsSlinky.csstype.mod.BorderLeftProperty
import typingsSlinky.csstype.mod.BorderRightProperty
import typingsSlinky.csstype.mod.BorderTopProperty
import typingsSlinky.styledSystem.styledSystemStrings.borderWidths
import typingsSlinky.styledSystem.styledSystemStrings.colors
import typingsSlinky.styledSystem.styledSystemStrings.radii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BorderWidthProps[ThemeType, ThemeValue[borderWidths, ThemeType, js.Any]]
     with BorderStyleProps[ThemeType]
     with BorderColorProps[ThemeType, ThemeValue[colors, ThemeType, js.Any]]
     with BorderRadiusProps[ThemeType, ThemeValue[radii, ThemeType, js.Any]]
     with BorderTopProps[ThemeType, BorderTopProperty[TLengthStyledSystem]]
     with BorderRightProps[ThemeType, BorderRightProperty[TLengthStyledSystem]]
     with BorderBottomProps[ThemeType, BorderBottomProperty[TLengthStyledSystem]]
     with BorderLeftProps[ThemeType, BorderLeftProperty[TLengthStyledSystem]] {
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  var borderX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  var borderY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderProps {
  @scala.inline
  def apply[ThemeType, TVal](): BorderProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderPropsOps[Self[themetype, tval] <: BorderProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withBorder(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(null)
        ret
    }
    @scala.inline
    def withBorderX(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderX: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderX")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderXNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderX")(null)
        ret
    }
    @scala.inline
    def withBorderY(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderY: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderY")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderYNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderY")(null)
        ret
    }
  }
  
}

