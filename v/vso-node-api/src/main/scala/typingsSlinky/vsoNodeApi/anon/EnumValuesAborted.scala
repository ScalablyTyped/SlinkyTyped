package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesAborted extends js.Object {
  var enumValues: Aborted = js.native
}

object EnumValuesAborted {
  @scala.inline
  def apply(enumValues: Aborted): EnumValuesAborted = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAborted]
  }
  @scala.inline
  implicit class EnumValuesAbortedOps[Self <: EnumValuesAborted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: Aborted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

