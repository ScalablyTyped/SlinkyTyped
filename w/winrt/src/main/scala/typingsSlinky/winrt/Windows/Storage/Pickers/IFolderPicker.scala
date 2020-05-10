package typingsSlinky.winrt.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderPicker extends js.Object {
  var commitButtonText: String = js.native
  var continuationData: ValueSet = js.native
  var fileTypeFilter: IVector[String] = js.native
  var settingsIdentifier: String = js.native
  var suggestedStartLocation: PickerLocationId = js.native
  var viewMode: PickerViewMode = js.native
  def pickFolderAndContinue(): Unit = js.native
  def pickSingleFolderAsync(): IAsyncOperation[StorageFolder] = js.native
}

object IFolderPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickFolderAndContinue: () => Unit,
    pickSingleFolderAsync: () => IAsyncOperation[StorageFolder],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFolderPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickFolderAndContinue = js.Any.fromFunction0(pickFolderAndContinue), pickSingleFolderAsync = js.Any.fromFunction0(pickSingleFolderAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderPicker]
  }
  @scala.inline
  implicit class IFolderPickerOps[Self <: IFolderPicker] (val x: Self) extends AnyVal {
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
    def withPickFolderAndContinue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickFolderAndContinue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickSingleFolderAsync(value: () => IAsyncOperation[StorageFolder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSingleFolderAsync")(js.Any.fromFunction0(value))
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

