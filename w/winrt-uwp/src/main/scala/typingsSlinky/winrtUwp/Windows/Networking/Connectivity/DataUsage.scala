package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
@js.native
trait DataUsage extends js.Object {
  /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
  var bytesReceived: Double = js.native
  /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
  var bytesSent: Double = js.native
}

object DataUsage {
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double): DataUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUsage]
  }
  @scala.inline
  implicit class DataUsageOps[Self <: DataUsage] (val x: Self) extends AnyVal {
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
  }
  
}

