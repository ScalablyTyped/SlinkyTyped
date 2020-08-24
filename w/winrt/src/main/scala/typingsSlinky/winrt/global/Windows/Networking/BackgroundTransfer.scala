package typingsSlinky.winrt.global.Windows.Networking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer")
@js.native
object BackgroundTransfer extends js.Object {
  @js.native
  class BackgroundDownloader ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundDownloader
  
  @js.native
  class BackgroundTransferContentPart ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
    def this(name: String) = this()
    def this(name: String, fileName: String) = this()
  }
  
  @js.native
  class BackgroundTransferError ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  
  @js.native
  class BackgroundUploader ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundUploader
  
  @js.native
  class DownloadOperation ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation
  
  @js.native
  class ResponseInformation ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.ResponseInformation
  
  @js.native
  class UploadOperation ()
    extends typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.UploadOperation
  
  /* static members */
  @js.native
  object BackgroundDownloader extends js.Object {
    def getCurrentDownloadsAsync(): IAsyncOperation[
        IVectorView[typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = js.native
    def getCurrentDownloadsAsync(group: String): IAsyncOperation[
        IVectorView[typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.DownloadOperation]
      ] = js.native
  }
  
  @js.native
  object BackgroundTransferCostPolicy extends js.Object {
    /* 2 */ val always: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always with Double = js.native
    /* 0 */ val default: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default with Double = js.native
    /* 1 */ val unrestrictedOnly: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundTransferError extends js.Object {
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
  
  @js.native
  object BackgroundTransferStatus extends js.Object {
    /* 6 */ val canceled: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
    /* 5 */ val completed: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
    /* 7 */ val error: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
    /* 0 */ val idle: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
    /* 2 */ val pausedByApplication: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
    /* 3 */ val pausedCostedNetwork: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
    /* 4 */ val pausedNoNetwork: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
    /* 1 */ val running: typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundUploader extends js.Object {
    def getCurrentUploadsAsync(): IAsyncOperation[
        IVectorView[typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]
      ] = js.native
    def getCurrentUploadsAsync(group: String): IAsyncOperation[
        IVectorView[typingsSlinky.winrt.Windows.Networking.BackgroundTransfer.UploadOperation]
      ] = js.native
  }
  
}

