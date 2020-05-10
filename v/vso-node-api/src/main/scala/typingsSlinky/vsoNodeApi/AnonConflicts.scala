package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConflicts extends js.Object {
  var conflicts: Double = js.native
  var failure: Double = js.native
  var notSet: Double = js.native
  var queued: Double = js.native
  var rejectedByPolicy: Double = js.native
  var succeeded: Double = js.native
}

object AnonConflicts {
  @scala.inline
  def apply(
    conflicts: Double,
    failure: Double,
    notSet: Double,
    queued: Double,
    rejectedByPolicy: Double,
    succeeded: Double
  ): AnonConflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConflicts]
  }
  @scala.inline
  implicit class AnonConflictsOps[Self <: AnonConflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflicts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedByPolicy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedByPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

