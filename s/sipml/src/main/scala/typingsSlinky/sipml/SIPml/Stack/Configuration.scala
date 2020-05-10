package typingsSlinky.sipml.SIPml.Stack

import typingsSlinky.sipml.AnonAudio
import typingsSlinky.sipml.AnonListener
import typingsSlinky.sipml.AnonMaxHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var bandwidth: js.UndefOr[AnonAudio] = js.native
  var display_name: js.UndefOr[String] = js.native
  var enable_click2call: js.UndefOr[Boolean] = js.native
  var enable_early_ims: js.UndefOr[Boolean] = js.native
  var enable_media_stream_cache: js.UndefOr[Boolean] = js.native
  var enable_rtcweb_breaker: js.UndefOr[Boolean] = js.native
  var events_listener: js.UndefOr[AnonListener] = js.native
  var ice_servers: js.UndefOr[js.Array[js.Object]] = js.native
  var impi: js.UndefOr[String] = js.native
  var impu: js.UndefOr[String] = js.native
  var outbound_proxy_url: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var realm: js.UndefOr[String] = js.native
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.native
  var video_size: js.UndefOr[AnonMaxHeight] = js.native
  var websocket_proxy_url: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: AnonAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_click2call(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_click2call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_click2call: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_click2call")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_early_ims(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_early_ims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_early_ims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_early_ims")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_media_stream_cache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_media_stream_cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_media_stream_cache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_media_stream_cache")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_rtcweb_breaker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_rtcweb_breaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_rtcweb_breaker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_rtcweb_breaker")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents_listener(value: AnonListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events_listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents_listener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events_listener")(js.undefined)
        ret
    }
    @scala.inline
    def withIce_servers(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ice_servers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIce_servers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ice_servers")(js.undefined)
        ret
    }
    @scala.inline
    def withImpi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impi")(js.undefined)
        ret
    }
    @scala.inline
    def withImpu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impu")(js.undefined)
        ret
    }
    @scala.inline
    def withOutbound_proxy_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound_proxy_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutbound_proxy_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outbound_proxy_url")(js.undefined)
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
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(js.undefined)
        ret
    }
    @scala.inline
    def withSip_headers(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sip_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSip_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sip_headers")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_size(value: AnonMaxHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_size")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsocket_proxy_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket_proxy_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsocket_proxy_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket_proxy_url")(js.undefined)
        ret
    }
  }
  
}

