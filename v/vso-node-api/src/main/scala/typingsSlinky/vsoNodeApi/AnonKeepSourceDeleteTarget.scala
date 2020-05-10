package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeepSourceDeleteTarget extends js.Object {
  var keepSourceDeleteTarget: Double = js.native
  var keepSourceRenameTarget: Double = js.native
  var keepTargetDeleteSource: Double = js.native
  var keepTargetRenameSource: Double = js.native
  var undecided: Double = js.native
}

object AnonKeepSourceDeleteTarget {
  @scala.inline
  def apply(
    keepSourceDeleteTarget: Double,
    keepSourceRenameTarget: Double,
    keepTargetDeleteSource: Double,
    keepTargetRenameSource: Double,
    undecided: Double
  ): AnonKeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(keepSourceDeleteTarget = keepSourceDeleteTarget.asInstanceOf[js.Any], keepSourceRenameTarget = keepSourceRenameTarget.asInstanceOf[js.Any], keepTargetDeleteSource = keepTargetDeleteSource.asInstanceOf[js.Any], keepTargetRenameSource = keepTargetRenameSource.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeepSourceDeleteTarget]
  }
  @scala.inline
  implicit class AnonKeepSourceDeleteTargetOps[Self <: AnonKeepSourceDeleteTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepSourceDeleteTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSourceDeleteTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepSourceRenameTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSourceRenameTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepTargetDeleteSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTargetDeleteSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepTargetRenameSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTargetRenameSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

