package typingsSlinky.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportStats extends js.Object {
  /** SDK 到腾讯视频云的 RTT (Round-Trip Time)，单位 ms */
  var rtt: Double = js.native
}

object TransportStats {
  @scala.inline
  def apply(rtt: Double): TransportStats = {
    val __obj = js.Dynamic.literal(rtt = rtt.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportStats]
  }
  @scala.inline
  implicit class TransportStatsOps[Self <: TransportStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRtt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

