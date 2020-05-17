package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@js.native
trait DownloadOperation extends js.Object {
  /** Gets and sets the cost policy for the download. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  /** Gets a string value indicating the group the transfer belongs to. */
  var group: String = js.native
  /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
  var guid: String = js.native
  /** Gets the method to use for the download. */
  var method: String = js.native
  /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority = js.native
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundDownloadProgress = js.native
  /** Gets the URI from which to download the file. */
  var requestedUri: Uri = js.native
  /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
  var resultFile: IStorageFile = js.native
  /** Gets the group that this download operation belongs to. */
  var transferGroup: BackgroundTransferGroup = js.native
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
    * @return Download operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation = js.native
  /**
    * Gets the partially downloaded response at the specified position.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: Double): IInputStream = js.native
  /** Pauses a download operation. */
  def pause(): Unit = js.native
  /** Resumes a paused download operation. */
  def resume(): Unit = js.native
  /**
    * Starts an asynchronous download operation.
    * @return An asynchronous download operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation] = js.native
}

object DownloadOperation {
  @scala.inline
  def apply(
    attachAsync: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    pause: () => Unit,
    priority: BackgroundTransferPriority,
    progress: BackgroundDownloadProgress,
    requestedUri: Uri,
    resultFile: IStorageFile,
    resume: () => Unit,
    startAsync: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation],
    transferGroup: BackgroundTransferGroup
  ): DownloadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], resultFile = resultFile.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), startAsync = js.Any.fromFunction0(startAsync), transferGroup = transferGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOperation]
  }
  @scala.inline
  implicit class DownloadOperationOps[Self <: DownloadOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachAsync(value: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCostPolicy(value: BackgroundTransferCostPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetResponseInformation(value: () => ResponseInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseInformation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResultStreamAt(value: Double => IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResultStreamAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPriority(value: BackgroundTransferPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: BackgroundDownloadProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedUri")(value.asInstanceOf[js.Any])
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
    def withStartAsync(value: () => IPromiseWithIAsyncOperationWithProgress[DownloadOperation, DownloadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransferGroup(value: BackgroundTransferGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

