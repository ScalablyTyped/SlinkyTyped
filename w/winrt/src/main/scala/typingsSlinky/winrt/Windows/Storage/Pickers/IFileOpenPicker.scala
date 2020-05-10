package typingsSlinky.winrt.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileOpenPicker extends js.Object {
  var commitButtonText: String = js.native
  var continuationData: ValueSet = js.native
  var fileTypeFilter: IVector[String] = js.native
  var settingsIdentifier: String = js.native
  var suggestedStartLocation: PickerLocationId = js.native
  var viewMode: PickerViewMode = js.native
  def pickMultipleFilesAndContinue(): Unit = js.native
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def pickSingleFileAndContinue(): Unit = js.native
  def pickSingleFileAsync(): IAsyncOperation[StorageFile] = js.native
}

object IFileOpenPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickMultipleFilesAndContinue: () => Unit,
    pickMultipleFilesAsync: () => IAsyncOperation[IVectorView[StorageFile]],
    pickSingleFileAndContinue: () => Unit,
    pickSingleFileAsync: () => IAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFileOpenPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickMultipleFilesAndContinue = js.Any.fromFunction0(pickMultipleFilesAndContinue), pickMultipleFilesAsync = js.Any.fromFunction0(pickMultipleFilesAsync), pickSingleFileAndContinue = js.Any.fromFunction0(pickSingleFileAndContinue), pickSingleFileAsync = js.Any.fromFunction0(pickSingleFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPicker]
  }
  @scala.inline
  implicit class IFileOpenPickerOps[Self <: IFileOpenPicker] (val x: Self) extends AnyVal {
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
    def withFileTypeFilter(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickMultipleFilesAndContinue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickMultipleFilesAndContinue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickMultipleFilesAsync(value: () => IAsyncOperation[IVectorView[StorageFile]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickMultipleFilesAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickSingleFileAndContinue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSingleFileAndContinue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickSingleFileAsync(value: () => IAsyncOperation[StorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSingleFileAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSettingsIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestedStartLocation(value: PickerLocationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedStartLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMode(value: PickerViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

