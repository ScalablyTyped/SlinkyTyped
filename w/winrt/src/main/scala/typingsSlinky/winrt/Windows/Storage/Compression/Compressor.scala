package typingsSlinky.winrt.Windows.Storage.Compression

import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression.Compressor")
@js.native
class Compressor protected () extends ICompressor {
  def this(underlyingStream: IOutputStream) = this()
  def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
  def dispose(): Unit = js.native
}

