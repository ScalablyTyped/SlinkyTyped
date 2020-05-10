package typingsSlinky.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends js.Object {
  var heartbeatPacketType: PacketType = js.native
  var keepAliveMillis: js.UndefOr[Double] = js.native
  var rxTimeoutMillis: js.UndefOr[Double] = js.native
  var txIntervalMillis: js.UndefOr[Double] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(heartbeatPacketType: PacketType): ConnectionOptions = {
    val __obj = js.Dynamic.literal(heartbeatPacketType = heartbeatPacketType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeartbeatPacketType(value: PacketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatPacketType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepAliveMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAliveMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAliveMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withRxTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRxTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rxTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTxIntervalMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txIntervalMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxIntervalMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txIntervalMillis")(js.undefined)
        ret
    }
  }
  
}

