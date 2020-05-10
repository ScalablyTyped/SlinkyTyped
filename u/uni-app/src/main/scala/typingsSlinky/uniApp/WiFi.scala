package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiFi extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 是否安全
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Wi-Fi 信号强度
    */
  var signalStrength: js.UndefOr[Double] = js.native
}

object WiFi {
  @scala.inline
  def apply(): WiFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFi]
  }
  @scala.inline
  implicit class WiFiOps[Self <: WiFi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBSSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBSSID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BSSID")(js.undefined)
        ret
    }
    @scala.inline
    def withSSID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSID")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStrength")(js.undefined)
        ret
    }
  }
  
}

