package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FlexDirectionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexDirectionProps extends js.Object {
  val flexDirection: js.UndefOr[ResponsiveValue[FlexDirectionProperty]] = js.native
}

object FlexDirectionProps {
  @scala.inline
  def apply(): FlexDirectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexDirectionProps]
  }
  @scala.inline
  implicit class FlexDirectionPropsOps[Self <: FlexDirectionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexDirection(value: ResponsiveValue[FlexDirectionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(js.undefined)
        ret
    }
  }
  
}

