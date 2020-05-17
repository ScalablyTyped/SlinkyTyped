package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflicts extends js.Object {
  var conflicts: scala.Double = js.native
  var failure: scala.Double = js.native
  var notSet: scala.Double = js.native
  var queued: scala.Double = js.native
  var rejectedByPolicy: scala.Double = js.native
  var succeeded: scala.Double = js.native
}

object Conflicts {
  @scala.inline
  def apply(
    conflicts: scala.Double,
    failure: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    rejectedByPolicy: scala.Double,
    succeeded: scala.Double
  ): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflicts(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSet(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueued(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectedByPolicy(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectedByPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

