package typingsSlinky.winrt.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSavePicker extends IFileSavePicker

object FileSavePicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    defaultFileExtension: String,
    fileTypeChoices: IMap[String, IVector[String]],
    pickSaveFileAndContinue: () => Unit,
    pickSaveFileAsync: () => IAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedFileName: String,
    suggestedSaveFile: StorageFile,
    suggestedStartLocation: PickerLocationId
  ): FileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], pickSaveFileAndContinue = js.Any.fromFunction0(pickSaveFileAndContinue), pickSaveFileAsync = js.Any.fromFunction0(pickSaveFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavePicker]
  }
}

