package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
@js.native
trait NetworkOperatorTetheringAccessPointConfiguration extends js.Object {
  /** Gets or sets the passphrase used to authenticate the connection. */
  var passphrase: String = js.native
  /** Gets or sets the network account ID. */
  var ssid: String = js.native
}

object NetworkOperatorTetheringAccessPointConfiguration {
  @scala.inline
  def apply(passphrase: String, ssid: String): NetworkOperatorTetheringAccessPointConfiguration = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringAccessPointConfiguration]
  }
  @scala.inline
  implicit class NetworkOperatorTetheringAccessPointConfigurationOps[Self <: NetworkOperatorTetheringAccessPointConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

