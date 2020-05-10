package typingsSlinky.simplePeer.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
   // custom offer constraints (used by createOffer method)
  var answerConstraints: js.UndefOr[js.Object] = js.native
   // set to true if this is the initiating peer
  var channelConfig: js.UndefOr[js.Object] = js.native
   // custom webrtc data channel configuration (used by createDataChannel)
  var channelName: js.UndefOr[String] = js.native
   // custom webrtc data channel name
  var config: js.UndefOr[js.Object] = js.native
   // custom webrtc configuration (used by RTCPeerConnection constructor)
  var constraints: js.UndefOr[js.Object] = js.native
  var initiator: js.UndefOr[Boolean] = js.native
   // RTCPeerConnection/RTCSessionDescription/RTCIceCandidate
  var objectMode: js.UndefOr[Boolean] = js.native
   // custom webrtc video/voice constraints (used by RTCPeerConnection constructor)
  var offerConstraints: js.UndefOr[js.Object] = js.native
   // custom answer constraints (used by createAnswer method)
  var reconnectTimer: js.UndefOr[Boolean | Double] = js.native
   // wait __ milliseconds after ICE 'disconnect' for reconnect attempt before emitting 'close'
  var sdpTransform: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.native
   // function to transform the generated SDP signaling data (for advanced users)
  var stream: js.UndefOr[MediaStream] = js.native
   // if video/voice is desired, pass stream returned from getUserMedia
  var trickle: js.UndefOr[Boolean] = js.native
   // set to false to disable trickle ICE and get a single 'signal' event (slower)
  var wrtc: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswerConstraints(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelName")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiator")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferConstraints(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectTimer(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectTimer")(js.undefined)
        ret
    }
    @scala.inline
    def withSdpTransform(value: /* sdp */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSdpTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: MediaStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withTrickle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrickle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickle")(js.undefined)
        ret
    }
    @scala.inline
    def withWrtc(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrtc")(js.undefined)
        ret
    }
  }
  
}

