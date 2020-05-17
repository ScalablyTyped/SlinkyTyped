package typingsSlinky.winrtUwp.Windows.Devices.WiFi

import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes an available Wi-Fi network. */
@js.native
trait WiFiAvailableNetwork extends js.Object {
  /** Gets the interval between 802.11 Beacon frames used by this network. */
  var beaconInterval: Double = js.native
  /** Gets the MAC address of the access point. */
  var bssid: String = js.native
  /** Gets the channel center frequency of the band on which the 802.11 Beacon or Probe Response was received. */
  var channelCenterFrequencyInKilohertz: Double = js.native
  /** Gets a value indicating whether this network originates from a Wi-Fi Direct access point. */
  var isWiFiDirect: Boolean = js.native
  /** Gets a value describing the kind of network being described. */
  var networkKind: WiFiNetworkKind = js.native
  /** Gets the signal strength of the network. */
  var networkRssiInDecibelMilliwatts: Double = js.native
  /** Gets a value describing the kind of PHY used by this network. */
  var phyKind: WiFiPhyKind = js.native
  /** Gets the security configuration of the network. */
  var securitySettings: NetworkSecuritySettings = js.native
  /** Gets the strength of the signal as a number of bars. */
  var signalBars: Double = js.native
  /** Gets the SSID (name) of the network. */
  var ssid: String = js.native
  /** Gets the uptime value reported by the network. */
  var uptime: Double = js.native
}

object WiFiAvailableNetwork {
  @scala.inline
  def apply(
    beaconInterval: Double,
    bssid: String,
    channelCenterFrequencyInKilohertz: Double,
    isWiFiDirect: Boolean,
    networkKind: WiFiNetworkKind,
    networkRssiInDecibelMilliwatts: Double,
    phyKind: WiFiPhyKind,
    securitySettings: NetworkSecuritySettings,
    signalBars: Double,
    ssid: String,
    uptime: Double
  ): WiFiAvailableNetwork = {
    val __obj = js.Dynamic.literal(beaconInterval = beaconInterval.asInstanceOf[js.Any], bssid = bssid.asInstanceOf[js.Any], channelCenterFrequencyInKilohertz = channelCenterFrequencyInKilohertz.asInstanceOf[js.Any], isWiFiDirect = isWiFiDirect.asInstanceOf[js.Any], networkKind = networkKind.asInstanceOf[js.Any], networkRssiInDecibelMilliwatts = networkRssiInDecibelMilliwatts.asInstanceOf[js.Any], phyKind = phyKind.asInstanceOf[js.Any], securitySettings = securitySettings.asInstanceOf[js.Any], signalBars = signalBars.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiAvailableNetwork]
  }
  @scala.inline
  implicit class WiFiAvailableNetworkOps[Self <: WiFiAvailableNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeaconInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBssid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bssid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelCenterFrequencyInKilohertz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCenterFrequencyInKilohertz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWiFiDirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWiFiDirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkKind(value: WiFiNetworkKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkRssiInDecibelMilliwatts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkRssiInDecibelMilliwatts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhyKind(value: WiFiPhyKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phyKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecuritySettings(value: NetworkSecuritySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securitySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalBars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

