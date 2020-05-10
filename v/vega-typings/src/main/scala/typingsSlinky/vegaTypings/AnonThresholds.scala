package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonThresholds extends js.Object {
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
}

object AnonThresholds {
  @scala.inline
  def apply(): AnonThresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonThresholds]
  }
  @scala.inline
  implicit class AnonThresholdsOps[Self <: AnonThresholds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
  }
  
}

