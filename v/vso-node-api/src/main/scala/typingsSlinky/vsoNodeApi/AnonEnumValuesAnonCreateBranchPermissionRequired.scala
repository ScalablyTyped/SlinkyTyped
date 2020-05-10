package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonCreateBranchPermissionRequired extends js.Object {
  var enumValues: AnonCreateBranchPermissionRequired = js.native
}

object AnonEnumValuesAnonCreateBranchPermissionRequired {
  @scala.inline
  def apply(enumValues: AnonCreateBranchPermissionRequired): AnonEnumValuesAnonCreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonCreateBranchPermissionRequired]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonCreateBranchPermissionRequiredOps[Self <: AnonEnumValuesAnonCreateBranchPermissionRequired] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonCreateBranchPermissionRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

