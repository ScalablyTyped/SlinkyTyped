package typingsSlinky.storybookComponents.propsTableMod

import typingsSlinky.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsTableRowsProps extends PropsTableProps {
  var rows: js.Array[PropDef] = js.native
}

object PropsTableRowsProps {
  @scala.inline
  def apply(rows: js.Array[PropDef]): PropsTableRowsProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTableRowsProps]
  }
  @scala.inline
  implicit class PropsTableRowsPropsOps[Self <: PropsTableRowsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRows(value: js.Array[PropDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

