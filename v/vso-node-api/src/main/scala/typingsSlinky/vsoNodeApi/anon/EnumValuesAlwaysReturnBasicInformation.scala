package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesAlwaysReturnBasicInformation extends js.Object {
  var enumValues: AlwaysReturnBasicInformation = js.native
}

object EnumValuesAlwaysReturnBasicInformation {
  @scala.inline
  def apply(enumValues: AlwaysReturnBasicInformation): EnumValuesAlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAlwaysReturnBasicInformation]
  }
  @scala.inline
  implicit class EnumValuesAlwaysReturnBasicInformationOps[Self <: EnumValuesAlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AlwaysReturnBasicInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

