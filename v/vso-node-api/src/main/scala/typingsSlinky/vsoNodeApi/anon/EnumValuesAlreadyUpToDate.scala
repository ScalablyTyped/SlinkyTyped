package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesAlreadyUpToDate extends js.Object {
  var enumValues: AlreadyUpToDate = js.native
}

object EnumValuesAlreadyUpToDate {
  @scala.inline
  def apply(enumValues: AlreadyUpToDate): EnumValuesAlreadyUpToDate = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAlreadyUpToDate]
  }
  @scala.inline
  implicit class EnumValuesAlreadyUpToDateOps[Self <: EnumValuesAlreadyUpToDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AlreadyUpToDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

