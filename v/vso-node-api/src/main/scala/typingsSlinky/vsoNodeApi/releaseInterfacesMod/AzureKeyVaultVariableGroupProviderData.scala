package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureKeyVaultVariableGroupProviderData extends VariableGroupProviderData {
  var lastRefreshedOn: js.Date = js.native
  var serviceEndpointId: String = js.native
  var vault: String = js.native
}

object AzureKeyVaultVariableGroupProviderData {
  @scala.inline
  def apply(lastRefreshedOn: js.Date, serviceEndpointId: String, vault: String): AzureKeyVaultVariableGroupProviderData = {
    val __obj = js.Dynamic.literal(lastRefreshedOn = lastRefreshedOn.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], vault = vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureKeyVaultVariableGroupProviderData]
  }
  @scala.inline
  implicit class AzureKeyVaultVariableGroupProviderDataOps[Self <: AzureKeyVaultVariableGroupProviderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastRefreshedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

