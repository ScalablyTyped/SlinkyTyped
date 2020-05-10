package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoMerged extends js.Object {
  var autoMerged: Double = js.native
  var takeSourceContent: Double = js.native
  var takeTargetContent: Double = js.native
  var undecided: Double = js.native
  var userMerged: Double = js.native
}

object AnonAutoMerged {
  @scala.inline
  def apply(
    autoMerged: Double,
    takeSourceContent: Double,
    takeTargetContent: Double,
    undecided: Double,
    userMerged: Double
  ): AnonAutoMerged = {
    val __obj = js.Dynamic.literal(autoMerged = autoMerged.asInstanceOf[js.Any], takeSourceContent = takeSourceContent.asInstanceOf[js.Any], takeTargetContent = takeTargetContent.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any], userMerged = userMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoMerged]
  }
  @scala.inline
  implicit class AnonAutoMergedOps[Self <: AnonAutoMerged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMerged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeSourceContent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeSourceContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakeTargetContent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takeTargetContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndecided(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undecided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMerged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMerged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

