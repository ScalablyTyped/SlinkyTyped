package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.FontFamilyProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFamilyProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var fontFamily: js.UndefOr[ResponsiveValue[FontFamilyProperty, ThemeType]] = js.native
}

object FontFamilyProps {
  @scala.inline
  def apply[ThemeType](): FontFamilyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps[ThemeType]]
  }
  @scala.inline
  implicit class FontFamilyPropsOps[Self[themetype] <: FontFamilyProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withFontFamily(value: ResponsiveValue[FontFamilyProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamilyNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(null)
        ret
    }
  }
  
}

