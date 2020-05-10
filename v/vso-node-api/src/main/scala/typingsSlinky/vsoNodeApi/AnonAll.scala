package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAll extends js.Object {
  var all: Double = js.native
  var batchedCI: Double = js.native
  var checkInShelveset: Double = js.native
  var individualCI: Double = js.native
  var manual: Double = js.native
  var none: Double = js.native
  var pullRequest: Double = js.native
  var schedule: Double = js.native
  var triggered: Double = js.native
  var userCreated: Double = js.native
  var validateShelveset: Double = js.native
}

object AnonAll {
  @scala.inline
  def apply(
    all: Double,
    batchedCI: Double,
    checkInShelveset: Double,
    individualCI: Double,
    manual: Double,
    none: Double,
    pullRequest: Double,
    schedule: Double,
    triggered: Double,
    userCreated: Double,
    validateShelveset: Double
  ): AnonAll = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedCI = batchedCI.asInstanceOf[js.Any], checkInShelveset = checkInShelveset.asInstanceOf[js.Any], individualCI = individualCI.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any], userCreated = userCreated.asInstanceOf[js.Any], validateShelveset = validateShelveset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAll]
  }
  @scala.inline
  implicit class AnonAllOps[Self <: AnonAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchedCI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchedCI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckInShelveset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInShelveset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndividualCI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualCI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManual(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateShelveset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateShelveset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

