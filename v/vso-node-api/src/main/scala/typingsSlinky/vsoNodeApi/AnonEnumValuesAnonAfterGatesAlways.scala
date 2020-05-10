package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonAfterGatesAlways extends js.Object {
  var enumValues: AnonAfterGatesAlways = js.native
}

object AnonEnumValuesAnonAfterGatesAlways {
  @scala.inline
  def apply(enumValues: AnonAfterGatesAlways): AnonEnumValuesAnonAfterGatesAlways = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonAfterGatesAlways]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonAfterGatesAlwaysOps[Self <: AnonEnumValuesAnonAfterGatesAlways] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonAfterGatesAlways): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

