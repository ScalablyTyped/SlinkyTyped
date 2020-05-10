package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStats extends js.Object {
  /** maximum value in the channel */
  var max: Double = js.native
  /** x-coordinate of one of the pixel where the maximum lies */
  var maxX: Double = js.native
  /** y-coordinate of one of the pixel where the maximum lies */
  var maxY: Double = js.native
  /** mean of the values in a channel */
  var mean: Double = js.native
  /** minimum value in the channel */
  var min: Double = js.native
  /** x-coordinate of one of the pixel where the minimum lies */
  var minX: Double = js.native
  /** y-coordinate of one of the pixel where the minimum lies */
  var minY: Double = js.native
  /** sum of squared values in a channel */
  var squaresSum: Double = js.native
  /** standard deviation for the values in a channel */
  var stdev: Double = js.native
  /** sum of all values in a channel */
  var sum: Double = js.native
}

object ChannelStats {
  @scala.inline
  def apply(
    max: Double,
    maxX: Double,
    maxY: Double,
    mean: Double,
    min: Double,
    minX: Double,
    minY: Double,
    squaresSum: Double,
    stdev: Double,
    sum: Double
  ): ChannelStats = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], squaresSum = squaresSum.asInstanceOf[js.Any], stdev = stdev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStats]
  }
  @scala.inline
  implicit class ChannelStatsOps[Self <: ChannelStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquaresSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squaresSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdev(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

