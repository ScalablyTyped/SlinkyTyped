package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataWriter
  extends IDataWriter
     with IClosable {
  def dispose(): Unit = js.native
}

