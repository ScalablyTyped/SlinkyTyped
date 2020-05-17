package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  var all: scala.Double = js.native
  var batchedCI: scala.Double = js.native
  var checkInShelveset: scala.Double = js.native
  var individualCI: scala.Double = js.native
  var manual: scala.Double = js.native
  var none: scala.Double = js.native
  var pullRequest: scala.Double = js.native
  var schedule: scala.Double = js.native
  var triggered: scala.Double = js.native
  var userCreated: scala.Double = js.native
  var validateShelveset: scala.Double = js.native
}

object All {
  @scala.inline
  def apply(
    all: scala.Double,
    batchedCI: scala.Double,
    checkInShelveset: scala.Double,
    individualCI: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    triggered: scala.Double,
    userCreated: scala.Double,
    validateShelveset: scala.Double
  ): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedCI = batchedCI.asInstanceOf[js.Any], checkInShelveset = checkInShelveset.asInstanceOf[js.Any], individualCI = individualCI.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any], userCreated = userCreated.asInstanceOf[js.Any], validateShelveset = validateShelveset.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchedCI(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchedCI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckInShelveset(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInShelveset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndividualCI(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individualCI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManual(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequest(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggered(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserCreated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateShelveset(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateShelveset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

