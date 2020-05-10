package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridColumnGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnGapProps[TLength] extends js.Object {
  val gridColumnGap: js.UndefOr[ResponsiveValue[GridColumnGapProperty[TLength]]] = js.native
}

object GridColumnGapProps {
  @scala.inline
  def apply[TLength](): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
  @scala.inline
  implicit class GridColumnGapPropsOps[Self[tlength] <: GridColumnGapProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withGridColumnGap(value: ResponsiveValue[GridColumnGapProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnGap: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(js.undefined)
        ret
    }
  }
  
}

