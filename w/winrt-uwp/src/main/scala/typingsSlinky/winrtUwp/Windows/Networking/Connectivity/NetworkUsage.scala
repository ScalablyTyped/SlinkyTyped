package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents network usage statistics returned by the ConnectionProfile . GetNetworkUsageAsync method. */
@js.native
trait NetworkUsage extends js.Object {
  /** Indicates the number of bytes received by the connection of a specific period of time. */
  var bytesReceived: Double = js.native
  /** Indicates the number of bytes sent by a connection over a specific period of time. */
  var bytesSent: Double = js.native
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double = js.native
}

object NetworkUsage {
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double, connectionDuration: Double): NetworkUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], connectionDuration = connectionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUsage]
  }
  @scala.inline
  implicit class NetworkUsageOps[Self <: NetworkUsage] (val x: Self) extends AnyVal {
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
    def withBytesSent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

