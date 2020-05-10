package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDownloadOperation extends IBackgroundTransferOperation {
  var progress: BackgroundDownloadProgress = js.native
  var resultFile: IStorageFile = js.native
  def attachAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def startAsync(): IAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
}

object IDownloadOperation {
  @scala.inline
  def apply(
    attachAsync: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: () => Unit,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: () => Unit,
    startAsync: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]
  ): IDownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync))
    __obj.asInstanceOf[IDownloadOperation]
  }
  @scala.inline
  implicit class IDownloadOperationOps[Self <: IDownloadOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachAsync(value: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgress(value: BackgroundDownloadProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultFile(value: IStorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartAsync(value: () => IAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

