package typingsSlinky.storybookComponents.propValueMod

import typingsSlinky.storybookComponents.propDefMod.PropSummaryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropValueProps extends js.Object {
  var value: js.UndefOr[PropSummaryValue] = js.native
}

object PropValueProps {
  @scala.inline
  def apply(): PropValueProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropValueProps]
  }
  @scala.inline
  implicit class PropValuePropsOps[Self <: PropValueProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: PropSummaryValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

