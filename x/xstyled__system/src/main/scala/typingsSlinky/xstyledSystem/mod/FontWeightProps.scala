package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontWeightProps extends js.Object {
  val fontWeight: js.UndefOr[ResponsiveValue[FontWeightProperty | AliasKey]] = js.native
}

object FontWeightProps {
  @scala.inline
  def apply(): FontWeightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightProps]
  }
  @scala.inline
  implicit class FontWeightPropsOps[Self <: FontWeightProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontWeight(value: ResponsiveValue[FontWeightProperty | AliasKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
  }
  
}

