package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningResult extends js.Object {
  /**
    * Details about of the provisioning import events.
    */
  var provisioningImportEvents: js.Array[String] = js.native
}

object ProvisioningResult {
  @scala.inline
  def apply(provisioningImportEvents: js.Array[String]): ProvisioningResult = {
    val __obj = js.Dynamic.literal(provisioningImportEvents = provisioningImportEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningResult]
  }
  @scala.inline
  implicit class ProvisioningResultOps[Self <: ProvisioningResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisioningImportEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningImportEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

