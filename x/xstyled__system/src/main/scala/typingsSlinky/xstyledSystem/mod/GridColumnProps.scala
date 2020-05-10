package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridColumnProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnProps extends js.Object {
  val gridColumn: js.UndefOr[ResponsiveValue[GridColumnProperty]] = js.native
}

object GridColumnProps {
  @scala.inline
  def apply(): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps]
  }
  @scala.inline
  implicit class GridColumnPropsOps[Self <: GridColumnProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGridColumn(value: ResponsiveValue[GridColumnProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(js.undefined)
        ret
    }
  }
  
}

