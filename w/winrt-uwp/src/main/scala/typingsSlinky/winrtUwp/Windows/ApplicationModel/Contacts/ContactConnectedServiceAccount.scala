package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connected service account for a contact. */
@js.native
trait ContactConnectedServiceAccount extends js.Object {
  /** Gets and sets the identifier of a connected service account for a contact. The maximum string length for the identifier is 321 characters. */
  var id: String = js.native
  /** Gets and sets the service name of a connected service account for a contact. The maximum string length for the service name is 256 characters. */
  var serviceName: String = js.native
}

object ContactConnectedServiceAccount {
  @scala.inline
  def apply(id: String, serviceName: String): ContactConnectedServiceAccount = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactConnectedServiceAccount]
  }
  @scala.inline
  implicit class ContactConnectedServiceAccountOps[Self <: ContactConnectedServiceAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

