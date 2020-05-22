package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression")
@js.native
object Compression extends js.Object {
  @js.native
  class Compressor protected ()
    extends typingsSlinky.winrt.Windows.Storage.Compression.Compressor {
    def this(underlyingStream: IOutputStream) = this()
    def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def detachStream(): IOutputStream = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def finishAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @js.native
  class Decompressor protected ()
    extends typingsSlinky.winrt.Windows.Storage.Compression.Decompressor {
    def this(underlyingStream: IInputStream) = this()
    /* CompleteClass */
    override def close(): Unit = js.native
    /* CompleteClass */
    override def detachStream(): IInputStream = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  @js.native
  object CompressAlgorithm extends js.Object {
    /* 0 */ val invalidAlgorithm: typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm with Double = js.native
    /* 5 */ val lzms: typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm.lzms with Double = js.native
    /* 2 */ val mszip: typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm.mszip with Double = js.native
    /* 1 */ val nullAlgorithm: typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm with Double = js.native
    /* 3 */ val xpress: typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm.xpress with Double = js.native
    /* 4 */ val xpressHuff: typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm.xpressHuff with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Compression.CompressAlgorithm with Double] = js.native
  }
  
}

