package typingsSlinky.winrt.Windows.Storage.Pickers

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileOpenPicker extends StObject {
  
  var commitButtonText: String = js.native
  
  var continuationData: ValueSet = js.native
  
  var fileTypeFilter: IVector[String] = js.native
  
  def pickMultipleFilesAndContinue(): Unit = js.native
  
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  
  def pickSingleFileAndContinue(): Unit = js.native
  
  def pickSingleFileAsync(): IAsyncOperation[StorageFile] = js.native
  
  var settingsIdentifier: String = js.native
  
  var suggestedStartLocation: PickerLocationId = js.native
  
  var viewMode: PickerViewMode = js.native
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
  implicit class IFileOpenPickerMutableBuilder[Self <: IFileOpenPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickMultipleFilesAndContinue(value: () => Unit): Self = StObject.set(x, "pickMultipleFilesAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickMultipleFilesAsync(value: () => IAsyncOperation[IVectorView[StorageFile]]): Self = StObject.set(x, "pickMultipleFilesAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleFileAndContinue(value: () => Unit): Self = StObject.set(x, "pickSingleFileAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleFileAsync(value: () => IAsyncOperation[StorageFile]): Self = StObject.set(x, "pickSingleFileAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
