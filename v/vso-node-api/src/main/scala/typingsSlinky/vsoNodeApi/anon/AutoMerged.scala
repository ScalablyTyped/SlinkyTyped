package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMerged extends js.Object {
  var autoMerged: scala.Double = js.native
  var takeSourceContent: scala.Double = js.native
  var takeTargetContent: scala.Double = js.native
  var undecided: scala.Double = js.native
  var userMerged: scala.Double = js.native
}

object AutoMerged {
  @scala.inline
  def apply(
    autoMerged: scala.Double,
    takeSourceContent: scala.Double,
    takeTargetContent: scala.Double,
    undecided: scala.Double,
    userMerged: scala.Double
  ): AutoMerged = {
    val __obj = js.Dynamic.literal(autoMerged = autoMerged.asInstanceOf[js.Any], takeSourceContent = takeSourceContent.asInstanceOf[js.Any], takeTargetContent = takeTargetContent.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any], userMerged = userMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMerged]
  }
  @scala.inline
  implicit class AutoMergedOps[Self <: AutoMerged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMerged(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeSourceContent(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeSourceContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeTargetContent(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeTargetContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMerged(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMerged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

