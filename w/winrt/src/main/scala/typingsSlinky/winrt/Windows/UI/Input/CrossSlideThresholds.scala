package typingsSlinky.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossSlideThresholds extends js.Object {
  var rearrangeStart: Double = js.native
  var selectionStart: Double = js.native
  var speedBumpEnd: Double = js.native
  var speedBumpStart: Double = js.native
}

object CrossSlideThresholds {
  @scala.inline
  def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], speedBumpEnd = speedBumpEnd.asInstanceOf[js.Any], speedBumpStart = speedBumpStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlideThresholds]
  }
  @scala.inline
  implicit class CrossSlideThresholdsOps[Self <: CrossSlideThresholds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRearrangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearrangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedBumpEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedBumpEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedBumpStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedBumpStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

