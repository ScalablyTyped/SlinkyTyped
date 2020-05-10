package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitAsyncRefOperationDetail extends js.Object {
  /**
    * Indicates if there was a conflict generated when trying to cherry pick or revert the changes.
    */
  var conflict: Boolean = js.native
  /**
    * The current commit from the list of commits that are being cherry picked or reverted.
    */
  var currentCommitId: String = js.native
  /**
    * Detailed information about why the cherry pick or revert failed to complete.
    */
  var failureMessage: String = js.native
  /**
    * A number between 0 and 1 indicating the percent complete of the operation.
    */
  var progress: Double = js.native
  /**
    * Provides a status code that indicates the reason the cherry pick or revert failed.
    */
  var status: GitAsyncRefOperationFailureStatus = js.native
  /**
    * Indicates if the operation went beyond the maximum time allowed for a cherry pick or revert operation.
    */
  var timedout: Boolean = js.native
}

object GitAsyncRefOperationDetail {
  @scala.inline
  def apply(
    conflict: Boolean,
    currentCommitId: String,
    failureMessage: String,
    progress: Double,
    status: GitAsyncRefOperationFailureStatus,
    timedout: Boolean
  ): GitAsyncRefOperationDetail = {
    val __obj = js.Dynamic.literal(conflict = conflict.asInstanceOf[js.Any], currentCommitId = currentCommitId.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timedout = timedout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationDetail]
  }
  @scala.inline
  implicit class GitAsyncRefOperationDetailOps[Self <: GitAsyncRefOperationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentCommitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: GitAsyncRefOperationFailureStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimedout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

