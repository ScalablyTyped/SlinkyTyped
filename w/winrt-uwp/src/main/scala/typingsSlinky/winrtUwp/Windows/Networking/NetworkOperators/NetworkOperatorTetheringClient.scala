package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about a tethering client. */
@js.native
trait NetworkOperatorTetheringClient extends js.Object {
  /** Gets a list of hostnames used by this tethering client. */
  var hostNames: IVectorView[HostName] = js.native
  /** Gets the MAC address of this tethering client. */
  var macAddress: String = js.native
}

object NetworkOperatorTetheringClient {
  @scala.inline
  def apply(hostNames: IVectorView[HostName], macAddress: String): NetworkOperatorTetheringClient = {
    val __obj = js.Dynamic.literal(hostNames = hostNames.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringClient]
  }
  @scala.inline
  implicit class NetworkOperatorTetheringClientOps[Self <: NetworkOperatorTetheringClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostNames(value: IVectorView[HostName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

