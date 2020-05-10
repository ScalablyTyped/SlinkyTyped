package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.DataWriter")
@js.native
class DataWriter ()
  extends IDataWriter
     with IClosable {
  def this(outputStream: IOutputStream) = this()
  def dispose(): Unit = js.native
}

