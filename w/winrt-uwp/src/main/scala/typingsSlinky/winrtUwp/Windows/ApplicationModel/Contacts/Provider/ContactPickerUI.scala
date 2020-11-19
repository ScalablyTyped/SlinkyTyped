package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Provider

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactFieldType
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.contactremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows you to call the contact picker UI so you can select one or more contacts. */
@js.native
trait ContactPickerUI extends js.Object {
  
  /**
    * Adds a Contact .
    * @param contact An object that contains the contact's information.
    * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
    */
  def addContact(contact: Contact): AddContactResult = js.native
  /**
    * Adds a Contact .
    * @param id The ID for the contact.
    * @param contact An object that contains the contact's information.
    * @return An AddContactResult -typed value that indicates whether the contact was added successfully.
    */
  def addContact(id: String, contact: Contact): AddContactResult = js.native
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contactremoved(`type`: contactremoved, listener: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]): Unit = js.native
  
  /**
    * Checks to see whether the contact was already selected by the user.
    * @param id The ID of the contact.
    * @return True if the contact has already been selected; otherwise, false.
    */
  def containsContact(id: String): Boolean = js.native
  
  /** Specifies the fields that you want returned after the user selects one or more contacts. */
  var desiredFields: IVectorView[String] = js.native
  
  /** Gets the fields with contact field type that you want returned after the user selects one or more contacts. */
  var desiredFieldsWithContactFieldType: IVector[ContactFieldType] = js.native
  
  /** Occurs when the user deselects or removes the contact. */
  def oncontactremoved(ev: ContactRemovedEventArgs with WinRTEvent[ContactPickerUI]): Unit = js.native
  /** Occurs when the user deselects or removes the contact. */
  @JSName("oncontactremoved")
  var oncontactremoved_Original: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs] = js.native
  
  /**
    * Removes a contact.
    * @param id The ID of the contact to remove.
    */
  def removeContact(id: String): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contactremoved(`type`: contactremoved, listener: TypedEventHandler[ContactPickerUI, ContactRemovedEventArgs]): Unit = js.native
  
  /** Determines the selection mode for the contact picker. The most common options are PickSingleContactAsync or PickMultipleContactsAsync . */
  var selectionMode: ContactSelectionMode = js.native
}
