package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactInstantMessageField extends IContactInstantMessageField
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
}
