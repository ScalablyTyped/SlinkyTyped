package typingsSlinky.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clicktracking extends js.Object {
  var click_tracking: js.Any = js.native
  var ganalytics: js.Any = js.native
  var open_tracking: js.Any = js.native
  var subscription_tracking: js.Any = js.native
}

object Clicktracking {
  @scala.inline
  def apply(click_tracking: js.Any, ganalytics: js.Any, open_tracking: js.Any, subscription_tracking: js.Any): Clicktracking = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], ganalytics = ganalytics.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], subscription_tracking = subscription_tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clicktracking]
  }
  @scala.inline
  implicit class ClicktrackingOps[Self <: Clicktracking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick_tracking(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGanalytics(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ganalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen_tracking(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription_tracking(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_tracking")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

