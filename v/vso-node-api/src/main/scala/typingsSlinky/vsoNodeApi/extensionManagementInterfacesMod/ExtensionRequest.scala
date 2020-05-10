package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionRequest extends js.Object {
  /**
    * Required message supplied if the request is rejected
    */
  var rejectMessage: String = js.native
  /**
    * Date at which the request was made
    */
  var requestDate: js.Date = js.native
  /**
    * Optional message supplied by the requester justifying the request
    */
  var requestMessage: String = js.native
  /**
    * Represents the state of the request
    */
  var requestState: ExtensionRequestState = js.native
  /**
    * Represents the user who made the request
    */
  var requestedBy: IdentityRef = js.native
  /**
    * Date at which the request was resolved
    */
  var resolveDate: js.Date = js.native
  /**
    * Represents the user who resolved the request
    */
  var resolvedBy: IdentityRef = js.native
}

object ExtensionRequest {
  @scala.inline
  def apply(
    rejectMessage: String,
    requestDate: js.Date,
    requestMessage: String,
    requestState: ExtensionRequestState,
    requestedBy: IdentityRef,
    resolveDate: js.Date,
    resolvedBy: IdentityRef
  ): ExtensionRequest = {
    val __obj = js.Dynamic.literal(rejectMessage = rejectMessage.asInstanceOf[js.Any], requestDate = requestDate.asInstanceOf[js.Any], requestMessage = requestMessage.asInstanceOf[js.Any], requestState = requestState.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], resolveDate = resolveDate.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequest]
  }
  @scala.inline
  implicit class ExtensionRequestOps[Self <: ExtensionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRejectMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestState(value: ExtensionRequestState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedBy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

