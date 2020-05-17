package typingsSlinky.winrt.Windows.Storage.Compression

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decompressor extends IDecompressor {
  def dispose(): Unit = js.native
}

object Decompressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IInputStream,
    dispose: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
  ): Decompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), dispose = js.Any.fromFunction0(dispose), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[Decompressor]
  }
  @scala.inline
  implicit class DecompressorOps[Self <: Decompressor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

