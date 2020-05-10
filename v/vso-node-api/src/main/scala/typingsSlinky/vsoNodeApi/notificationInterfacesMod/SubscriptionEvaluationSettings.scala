package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionEvaluationSettings extends js.Object {
  /**
    * Indicates whether subscription evaluation before saving is enabled or not
    */
  var enabled: Boolean = js.native
  /**
    * Time interval to check on subscription evaluation job in seconds
    */
  var interval: Double = js.native
  /**
    * Threshold on the number of notifications for considering a subscription too noisy
    */
  var threshold: Double = js.native
  /**
    * Time out for the subscription evaluation check in seconds
    */
  var timeOut: Double = js.native
}

object SubscriptionEvaluationSettings {
  @scala.inline
  def apply(enabled: Boolean, interval: Double, threshold: Double, timeOut: Double): SubscriptionEvaluationSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], timeOut = timeOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionEvaluationSettings]
  }
  @scala.inline
  implicit class SubscriptionEvaluationSettingsOps[Self <: SubscriptionEvaluationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

