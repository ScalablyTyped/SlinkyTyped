package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnumValuesAnonAgentBasedDeployment extends js.Object {
  var enumValues: AnonAgentBasedDeployment = js.native
}

object AnonEnumValuesAnonAgentBasedDeployment {
  @scala.inline
  def apply(enumValues: AnonAgentBasedDeployment): AnonEnumValuesAnonAgentBasedDeployment = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumValuesAnonAgentBasedDeployment]
  }
  @scala.inline
  implicit class AnonEnumValuesAnonAgentBasedDeploymentOps[Self <: AnonEnumValuesAnonAgentBasedDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: AnonAgentBasedDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

