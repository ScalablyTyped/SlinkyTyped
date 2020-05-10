package typingsSlinky.winrt.Windows.Storage.Compression

import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression.Decompressor")
@js.native
class Decompressor protected () extends IDecompressor {
  def this(underlyingStream: IInputStream) = this()
  def dispose(): Unit = js.native
}

