package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConflictUpdateResult extends js.Object {
  /**
    * Conflict ID that was provided by input
    */
  var conflictId: Double = js.native
  /**
    * Reason for failing
    */
  var customMessage: String = js.native
  /**
    * Status of the update on the server
    */
  var updateStatus: GitConflictUpdateStatus = js.native
  /**
    * New state of the conflict after updating
    */
  var updatedConflict: GitConflict = js.native
}

object GitConflictUpdateResult {
  @scala.inline
  def apply(
    conflictId: Double,
    customMessage: String,
    updateStatus: GitConflictUpdateStatus,
    updatedConflict: GitConflict
  ): GitConflictUpdateResult = {
    val __obj = js.Dynamic.literal(conflictId = conflictId.asInstanceOf[js.Any], customMessage = customMessage.asInstanceOf[js.Any], updateStatus = updateStatus.asInstanceOf[js.Any], updatedConflict = updatedConflict.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictUpdateResult]
  }
  @scala.inline
  implicit class GitConflictUpdateResultOps[Self <: GitConflictUpdateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateStatus(value: GitConflictUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedConflict(value: GitConflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedConflict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

