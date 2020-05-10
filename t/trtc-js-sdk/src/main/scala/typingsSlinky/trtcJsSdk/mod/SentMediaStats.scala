package typingsSlinky.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentMediaStats extends js.Object {
  /** 已发送字节数 */
  var bytesSent: Double = js.native
  /** 已发送包数 */
  var packetsSent: Double = js.native
}

object SentMediaStats {
  @scala.inline
  def apply(bytesSent: Double, packetsSent: Double): SentMediaStats = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], packetsSent = packetsSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMediaStats]
  }
  @scala.inline
  implicit class SentMediaStatsOps[Self <: SentMediaStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacketsSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetsSent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

