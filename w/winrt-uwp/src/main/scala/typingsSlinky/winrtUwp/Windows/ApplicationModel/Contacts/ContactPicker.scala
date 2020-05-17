package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls how the Contact Picker user interface opens and what information it shows. */
@js.native
trait ContactPicker extends js.Object {
  /** Sets the text for the confirmation button in the Contact Picker user interface. */
  var commitButtonText: String = js.native
  /** Sets the contact fields your app is interested in. */
  var desiredFields: IVector[String] = js.native
  /** Gets the ways to connect with a contact. */
  var desiredFieldsWithContactFieldType: IVector[ContactFieldType] = js.native
  /** Controls whether the Contact Picker shows contacts as a complete entity or as a collection of fields. */
  var selectionMode: ContactSelectionMode = js.native
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
  implicit class ContactPickerOps[Self <: ContactPicker] (val x: Self) extends AnyVal {
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
    def withDesiredFields(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredFieldsWithContactFieldType(value: IVector[ContactFieldType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredFieldsWithContactFieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickContactAsync(value: () => IPromiseWithIAsyncOperation[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickContactAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickContactsAsync(value: () => IPromiseWithIAsyncOperation[IVector[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickContactsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickMultipleContactsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickMultipleContactsAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPickSingleContactAsync(value: () => IPromiseWithIAsyncOperation[ContactInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickSingleContactAsync")(js.Any.fromFunction0(value))
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

