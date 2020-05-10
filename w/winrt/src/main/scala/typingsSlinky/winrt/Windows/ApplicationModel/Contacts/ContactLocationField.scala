package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactLocationField")
@js.native
class ContactLocationField protected () extends IContactLocationField {
  def this(unstructuredAddress: String) = this()
  def this(unstructuredAddress: String, category: ContactFieldCategory) = this()
  def this(
    unstructuredAddress: String,
    category: ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ) = this()
}

