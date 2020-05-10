package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridAutoFlowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoFlowProps extends js.Object {
  val gridAutoFlow: js.UndefOr[ResponsiveValue[GridAutoFlowProperty]] = js.native
}

object GridAutoFlowProps {
  @scala.inline
  def apply(): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps]
  }
  @scala.inline
  implicit class GridAutoFlowPropsOps[Self <: GridAutoFlowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridAutoFlow(value: ResponsiveValue[GridAutoFlowProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(js.undefined)
        ret
    }
  }
  
}

