package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactPicker extends StObject {
  
  var commitButtonText: String = js.native
  
  var desiredFields: IVector[String] = js.native
  
  def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]] = js.native
  
  def pickSingleContactAsync(): IAsyncOperation[ContactInformation] = js.native
  
  var selectionMode: ContactSelectionMode = js.native
}
object IContactPicker {
  
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: () => IAsyncOperation[IVectorView[ContactInformation]],
    pickSingleContactAsync: () => IAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPicker]
  }
  
  @scala.inline
  implicit class IContactPickerMutableBuilder[Self <: IContactPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredFields(value: IVector[String]): Self = StObject.set(x, "desiredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickMultipleContactsAsync(value: () => IAsyncOperation[IVectorView[ContactInformation]]): Self = StObject.set(x, "pickMultipleContactsAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleContactAsync(value: () => IAsyncOperation[ContactInformation]): Self = StObject.set(x, "pickSingleContactAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectionMode(value: ContactSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
