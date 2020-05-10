package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanOptOut extends js.Object {
  var canOptOut: Double = js.native
  var contributedSubscription: Double = js.native
  var groupSubscription: Double = js.native
  var none: Double = js.native
  var teamSubscription: Double = js.native
}

object AnonCanOptOut {
  @scala.inline
  def apply(
    canOptOut: Double,
    contributedSubscription: Double,
    groupSubscription: Double,
    none: Double,
    teamSubscription: Double
  ): AnonCanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut.asInstanceOf[js.Any], contributedSubscription = contributedSubscription.asInstanceOf[js.Any], groupSubscription = groupSubscription.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamSubscription = teamSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanOptOut]
  }
  @scala.inline
  implicit class AnonCanOptOutOps[Self <: AnonCanOptOut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanOptOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributedSubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributedSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamSubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamSubscription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

