package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
@js.native
trait BackgroundTransferCompletionGroupTriggerDetails extends js.Object {
  /** Gets the list of DownloadOperation objects associated with the BackgroundTransferCompletionGroup . */
  var downloads: IVectorView[DownloadOperation] = js.native
  /** Gets the list of UploadOperation objects associated with the BackgroundTransferCompletionGroup . */
  var uploads: IVectorView[UploadOperation] = js.native
}

object BackgroundTransferCompletionGroupTriggerDetails {
  @scala.inline
  def apply(downloads: IVectorView[DownloadOperation], uploads: IVectorView[UploadOperation]): BackgroundTransferCompletionGroupTriggerDetails = {
    val __obj = js.Dynamic.literal(downloads = downloads.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTransferCompletionGroupTriggerDetails]
  }
  @scala.inline
  implicit class BackgroundTransferCompletionGroupTriggerDetailsOps[Self <: BackgroundTransferCompletionGroupTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloads(value: IVectorView[DownloadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploads(value: IVectorView[UploadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

