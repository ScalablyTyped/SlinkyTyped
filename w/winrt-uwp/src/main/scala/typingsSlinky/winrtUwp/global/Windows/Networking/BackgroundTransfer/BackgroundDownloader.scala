package typingsSlinky.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to configure downloads prior to the actual creation of the download operation using CreateDownload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
/** Creates a new BackgroundDownloader object. */
class BackgroundDownloader ()
  extends typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundDownloader {
  /**
    * Creates a new BackgroundDownloader object with a BackgroundTransferCompletionGroup .
    * @param completionGroup The completion group to associate with this BackgroundDownloader object.
    */
  def this(completionGroup: typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup) = this()
}

/* static members */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
@js.native
object BackgroundDownloader extends js.Object {
  /**
    * Returns a collection of pending downloads that are not associated with a group.
    * @return A collection of pending downloads for the current application instance.
    */
  def getCurrentDownloadsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Returns a collection of pending downloads for a specific Group .
    * @param group A string indicating a specific group of transfers.
    * @return A collection of pending downloads for the specific group.
    */
  def getCurrentDownloadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets all downloads associated with the provided BackgroundTransferGroup .
    * @param group Contains information used to identify a group of downloads.
    * @return A list of downloads currently associated with the specified group.
    */
  def getCurrentDownloadsForTransferGroupAsync(group: typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Used to request an unconstrained download operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
    * @param operations The download operation to run unconstrained.
    * @return Indicates if the operations will run unconstrained.
    */
  def requestUnconstrainedDownloadsAsync(
    operations: IIterable[typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation]
  ): IPromiseWithIAsyncOperation[
    typingsSlinky.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
  ] = js.native
}

