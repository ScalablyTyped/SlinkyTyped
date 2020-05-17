package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of Contact objects and server search status. */
@js.native
trait ContactBatch extends js.Object {
  /** Gets the list of Contact objects returned by a search operation. */
  var contacts: IVectorView[Contact] = js.native
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  var status: ContactBatchStatus = js.native
}

object ContactBatch {
  @scala.inline
  def apply(contacts: IVectorView[Contact], status: ContactBatchStatus): ContactBatch = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactBatch]
  }
  @scala.inline
  implicit class ContactBatchOps[Self <: ContactBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContacts(value: IVectorView[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ContactBatchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

