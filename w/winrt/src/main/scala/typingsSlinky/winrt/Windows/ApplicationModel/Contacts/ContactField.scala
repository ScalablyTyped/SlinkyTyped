package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactField")
@js.native
class ContactField protected () extends IContactField {
  def this(value: String, `type`: ContactFieldType) = this()
  def this(value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
  def this(name: String, value: String, `type`: ContactFieldType, category: ContactFieldCategory) = this()
}

