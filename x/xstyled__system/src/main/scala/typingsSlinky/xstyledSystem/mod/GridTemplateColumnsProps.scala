package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridTemplateColumnsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateColumnsProps[TLength] extends js.Object {
  val gridTemplateColumns: js.UndefOr[ResponsiveValue[GridTemplateColumnsProperty[TLength]]] = js.native
}

object GridTemplateColumnsProps {
  @scala.inline
  def apply[TLength](): GridTemplateColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[TLength]]
  }
  @scala.inline
  implicit class GridTemplateColumnsPropsOps[Self[tlength] <: GridTemplateColumnsProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withGridTemplateColumns(value: ResponsiveValue[GridTemplateColumnsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateColumns: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(js.undefined)
        ret
    }
  }
  
}

