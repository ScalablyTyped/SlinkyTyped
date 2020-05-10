package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
class RandomAccessStreamReference () extends IRandomAccessStreamReference

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  def createFromFile(file: IStorageFile): RandomAccessStreamReference = js.native
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference = js.native
  def createFromUri(uri: Uri): RandomAccessStreamReference = js.native
}

