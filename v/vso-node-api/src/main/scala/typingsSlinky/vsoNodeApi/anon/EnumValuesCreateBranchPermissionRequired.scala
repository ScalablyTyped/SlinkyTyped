package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesCreateBranchPermissionRequired extends js.Object {
  var enumValues: CreateBranchPermissionRequired = js.native
}

object EnumValuesCreateBranchPermissionRequired {
  @scala.inline
  def apply(enumValues: CreateBranchPermissionRequired): EnumValuesCreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCreateBranchPermissionRequired]
  }
  @scala.inline
  implicit class EnumValuesCreateBranchPermissionRequiredOps[Self <: EnumValuesCreateBranchPermissionRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: CreateBranchPermissionRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

