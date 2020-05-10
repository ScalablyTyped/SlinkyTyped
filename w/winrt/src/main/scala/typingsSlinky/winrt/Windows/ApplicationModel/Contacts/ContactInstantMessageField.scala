package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.ContactInstantMessageField")
@js.native
class ContactInstantMessageField protected () extends IContactInstantMessageField {
  def this(userName: String) = this()
  def this(userName: String, category: ContactFieldCategory) = this()
  def this(userName: String, category: ContactFieldCategory, service: String, displayText: String, verb: Uri) = this()
}

