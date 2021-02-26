package typingsSlinky.winrtUwp.Windows.Storage.Pickers

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UI element that lets the user choose folders. */
@js.native
trait FolderPicker extends StObject {
  
  /** Gets or sets the label text of the folder picker's commit button. */
  var commitButtonText: String = js.native
  
  /** Gets a set of values to be populated by the app before a PickFolderAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: ValueSet = js.native
  
  /** Gets the collection of file types that the folder picker displays. */
  var fileTypeFilter: IVector[String] = js.native
  
  /** Shows the file picker so that the user can pick a folder, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickFolderAndContinue(): Unit = js.native
  
  /**
    * Shows the folderPicker object so that the user can pick a folder. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFolder object that represents the folder that the user picked.
    */
  def pickSingleFolderAsync(): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  
  /** Gets or sets the settings identifier associated with the with the current FolderPicker instance. */
  var settingsIdentifier: String = js.native
  
  /** Gets or sets the initial location where the folder picker looks for folders to present to the user. */
  var suggestedStartLocation: PickerLocationId = js.native
  
  /** Gets or sets the view mode that the folder picker uses to display items. */
  var viewMode: PickerViewMode = js.native
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
  implicit class FolderPickerMutableBuilder[Self <: FolderPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickFolderAndContinue(value: () => Unit): Self = StObject.set(x, "pickFolderAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleFolderAsync(value: () => IPromiseWithIAsyncOperation[StorageFolder]): Self = StObject.set(x, "pickSingleFolderAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
