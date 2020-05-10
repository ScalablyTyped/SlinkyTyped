package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridRowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRowProps extends js.Object {
  val gridRow: js.UndefOr[ResponsiveValue[GridRowProperty]] = js.native
}

object GridRowProps {
  @scala.inline
  def apply(): GridRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps]
  }
  @scala.inline
  implicit class GridRowPropsOps[Self <: GridRowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridRow(value: ResponsiveValue[GridRowProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(js.undefined)
        ret
    }
  }
  
}

