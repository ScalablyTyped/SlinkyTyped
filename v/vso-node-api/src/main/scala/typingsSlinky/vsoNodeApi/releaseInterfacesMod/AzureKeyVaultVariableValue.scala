package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureKeyVaultVariableValue extends VariableValue {
  var contentType: String = js.native
  var enabled: Boolean = js.native
  var expires: js.Date = js.native
}

object AzureKeyVaultVariableValue {
  @scala.inline
  def apply(contentType: String, enabled: Boolean, expires: js.Date, isSecret: Boolean, value: String): AzureKeyVaultVariableValue = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableValue]
  }
  @scala.inline
  implicit class AzureKeyVaultVariableValueOps[Self <: AzureKeyVaultVariableValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

