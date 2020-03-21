package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureKeyVaultVariableValue extends VariableValue {
  var contentType: String
  var enabled: Boolean
  var expires: js.Date
}

object AzureKeyVaultVariableValue {
  @scala.inline
  def apply(contentType: String, enabled: Boolean, expires: js.Date, isSecret: Boolean, value: String): AzureKeyVaultVariableValue = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
}

