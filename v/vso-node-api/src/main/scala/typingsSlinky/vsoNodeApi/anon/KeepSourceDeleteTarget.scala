package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepSourceDeleteTarget extends js.Object {
  var keepSourceDeleteTarget: scala.Double = js.native
  var keepSourceRenameTarget: scala.Double = js.native
  var keepTargetDeleteSource: scala.Double = js.native
  var keepTargetRenameSource: scala.Double = js.native
  var undecided: scala.Double = js.native
}

object KeepSourceDeleteTarget {
  @scala.inline
  def apply(
    keepSourceDeleteTarget: scala.Double,
    keepSourceRenameTarget: scala.Double,
    keepTargetDeleteSource: scala.Double,
    keepTargetRenameSource: scala.Double,
    undecided: scala.Double
  ): KeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(keepSourceDeleteTarget = keepSourceDeleteTarget.asInstanceOf[js.Any], keepSourceRenameTarget = keepSourceRenameTarget.asInstanceOf[js.Any], keepTargetDeleteSource = keepTargetDeleteSource.asInstanceOf[js.Any], keepTargetRenameSource = keepTargetRenameSource.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepSourceDeleteTarget]
  }
  @scala.inline
  implicit class KeepSourceDeleteTargetOps[Self <: KeepSourceDeleteTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepSourceDeleteTarget(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSourceDeleteTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepSourceRenameTarget(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSourceRenameTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepTargetDeleteSource(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTargetDeleteSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepTargetRenameSource(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepTargetRenameSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

