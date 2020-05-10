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
trait IFileSavePicker extends js.Object {
  var commitButtonText: String = js.native
  var continuationData: ValueSet = js.native
  var defaultFileExtension: String = js.native
  var fileTypeChoices: IMap[String, IVector[String]] = js.native
  var settingsIdentifier: String = js.native
  var suggestedFileName: String = js.native
  var suggestedSaveFile: StorageFile = js.native
  var suggestedStartLocation: PickerLocationId = js.native
  def pickSaveFileAndContinue(): Unit = js.native
  def pickSaveFileAsync(): IAsyncOperation[StorageFile] = js.native
}

object IFileSavePicker {
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
  ): IFileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], pickSaveFileAndContinue = js.Any.fromFunction0(pickSaveFileAndContinue), pickSaveFileAsync = js.Any.fromFunction0(pickSaveFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileSavePicker]
  }
  @scala.inline
  implicit class IFileSavePickerOps[Self <: IFileSavePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinuationData(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileTypeChoices(value: IMap[String, IVector[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypeChoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickSaveFileAndContinue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSaveFileAndContinue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickSaveFileAsync(value: () => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSaveFileAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSettingsIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedSaveFile(value: StorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedSaveFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedStartLocation(value: PickerLocationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedStartLocation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

