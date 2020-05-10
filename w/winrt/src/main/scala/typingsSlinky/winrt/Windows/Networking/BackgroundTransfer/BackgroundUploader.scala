package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
class BackgroundUploader () extends IBackgroundUploader

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
@js.native
object BackgroundUploader extends js.Object {
  def getCurrentUploadsAsync(): IAsyncOperation[IVectorView[UploadOperation]] = js.native
  def getCurrentUploadsAsync(group: String): IAsyncOperation[IVectorView[UploadOperation]] = js.native
}

