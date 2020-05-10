package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridRowGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRowGapProps[TLength] extends js.Object {
  val gridRowGap: js.UndefOr[ResponsiveValue[GridRowGapProperty[TLength]]] = js.native
}

object GridRowGapProps {
  @scala.inline
  def apply[TLength](): GridRowGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowGapProps[TLength]]
  }
  @scala.inline
  implicit class GridRowGapPropsOps[Self[tlength] <: GridRowGapProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withGridRowGap(value: ResponsiveValue[GridRowGapProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowGap: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(js.undefined)
        ret
    }
  }
  
}

