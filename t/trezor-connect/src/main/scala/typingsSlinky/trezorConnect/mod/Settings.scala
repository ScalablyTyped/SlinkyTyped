package typingsSlinky.trezorConnect.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var configSrc: js.UndefOr[String] = js.native
  var connectSrc: js.UndefOr[String] = js.native
  var debug: Boolean | StringDictionary[Boolean] = js.native
  var extension: js.UndefOr[String] = js.native
  var hostIcon: js.UndefOr[String] = js.native
  var hostLabel: js.UndefOr[String] = js.native
  var iframeSrc: js.UndefOr[String] = js.native
  var lazyLoad: js.UndefOr[String] = js.native
  var manifest: js.UndefOr[ManifestParams] = js.native
   // constant
  var origin: js.UndefOr[String] = js.native
  var pendingTransportEvent: js.UndefOr[Boolean] = js.native
  var popup: js.UndefOr[Boolean] = js.native
  var popupSrc: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var supportedBrowser: js.UndefOr[Boolean] = js.native
  var transportReconnect: js.UndefOr[Boolean] = js.native
  var trustedHost: js.UndefOr[Boolean] = js.native
  var webusb: js.UndefOr[Boolean] = js.native
  var webusbSrc: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(debug: Boolean | StringDictionary[Boolean]): Settings = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean | StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withHostIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHostLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: ManifestParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingTransportEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTransportEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingTransportEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTransportEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustedHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedHost")(js.undefined)
        ret
    }
    @scala.inline
    def withWebusb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webusb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebusb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webusb")(js.undefined)
        ret
    }
    @scala.inline
    def withWebusbSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webusbSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebusbSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webusbSrc")(js.undefined)
        ret
    }
  }
  
}

