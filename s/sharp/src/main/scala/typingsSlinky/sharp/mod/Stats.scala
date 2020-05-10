package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  /** Array of channel statistics for each channel in the image. */
  var channels: js.Array[ChannelStats] = js.native
  /** Histogram-based estimation of greyscale entropy, discarding alpha channel if any (experimental) */
  var entropy: Double = js.native
  /** Value to identify if the image is opaque or transparent, based on the presence and use of alpha channel */
  var isOpaque: Boolean = js.native
}

object Stats {
  @scala.inline
  def apply(channels: js.Array[ChannelStats], entropy: Double, isOpaque: Boolean): Stats = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any], isOpaque = isOpaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[ChannelStats]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpaque(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpaque")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

