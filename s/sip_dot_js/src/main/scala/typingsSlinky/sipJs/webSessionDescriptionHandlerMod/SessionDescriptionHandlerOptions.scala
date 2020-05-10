package typingsSlinky.sipJs.webSessionDescriptionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandlerOptions
  extends typingsSlinky.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions {
  var RTCOfferOptions: js.UndefOr[js.Any] = js.native
  var alwaysAcquireMediaFirst: js.UndefOr[Boolean] = js.native
  var disableAudioFallback: js.UndefOr[Boolean] = js.native
  var peerConnectionOptions: js.UndefOr[PeerConnectionOptions] = js.native
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
  @scala.inline
  implicit class SessionDescriptionHandlerOptionsOps[Self <: SessionDescriptionHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRTCOfferOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTCOfferOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRTCOfferOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTCOfferOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysAcquireMediaFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAcquireMediaFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysAcquireMediaFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysAcquireMediaFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAudioFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAudioFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAudioFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAudioFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerConnectionOptions(value: PeerConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerConnectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerConnectionOptions")(js.undefined)
        ret
    }
  }
  
}

