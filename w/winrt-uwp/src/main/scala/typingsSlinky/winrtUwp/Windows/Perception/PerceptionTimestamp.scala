package typingsSlinky.winrtUwp.Windows.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerceptionTimestamp extends js.Object {
  var predictionAmount: js.Any = js.native
   /* unmapped type */ var targetTime: js.Any = js.native
}

object PerceptionTimestamp {
  @scala.inline
  def apply(predictionAmount: js.Any, targetTime: js.Any): PerceptionTimestamp = {
    val __obj = js.Dynamic.literal(predictionAmount = predictionAmount.asInstanceOf[js.Any], targetTime = targetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionTimestamp]
  }
  @scala.inline
  implicit class PerceptionTimestampOps[Self <: PerceptionTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredictionAmount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predictionAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

