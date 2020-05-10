package typingsSlinky.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceivedMediaStats extends js.Object {
  /** 已接收字节数 */
  var bytesReceived: Double = js.native
  /** 丢包数 */
  var packetsLost: Double = js.native
  /** 已接收包数 */
  var packetsReceived: Double = js.native
}

object ReceivedMediaStats {
  @scala.inline
  def apply(bytesReceived: Double, packetsLost: Double, packetsReceived: Double): ReceivedMediaStats = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], packetsLost = packetsLost.asInstanceOf[js.Any], packetsReceived = packetsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedMediaStats]
  }
  @scala.inline
  implicit class ReceivedMediaStatsOps[Self <: ReceivedMediaStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacketsLost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsLost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacketsReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsReceived")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

