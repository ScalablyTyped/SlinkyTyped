package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTimestamp extends js.Object {
  var contextTime: js.UndefOr[Double] = js.native
  var performanceTime: js.UndefOr[Double] = js.native
}

object AudioTimestamp {
  @scala.inline
  def apply(): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTimestamp]
  }
  @scala.inline
  implicit class AudioTimestampOps[Self <: AudioTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceTime")(js.undefined)
        ret
    }
  }
  
}

