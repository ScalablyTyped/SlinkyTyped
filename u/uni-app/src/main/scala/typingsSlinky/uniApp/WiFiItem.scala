package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiFiItem extends js.Object {
  /**
    * Wi-Fi 的BSSID
    */
  var BSSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 的SSID
    */
  var SSID: js.UndefOr[String] = js.native
  /**
    * Wi-Fi 设备密码
    */
  var password: js.UndefOr[String] = js.native
}

object WiFiItem {
  @scala.inline
  def apply(): WiFiItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiFiItem]
  }
  @scala.inline
  implicit class WiFiItemOps[Self <: WiFiItem] (val x: Self) extends AnyVal {
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
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
  }
  
}

