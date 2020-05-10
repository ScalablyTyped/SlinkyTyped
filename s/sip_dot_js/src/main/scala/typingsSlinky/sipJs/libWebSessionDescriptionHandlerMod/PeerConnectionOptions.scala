package typingsSlinky.sipJs.libWebSessionDescriptionHandlerMod

import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerConnectionOptions extends js.Object {
  var iceCheckingTimeout: js.UndefOr[Double] = js.native
  var rtcConfiguration: js.UndefOr[RTCConfiguration] = js.native
}

object PeerConnectionOptions {
  @scala.inline
  def apply(): PeerConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerConnectionOptions]
  }
  @scala.inline
  implicit class PeerConnectionOptionsOps[Self <: PeerConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIceCheckingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceCheckingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceCheckingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceCheckingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcConfiguration(value: RTCConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcConfiguration")(js.undefined)
        ret
    }
  }
  
}

