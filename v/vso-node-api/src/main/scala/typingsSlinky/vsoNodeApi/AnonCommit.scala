package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommit extends js.Object {
  var commit: Double = js.native
  var lastMergeCommit: Double = js.native
  var notSet: Double = js.native
}

object AnonCommit {
  @scala.inline
  def apply(commit: Double, lastMergeCommit: Double, notSet: Double): AnonCommit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommit]
  }
  @scala.inline
  implicit class AnonCommitOps[Self <: AnonCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMergeCommit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMergeCommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

