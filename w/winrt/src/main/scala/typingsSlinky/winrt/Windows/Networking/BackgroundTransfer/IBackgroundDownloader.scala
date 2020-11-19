package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundDownloader extends IBackgroundTransferBase {
  
  def createDownload(uri: Uri, resultFile: IStorageFile): DownloadOperation = js.native
  def createDownload(uri: Uri, resultFile: IStorageFile, requestBodyFile: IStorageFile): DownloadOperation = js.native
  
  def createDownloadAsync(uri: Uri, resultFile: IStorageFile, requestBodyStream: IInputStream): IAsyncOperation[DownloadOperation] = js.native
}
