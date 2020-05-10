package typingsSlinky.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpipForwardingConfig extends js.Object {
  /**
    * Destination IP address of outgoing connection.
    */
  var destIP: String = js.native
  /**
    * Destination port of outgoing connection.
    */
  var destPort: Double = js.native
  /**
    * Source IP address of outgoing connection.
    */
  var srcIP: String = js.native
  /**
    * Source port of outgoing connection.
    */
  var srcPort: Double = js.native
}

object TcpipForwardingConfig {
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipForwardingConfig = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardingConfig]
  }
  @scala.inline
  implicit class TcpipForwardingConfigOps[Self <: TcpipForwardingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcPort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

