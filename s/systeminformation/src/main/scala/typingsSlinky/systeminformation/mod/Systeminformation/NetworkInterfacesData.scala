package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 6. Network related functions
@js.native
trait NetworkInterfacesData extends js.Object {
  var carrier_changes: Double = js.native
  var dhcp: Boolean = js.native
  var dnsSuffix: String = js.native
  var duplex: String = js.native
  var ieee8021xAuth: String = js.native
  var ieee8021xState: String = js.native
  var iface: String = js.native
  var ifaceName: String = js.native
  var internal: Boolean = js.native
  var ip4: String = js.native
  var ip6: String = js.native
  var mac: String = js.native
  var mtu: Double = js.native
  var operstate: String = js.native
  var speed: Double = js.native
  var `type`: String = js.native
  var virtual: Boolean = js.native
}

object NetworkInterfacesData {
  @scala.inline
  def apply(
    carrier_changes: Double,
    dhcp: Boolean,
    dnsSuffix: String,
    duplex: String,
    ieee8021xAuth: String,
    ieee8021xState: String,
    iface: String,
    ifaceName: String,
    internal: Boolean,
    ip4: String,
    ip6: String,
    mac: String,
    mtu: Double,
    operstate: String,
    speed: Double,
    `type`: String,
    virtual: Boolean
  ): NetworkInterfacesData = {
    val __obj = js.Dynamic.literal(carrier_changes = carrier_changes.asInstanceOf[js.Any], dhcp = dhcp.asInstanceOf[js.Any], dnsSuffix = dnsSuffix.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], ieee8021xAuth = ieee8021xAuth.asInstanceOf[js.Any], ieee8021xState = ieee8021xState.asInstanceOf[js.Any], iface = iface.asInstanceOf[js.Any], ifaceName = ifaceName.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], ip4 = ip4.asInstanceOf[js.Any], ip6 = ip6.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], mtu = mtu.asInstanceOf[js.Any], operstate = operstate.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], virtual = virtual.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfacesData]
  }
  @scala.inline
  implicit class NetworkInterfacesDataOps[Self <: NetworkInterfacesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarrier_changes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier_changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDhcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIeee8021xAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieee8021xAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIeee8021xState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ieee8021xState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifaceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp6(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperstate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operstate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

