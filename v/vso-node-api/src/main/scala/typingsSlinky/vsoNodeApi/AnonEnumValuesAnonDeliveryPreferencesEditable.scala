package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonDeliveryPreferencesEditable extends js.Object {
  var enumValues: AnonDeliveryPreferencesEditable = js.native
}

object AnonEnumValuesAnonDeliveryPreferencesEditable {
  @scala.inline
  def apply(enumValues: AnonDeliveryPreferencesEditable): AnonEnumValuesAnonDeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonDeliveryPreferencesEditable]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonDeliveryPreferencesEditableOps[Self <: AnonEnumValuesAnonDeliveryPreferencesEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonDeliveryPreferencesEditable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

