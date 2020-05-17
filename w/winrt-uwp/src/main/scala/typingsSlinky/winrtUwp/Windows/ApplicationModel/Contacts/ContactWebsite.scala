package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a Web site for a contact. */
@js.native
trait ContactWebsite extends js.Object {
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  var rawValue: js.Any = js.native
   /* unmapped type */ /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  var uri: Uri = js.native
}

object ContactWebsite {
  @scala.inline
  def apply(description: String, rawValue: js.Any, uri: Uri): ContactWebsite = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactWebsite]
  }
  @scala.inline
  implicit class ContactWebsiteOps[Self <: ContactWebsite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

