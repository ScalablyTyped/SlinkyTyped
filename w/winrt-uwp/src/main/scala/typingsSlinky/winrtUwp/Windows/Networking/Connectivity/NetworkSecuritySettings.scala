package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current network security settings. */
@js.native
trait NetworkSecuritySettings extends js.Object {
  /** Retrieves the type of authentication used by the network. */
  var networkAuthenticationType: NetworkAuthenticationType = js.native
  /** Retrieves the type of encryption used by the network. */
  var networkEncryptionType: NetworkEncryptionType = js.native
}

object NetworkSecuritySettings {
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): NetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSecuritySettings]
  }
  @scala.inline
  implicit class NetworkSecuritySettingsOps[Self <: NetworkSecuritySettings] (val x: Self) extends AnyVal {
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

