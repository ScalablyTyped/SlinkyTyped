package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FontFamilyProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFamilyProps extends js.Object {
  val fontFamily: js.UndefOr[ResponsiveValue[FontFamilyProperty | Double]] = js.native
}

object FontFamilyProps {
  @scala.inline
  def apply(): FontFamilyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps]
  }
  @scala.inline
  implicit class FontFamilyPropsOps[Self <: FontFamilyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: ResponsiveValue[FontFamilyProperty | Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
  }
  
}

