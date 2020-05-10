package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GridAutoRowsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoRowsProps[TLength] extends js.Object {
  val gridAutoRows: js.UndefOr[ResponsiveValue[GridAutoRowsProperty[TLength]]] = js.native
}

object GridAutoRowsProps {
  @scala.inline
  def apply[TLength](): GridAutoRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[TLength]]
  }
  @scala.inline
  implicit class GridAutoRowsPropsOps[Self[tlength] <: GridAutoRowsProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withGridAutoRows(value: ResponsiveValue[GridAutoRowsProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoRows: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(js.undefined)
        ret
    }
  }
  
}

