package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.FlexWrapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexWrapProps extends js.Object {
  val flexWrap: js.UndefOr[ResponsiveValue[FlexWrapProperty]] = js.native
}

object FlexWrapProps {
  @scala.inline
  def apply(): FlexWrapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps]
  }
  @scala.inline
  implicit class FlexWrapPropsOps[Self <: FlexWrapProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexWrap(value: ResponsiveValue[FlexWrapProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(js.undefined)
        ret
    }
  }
  
}

