package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a field that is an instant messaging (IM) address. */
@js.native
trait ContactInstantMessageField extends js.Object {
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory = js.native
  /** Gets the display text for the Uniform Resource Identifier (URI) that starts an instant message. */
  var displayText: String = js.native
  /** Gets the Uniform Resource Identifier (URI) that can start an instant message. */
  var launchUri: Uri = js.native
  /** Gets the name of the field. */
  var name: String = js.native
  /** Gets the name of the service used for sending instant messages. */
  var service: String = js.native
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType = js.native
  /** Gets the user's name. */
  var userName: String = js.native
  /** Gets the value of the contact data. */
  var value: String = js.native
}

object ContactInstantMessageField {
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    displayText: String,
    launchUri: Uri,
    name: String,
    service: String,
    `type`: ContactFieldType,
    userName: String,
    value: String
  ): ContactInstantMessageField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], launchUri = launchUri.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInstantMessageField]
  }
  @scala.inline
  implicit class ContactInstantMessageFieldOps[Self <: ContactInstantMessageField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: ContactFieldCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ContactFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

