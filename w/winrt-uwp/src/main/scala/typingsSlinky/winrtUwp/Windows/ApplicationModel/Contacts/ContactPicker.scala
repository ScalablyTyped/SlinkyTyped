package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls how the Contact Picker user interface opens and what information it shows. */
@js.native
trait ContactPicker extends StObject {
  
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  var commitButtonText: String = js.native
  
  /** Sets the contact fields your app is interested in. */
  var desiredFields: IVector[String] = js.native
  
  /** Gets the ways to connect with a contact. */
  var desiredFieldsWithContactFieldType: IVector[ContactFieldType] = js.native
  
  /**
    * Launches the Contact Picker to select a single contact.
    * @return The operation that launches the Contact Picker.
    */
  def pickContactAsync(): IPromiseWithIAsyncOperation[Contact] = js.native
  
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  def pickContactsAsync(): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  
  /**
    * Launches the Contact Picker for selecting multiple contacts.
    * @return The operation that launches the contact picker.
    */
  def pickMultipleContactsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Launches the Contact Picker for selecting a single contact.
    * @return The operation that launches the Contact Picker.
    */
  def pickSingleContactAsync(): IPromiseWithIAsyncOperation[ContactInformation] = js.native
  
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  var selectionMode: ContactSelectionMode = js.native
}
object ContactPicker {
  
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    desiredFieldsWithContactFieldType: IVector[ContactFieldType],
    pickContactAsync: () => IPromiseWithIAsyncOperation[Contact],
    pickContactsAsync: () => IPromiseWithIAsyncOperation[IVector[_]],
    pickMultipleContactsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    pickSingleContactAsync: () => IPromiseWithIAsyncOperation[ContactInformation],
    selectionMode: ContactSelectionMode
  ): ContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], desiredFieldsWithContactFieldType = desiredFieldsWithContactFieldType.asInstanceOf[js.Any], pickContactAsync = js.Any.fromFunction0(pickContactAsync), pickContactsAsync = js.Any.fromFunction0(pickContactsAsync), pickMultipleContactsAsync = js.Any.fromFunction0(pickMultipleContactsAsync), pickSingleContactAsync = js.Any.fromFunction0(pickSingleContactAsync), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPicker]
  }
  
  @scala.inline
  implicit class ContactPickerMutableBuilder[Self <: ContactPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredFields(value: IVector[String]): Self = StObject.set(x, "desiredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredFieldsWithContactFieldType(value: IVector[ContactFieldType]): Self = StObject.set(x, "desiredFieldsWithContactFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickContactAsync(value: () => IPromiseWithIAsyncOperation[Contact]): Self = StObject.set(x, "pickContactAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickContactsAsync(value: () => IPromiseWithIAsyncOperation[IVector[_]]): Self = StObject.set(x, "pickContactsAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickMultipleContactsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "pickMultipleContactsAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleContactAsync(value: () => IPromiseWithIAsyncOperation[ContactInformation]): Self = StObject.set(x, "pickSingleContactAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectionMode(value: ContactSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
