package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.BorderColorProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomColorProps extends js.Object {
  val borderBottomColor: js.UndefOr[ResponsiveValue[BorderColorProperty]] = js.native
}

object BorderBottomColorProps {
  @scala.inline
  def apply(): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomColorProps]
  }
  @scala.inline
  implicit class BorderBottomColorPropsOps[Self <: BorderBottomColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottomColor(value: ResponsiveValue[BorderColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(js.undefined)
        ret
    }
  }
  
}

