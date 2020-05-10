package typingsSlinky.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BandwidthStatistics extends js.Object {
  var inboundBandwidthPeaked: Boolean = js.native
  var inboundBitsPerSecond: Double = js.native
  var inboundBitsPerSecondInstability: Double = js.native
  var outboundBandwidthPeaked: Boolean = js.native
  var outboundBitsPerSecond: Double = js.native
  var outboundBitsPerSecondInstability: Double = js.native
}

object BandwidthStatistics {
  @scala.inline
  def apply(
    inboundBandwidthPeaked: Boolean,
    inboundBitsPerSecond: Double,
    inboundBitsPerSecondInstability: Double,
    outboundBandwidthPeaked: Boolean,
    outboundBitsPerSecond: Double,
    outboundBitsPerSecondInstability: Double
  ): BandwidthStatistics = {
    val __obj = js.Dynamic.literal(inboundBandwidthPeaked = inboundBandwidthPeaked.asInstanceOf[js.Any], inboundBitsPerSecond = inboundBitsPerSecond.asInstanceOf[js.Any], inboundBitsPerSecondInstability = inboundBitsPerSecondInstability.asInstanceOf[js.Any], outboundBandwidthPeaked = outboundBandwidthPeaked.asInstanceOf[js.Any], outboundBitsPerSecond = outboundBitsPerSecond.asInstanceOf[js.Any], outboundBitsPerSecondInstability = outboundBitsPerSecondInstability.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthStatistics]
  }
  @scala.inline
  implicit class BandwidthStatisticsOps[Self <: BandwidthStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInboundBandwidthPeaked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundBandwidthPeaked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundBitsPerSecondInstability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundBitsPerSecondInstability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundBandwidthPeaked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundBandwidthPeaked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundBitsPerSecondInstability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundBitsPerSecondInstability")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

