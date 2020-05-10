package typingsSlinky.winrt.Windows.Storage.Compression

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompressor extends IOutputStream {
  def detachStream(): IOutputStream = js.native
  def finishAsync(): IAsyncOperation[Boolean] = js.native
}

object ICompressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IOutputStream,
    finishAsync: () => IAsyncOperation[Boolean],
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): ICompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[ICompressor]
  }
  @scala.inline
  implicit class ICompressorOps[Self <: ICompressor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetachStream(value: () => IOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFinishAsync(value: () => IAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

