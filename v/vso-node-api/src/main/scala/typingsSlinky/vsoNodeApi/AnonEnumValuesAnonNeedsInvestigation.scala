package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonNeedsInvestigation extends js.Object {
  var enumValues: AnonNeedsInvestigation = js.native
}

object AnonEnumValuesAnonNeedsInvestigation {
  @scala.inline
  def apply(enumValues: AnonNeedsInvestigation): AnonEnumValuesAnonNeedsInvestigation = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonNeedsInvestigation]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonNeedsInvestigationOps[Self <: AnonEnumValuesAnonNeedsInvestigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonNeedsInvestigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

