package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email address of a contact. */
@js.native
trait ContactEmail extends js.Object {
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  var address: String = js.native
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of email address of a contact. */
  var kind: ContactEmailKind = js.native
}

object ContactEmail {
  @scala.inline
  def apply(address: String, description: String, kind: ContactEmailKind): ContactEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactEmail]
  }
  @scala.inline
  implicit class ContactEmailOps[Self <: ContactEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ContactEmailKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

