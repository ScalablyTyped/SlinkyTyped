package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.FontStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[ResponsiveValue[FontStyleProperty, ThemeType]] = js.native
}

object FontStyleProps {
  @scala.inline
  def apply[ThemeType](): FontStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleProps[ThemeType]]
  }
  @scala.inline
  implicit class FontStylePropsOps[Self[themetype] <: FontStyleProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withFontStyle(value: ResponsiveValue[FontStyleProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyleNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(null)
        ret
    }
  }
  
}

