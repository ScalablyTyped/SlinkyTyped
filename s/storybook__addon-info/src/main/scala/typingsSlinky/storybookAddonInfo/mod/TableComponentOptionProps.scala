package typingsSlinky.storybookAddonInfo.mod

import typingsSlinky.storybookAddonInfo.AnonDefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponentOptionProps extends js.Object {
  var propDefinitions: js.Array[AnonDefaultValue] = js.native
}

object TableComponentOptionProps {
  @scala.inline
  def apply(propDefinitions: js.Array[AnonDefaultValue]): TableComponentOptionProps = {
    val __obj = js.Dynamic.literal(propDefinitions = propDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentOptionProps]
  }
  @scala.inline
  implicit class TableComponentOptionPropsOps[Self <: TableComponentOptionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropDefinitions(value: js.Array[AnonDefaultValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

