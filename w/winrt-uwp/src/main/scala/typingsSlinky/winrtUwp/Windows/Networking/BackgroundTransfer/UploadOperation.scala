package typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous upload operation. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@js.native
trait UploadOperation extends js.Object {
  /** Gets and sets the cost policy for the upload. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  /** Gets a string value indicating the group the upload belongs to. */
  var group: String = js.native
  /** This is a unique identifier for a specific upload operation. A GUID associated to a upload operation will not change for the duration of the upload. */
  var guid: String = js.native
  /** Gets the method to use for the upload. */
  var method: String = js.native
  /** Gets or sets the transfer priority of this upload operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority = js.native
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundUploadProgress = js.native
  /** Gets the URI to upload from. */
  var requestedUri: Uri = js.native
  /** Specifies the IStorageFile to upload. */
  var sourceFile: IStorageFile = js.native
  /** Gets the group that this upload operation belongs to. */
  var transferGroup: BackgroundTransferGroup = js.native
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached upload. Calling this method allows an app to attach upload operations that were started in a previous app instance.
    * @return Upload operation with callback.
    */
  def attachAsync(): IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation = js.native
  /**
    * Gets the partially uploaded response at the specified location.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: Double): IInputStream = js.native
  /**
    * Starts an asynchronous upload operation.
    * @return An asynchronous upload operation that includes progress updates.
    */
  def startAsync(): IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
}

object UploadOperation {
  @scala.inline
  def apply(
    attachAsync: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation],
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    priority: BackgroundTransferPriority,
    progress: BackgroundUploadProgress,
    requestedUri: Uri,
    sourceFile: IStorageFile,
    startAsync: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation],
    transferGroup: BackgroundTransferGroup
  ): UploadOperation = {
    val __obj = js.Dynamic.literal(attachAsync = js.Any.fromFunction0(attachAsync), costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], startAsync = js.Any.fromFunction0(startAsync), transferGroup = transferGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOperation]
  }
  @scala.inline
  implicit class UploadOperationOps[Self <: UploadOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachAsync(value: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = {
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
    def withPriority(value: BackgroundTransferPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: BackgroundUploadProgress): Self = {
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
    def withSourceFile(value: IStorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAsync(value: () => IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation]): Self = {
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

