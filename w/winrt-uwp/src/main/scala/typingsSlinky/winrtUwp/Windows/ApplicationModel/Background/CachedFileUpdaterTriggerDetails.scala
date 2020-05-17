package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Storage.Provider.CachedFileTarget
import typingsSlinky.winrtUwp.Windows.Storage.Provider.FileUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the cached file operation that invoked the trigger. */
@js.native
trait CachedFileUpdaterTriggerDetails extends js.Object {
  /** Gets whether the system can display UI allowing the user to launch provider app in response to the cached file updater trigger. */
  var canRequestUserInput: Boolean = js.native
  /** Gets the FileUpdateRequest object associated with the cached file update. */
  var updateRequest: FileUpdateRequest = js.native
  /** Gets the CachedFileTarget object associated with cached file update that indicates whether the local or remote file should be updated. */
  var updateTarget: CachedFileTarget = js.native
}

object CachedFileUpdaterTriggerDetails {
  @scala.inline
  def apply(canRequestUserInput: Boolean, updateRequest: FileUpdateRequest, updateTarget: CachedFileTarget): CachedFileUpdaterTriggerDetails = {
    val __obj = js.Dynamic.literal(canRequestUserInput = canRequestUserInput.asInstanceOf[js.Any], updateRequest = updateRequest.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedFileUpdaterTriggerDetails]
  }
  @scala.inline
  implicit class CachedFileUpdaterTriggerDetailsOps[Self <: CachedFileUpdaterTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanRequestUserInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRequestUserInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateRequest(value: FileUpdateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateTarget(value: CachedFileTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTarget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

