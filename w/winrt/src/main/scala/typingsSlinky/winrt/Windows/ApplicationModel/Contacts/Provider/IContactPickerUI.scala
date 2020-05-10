package typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider

import typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Contact
import typingsSlinky.winrt.Windows.ApplicationModel.Contacts.ContactSelectionMode
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactPickerUI extends js.Object {
  var desiredFields: IVectorView[String] = js.native
  var oncontactremoved: js.Any = js.native
  var selectionMode: ContactSelectionMode = js.native
  def addContact(id: String, contact: Contact): AddContactResult = js.native
  def containsContact(id: String): Boolean = js.native
  def removeContact(id: String): Unit = js.native
}

object IContactPickerUI {
  @scala.inline
  def apply(
    addContact: (String, Contact) => AddContactResult,
    containsContact: String => Boolean,
    desiredFields: IVectorView[String],
    oncontactremoved: js.Any,
    removeContact: String => Unit,
    selectionMode: ContactSelectionMode
  ): IContactPickerUI = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction2(addContact), containsContact = js.Any.fromFunction1(containsContact), desiredFields = desiredFields.asInstanceOf[js.Any], oncontactremoved = oncontactremoved.asInstanceOf[js.Any], removeContact = js.Any.fromFunction1(removeContact), selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPickerUI]
  }
  @scala.inline
  implicit class IContactPickerUIOps[Self <: IContactPickerUI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddContact(value: (String, Contact) => AddContactResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContact")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContainsContact(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsContact")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDesiredFields(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncontactremoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontactremoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveContact(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContact")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectionMode(value: ContactSelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

