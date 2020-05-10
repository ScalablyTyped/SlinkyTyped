package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonGlobalWorkflow extends js.Object {
  var enumValues: AnonGlobalWorkflow = js.native
}

object AnonEnumValuesAnonGlobalWorkflow {
  @scala.inline
  def apply(enumValues: AnonGlobalWorkflow): AnonEnumValuesAnonGlobalWorkflow = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonGlobalWorkflow]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonGlobalWorkflowOps[Self <: AnonEnumValuesAnonGlobalWorkflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonGlobalWorkflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

