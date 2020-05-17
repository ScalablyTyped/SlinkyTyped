package typingsSlinky.winrtUwp.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides random access of data in input and output streams for a file. */
@js.native
trait RandomAccessStreamReference extends js.Object {
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

object RandomAccessStreamReference {
  @scala.inline
  def apply(openReadAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): RandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = js.Any.fromFunction0(openReadAsync))
    __obj.asInstanceOf[RandomAccessStreamReference]
  }
  @scala.inline
  implicit class RandomAccessStreamReferenceOps[Self <: RandomAccessStreamReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenReadAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openReadAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

