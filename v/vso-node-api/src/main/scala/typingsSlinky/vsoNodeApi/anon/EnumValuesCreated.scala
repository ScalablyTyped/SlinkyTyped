package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesCreated extends js.Object {
  var enumValues: Created = js.native
}

object EnumValuesCreated {
  @scala.inline
  def apply(enumValues: Created): EnumValuesCreated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreated]
  }
  @scala.inline
  implicit class EnumValuesCreatedOps[Self <: EnumValuesCreated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: Created): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

