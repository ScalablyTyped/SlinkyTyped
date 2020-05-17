package typingsSlinky.winrtUwp.Windows.Storage.Pickers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UI element that lets the user choose folders. */
@js.native
trait FolderPicker extends js.Object {
  /** Gets or sets the label text of the folder picker's commit button. */
  var commitButtonText: String = js.native
  /** Gets a set of values to be populated by the app before a PickFolderAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: ValueSet = js.native
  /** Gets the collection of file types that the folder picker displays. */
  var fileTypeFilter: IVector[String] = js.native
  /** Gets or sets the settings identifier associated with the with the current FolderPicker instance. */
  var settingsIdentifier: String = js.native
  /** Gets or sets the initial location where the folder picker looks for folders to present to the user. */
  var suggestedStartLocation: PickerLocationId = js.native
  /** Gets or sets the view mode that the folder picker uses to display items. */
  var viewMode: PickerViewMode = js.native
  /** Shows the file picker so that the user can pick a folder, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickFolderAndContinue(): Unit = js.native
  /**
    * Shows the folderPicker object so that the user can pick a folder. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFolder object that represents the folder that the user picked.
    */
  def pickSingleFolderAsync(): IPromiseWithIAsyncOperation[StorageFolder] = js.native
}

object FolderPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickFolderAndContinue: () => Unit,
    pickSingleFolderAsync: () => IPromiseWithIAsyncOperation[StorageFolder],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): FolderPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickFolderAndContinue = js.Any.fromFunction0(pickFolderAndContinue), pickSingleFolderAsync = js.Any.fromFunction0(pickSingleFolderAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPicker]
  }
  @scala.inline
  implicit class FolderPickerOps[Self <: FolderPicker] (val x: Self) extends AnyVal {
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
    def withPickSingleFolderAsync(value: () => IPromiseWithIAsyncOperation[StorageFolder]): Self = {
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

