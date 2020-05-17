package typingsSlinky.winrtUwp.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a write transaction for a random-access stream. */
@js.native
trait StorageStreamTransaction extends js.Object {
  /** Gets the random-access stream used in the transaction. */
  var stream: IRandomAccessStream = js.native
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  def close(): Unit = js.native
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  def commitAsync(): IPromiseWithIAsyncAction = js.native
}

object StorageStreamTransaction {
  @scala.inline
  def apply(close: () => Unit, commitAsync: () => IPromiseWithIAsyncAction, stream: IRandomAccessStream): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
  @scala.inline
  implicit class StorageStreamTransactionOps[Self <: StorageStreamTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommitAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStream(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

