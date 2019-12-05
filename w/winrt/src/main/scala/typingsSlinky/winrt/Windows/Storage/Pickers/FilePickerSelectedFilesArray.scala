package typingsSlinky.winrt.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
@js.native
class FilePickerSelectedFilesArray () extends IVectorView[StorageFile] {
  /* CompleteClass */
  override def first(): IIterator[StorageFile] = js.native
}

