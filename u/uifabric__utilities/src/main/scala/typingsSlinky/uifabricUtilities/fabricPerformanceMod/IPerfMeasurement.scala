package typingsSlinky.uifabricUtilities.fabricPerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPerfMeasurement extends js.Object {
  var all: js.Array[IPerfData] = js.native
  var count: Double = js.native
  var totalDuration: Double = js.native
}

object IPerfMeasurement {
  @scala.inline
  def apply(all: js.Array[IPerfData], count: Double, totalDuration: Double): IPerfMeasurement = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], totalDuration = totalDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfMeasurement]
  }
  @scala.inline
  implicit class IPerfMeasurementOps[Self <: IPerfMeasurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: js.Array[IPerfData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

