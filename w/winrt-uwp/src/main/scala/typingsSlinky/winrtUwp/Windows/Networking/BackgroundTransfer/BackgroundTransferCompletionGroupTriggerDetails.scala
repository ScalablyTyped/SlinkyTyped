package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
@js.native
trait BackgroundTransferCompletionGroupTriggerDetails extends StObject {
  
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
  implicit class BackgroundTransferCompletionGroupTriggerDetailsMutableBuilder[Self <: BackgroundTransferCompletionGroupTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloads(value: IVectorView[DownloadOperation]): Self = StObject.set(x, "downloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploads(value: IVectorView[UploadOperation]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
  }
}
