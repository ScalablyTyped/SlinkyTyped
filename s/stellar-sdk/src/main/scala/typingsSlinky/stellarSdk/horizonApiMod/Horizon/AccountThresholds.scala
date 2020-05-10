package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountThresholds extends js.Object {
  var high_threshold: Double = js.native
  var low_threshold: Double = js.native
  var med_threshold: Double = js.native
}

object AccountThresholds {
  @scala.inline
  def apply(high_threshold: Double, low_threshold: Double, med_threshold: Double): AccountThresholds = {
    val __obj = js.Dynamic.literal(high_threshold = high_threshold.asInstanceOf[js.Any], low_threshold = low_threshold.asInstanceOf[js.Any], med_threshold = med_threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountThresholds]
  }
  @scala.inline
  implicit class AccountThresholdsOps[Self <: AccountThresholds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMed_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("med_threshold")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

