package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundUploadProgress extends js.Object {
  var bytesReceived: Double = js.native
  var bytesSent: Double = js.native
  var hasResponseChanged: Boolean = js.native
  var hasRestarted: Boolean = js.native
  var status: BackgroundTransferStatus = js.native
  var totalBytesToReceive: Double = js.native
  var totalBytesToSend: Double = js.native
}

object BackgroundUploadProgress {
  @scala.inline
  def apply(
    bytesReceived: Double,
    bytesSent: Double,
    hasResponseChanged: Boolean,
    hasRestarted: Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: Double,
    totalBytesToSend: Double
  ): BackgroundUploadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], hasResponseChanged = hasResponseChanged.asInstanceOf[js.Any], hasRestarted = hasRestarted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundUploadProgress]
  }
  @scala.inline
  implicit class BackgroundUploadProgressOps[Self <: BackgroundUploadProgress] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTotalBytesToSend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytesToSend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

