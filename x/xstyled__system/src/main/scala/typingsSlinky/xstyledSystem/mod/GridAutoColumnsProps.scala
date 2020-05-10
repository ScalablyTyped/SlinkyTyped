package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridAutoColumnsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoColumnsProps[TLength] extends js.Object {
  val gridAutoColumns: js.UndefOr[ResponsiveValue[GridAutoColumnsProperty[TLength]]] = js.native
}

object GridAutoColumnsProps {
  @scala.inline
  def apply[TLength](): GridAutoColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[TLength]]
  }
  @scala.inline
  implicit class GridAutoColumnsPropsOps[Self[tlength] <: GridAutoColumnsProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withGridAutoColumns(value: ResponsiveValue[GridAutoColumnsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoColumns: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(js.undefined)
        ret
    }
  }
  
}

