package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
class BackgroundDownloader () extends IBackgroundDownloader

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
object BackgroundDownloader extends js.Object {
  def getCurrentDownloadsAsync(): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
  def getCurrentDownloadsAsync(group: String): IAsyncOperation[IVectorView[DownloadOperation]] = js.native
}

