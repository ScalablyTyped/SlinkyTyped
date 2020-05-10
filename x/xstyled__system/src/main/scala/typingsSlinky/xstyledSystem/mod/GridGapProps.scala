package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridGapProps[TLength] extends js.Object {
  val gridGap: js.UndefOr[ResponsiveValue[GridGapProperty[TLength]]] = js.native
}

object GridGapProps {
  @scala.inline
  def apply[TLength](): GridGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[TLength]]
  }
  @scala.inline
  implicit class GridGapPropsOps[Self[tlength] <: GridGapProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withGridGap(value: ResponsiveValue[GridGapProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridGap: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(js.undefined)
        ret
    }
  }
  
}

