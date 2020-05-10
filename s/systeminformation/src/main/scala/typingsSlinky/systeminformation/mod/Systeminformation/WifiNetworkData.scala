package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WifiNetworkData extends js.Object {
  var bssid: String = js.native
  var channel: Double = js.native
  var frequency: Double = js.native
  var mode: String = js.native
  var quality: Double = js.native
  var rsnFlags: js.Array[String] = js.native
  var security: js.Array[String] = js.native
  var signalLevel: Double = js.native
  var ssid: String = js.native
  var wpaFlags: js.Array[String] = js.native
}

object WifiNetworkData {
  @scala.inline
  def apply(
    bssid: String,
    channel: Double,
    frequency: Double,
    mode: String,
    quality: Double,
    rsnFlags: js.Array[String],
    security: js.Array[String],
    signalLevel: Double,
    ssid: String,
    wpaFlags: js.Array[String]
  ): WifiNetworkData = {
    val __obj = js.Dynamic.literal(bssid = bssid.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rsnFlags = rsnFlags.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], signalLevel = signalLevel.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any], wpaFlags = wpaFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WifiNetworkData]
  }
  @scala.inline
  implicit class WifiNetworkDataOps[Self <: WifiNetworkData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBssid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bssid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRsnFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsnFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWpaFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wpaFlags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

