package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquisitionOperation extends js.Object {
  /**
    * State of the the AcquisitionOperation for the current user
    */
  var operationState: AcquisitionOperationState = js.native
  /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
  var operationType: AcquisitionOperationType = js.native
  /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
  var reason: String = js.native
}

object AcquisitionOperation {
  @scala.inline
  def apply(operationState: AcquisitionOperationState, operationType: AcquisitionOperationType, reason: String): AcquisitionOperation = {
    val __obj = js.Dynamic.literal(operationState = operationState.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOperation]
  }
  @scala.inline
  implicit class AcquisitionOperationOps[Self <: AcquisitionOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationState(value: AcquisitionOperationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationType(value: AcquisitionOperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

