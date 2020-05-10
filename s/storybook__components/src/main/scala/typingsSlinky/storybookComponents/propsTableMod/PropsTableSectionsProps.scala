package typingsSlinky.storybookComponents.propsTableMod

import typingsSlinky.std.Record
import typingsSlinky.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsTableSectionsProps extends PropsTableProps {
  var sections: js.UndefOr[Record[String, js.Array[PropDef]]] = js.native
}

object PropsTableSectionsProps {
  @scala.inline
  def apply(): PropsTableSectionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsTableSectionsProps]
  }
  @scala.inline
  implicit class PropsTableSectionsPropsOps[Self <: PropsTableSectionsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSections(value: Record[String, js.Array[PropDef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(js.undefined)
        ret
    }
  }
  
}

