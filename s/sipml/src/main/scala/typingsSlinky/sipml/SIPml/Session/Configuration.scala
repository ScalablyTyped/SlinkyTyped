package typingsSlinky.sipml.SIPml.Session

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sipml.anon.Audio
import typingsSlinky.sipml.anon.Events
import typingsSlinky.sipml.anon.MaxHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var audio_remote: js.UndefOr[HTMLElement] = js.native
  var bandwidth: js.UndefOr[Audio] = js.native
  var events_listener: js.UndefOr[Events] = js.native
  var expires: js.UndefOr[Double] = js.native
  var from: js.UndefOr[String] = js.native
  var sip_caps: js.UndefOr[js.Array[js.Object]] = js.native
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.native
  var video_local: js.UndefOr[HTMLElement] = js.native
  var video_remote: js.UndefOr[HTMLElement] = js.native
  var video_size: js.UndefOr[MaxHeight] = js.native
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
    def withAudio_remote(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio_remote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_remote")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidth(value: Audio): Self = {
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
    def withEvents_listener(value: Events): Self = {
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
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withSip_caps(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sip_caps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSip_caps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sip_caps")(js.undefined)
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
    def withVideo_local(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_local: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_local")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_remote(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideo_remote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video_remote")(js.undefined)
        ret
    }
    @scala.inline
    def withVideo_size(value: MaxHeight): Self = {
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
  }
  
}

