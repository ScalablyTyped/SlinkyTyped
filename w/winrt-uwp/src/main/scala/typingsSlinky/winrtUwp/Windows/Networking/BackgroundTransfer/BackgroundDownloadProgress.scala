package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information about the download operation. */
@js.native
trait BackgroundDownloadProgress extends js.Object {
  /** The total number of bytes received. This value does not include bytes received as response headers. */
  var bytesReceived: Double = js.native
  /** true if the download request response has changed; otherwise, false. */
  var hasResponseChanged: Boolean = js.native
  /** true if a data transfer operation has restarted; otherwise false. */
  var hasRestarted: Boolean = js.native
  /** The current status of the download operation. */
  var status: BackgroundTransferStatus = js.native
  /** The total number of bytes of data to download. If this number is unknown, this value is set to 0. */
  var totalBytesToReceive: Double = js.native
}

object BackgroundDownloadProgress {
  @scala.inline
  def apply(
    bytesReceived: Double,
    hasResponseChanged: Boolean,
    hasRestarted: Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: Double
  ): BackgroundDownloadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], hasResponseChanged = hasResponseChanged.asInstanceOf[js.Any], hasRestarted = hasRestarted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundDownloadProgress]
  }
  @scala.inline
  implicit class BackgroundDownloadProgressOps[Self <: BackgroundDownloadProgress] (val x: Self) extends AnyVal {
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
    def withHasResponseChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasResponseChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRestarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRestarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: BackgroundTransferStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBytesToReceive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToReceive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

