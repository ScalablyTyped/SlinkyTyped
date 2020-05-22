package typingsSlinky.winrt.global.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileSavePicker")
@js.native
class FileSavePicker ()
  extends typingsSlinky.winrt.Windows.Storage.Pickers.FileSavePicker {
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /* CompleteClass */
  override var defaultFileExtension: String = js.native
  /* CompleteClass */
  override var fileTypeChoices: IMap[String, IVector[String]] = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var suggestedFileName: String = js.native
  /* CompleteClass */
  override var suggestedSaveFile: StorageFile = js.native
  /* CompleteClass */
  override var suggestedStartLocation: typingsSlinky.winrt.Windows.Storage.Pickers.PickerLocationId = js.native
  /* CompleteClass */
  override def pickSaveFileAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickSaveFileAsync(): IAsyncOperation[StorageFile] = js.native
}

