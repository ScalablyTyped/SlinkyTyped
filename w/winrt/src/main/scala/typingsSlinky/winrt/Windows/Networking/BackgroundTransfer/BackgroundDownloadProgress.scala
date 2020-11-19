package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundDownloadProgress extends js.Object {
  
  var bytesReceived: Double = js.native
  
  var hasResponseChanged: Boolean = js.native
  
  var hasRestarted: Boolean = js.native
  
  var status: BackgroundTransferStatus = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasResponseChanged(value: Boolean): Self = this.set("hasResponseChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRestarted(value: Boolean): Self = this.set("hasRestarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BackgroundTransferStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToReceive(value: Double): Self = this.set("totalBytesToReceive", value.asInstanceOf[js.Any])
  }
}
