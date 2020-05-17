package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change to a Contact . */
@js.native
trait ContactChange extends js.Object {
  /** Gets a value that indicates the type of change that occurred. */
  var changeType: ContactChangeType = js.native
  /** Gets the Contact object that changed. */
  var contact: Contact = js.native
}

object ContactChange {
  @scala.inline
  def apply(changeType: ContactChangeType, contact: Contact): ContactChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactChange]
  }
  @scala.inline
  implicit class ContactChangeOps[Self <: ContactChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: ContactChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

