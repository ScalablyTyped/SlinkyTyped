package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkSecuritySettings extends js.Object {
  var networkAuthenticationType: NetworkAuthenticationType = js.native
  var networkEncryptionType: NetworkEncryptionType = js.native
}

object INetworkSecuritySettings {
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): INetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkSecuritySettings]
  }
  @scala.inline
  implicit class INetworkSecuritySettingsOps[Self <: INetworkSecuritySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkAuthenticationType(value: NetworkAuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkEncryptionType(value: NetworkEncryptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEncryptionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

