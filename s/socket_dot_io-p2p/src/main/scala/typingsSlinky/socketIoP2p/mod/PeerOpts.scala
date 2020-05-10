package typingsSlinky.socketIoP2p.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.webrtc.RTCIceCandidate
import org.scalajs.dom.experimental.webrtc.RTCPeerConnection
import org.scalajs.dom.experimental.webrtc.RTCSessionDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerOpts extends js.Object {
  /**
    * Custom answer constraints (used by createAnswer method)
    */
  var answerConstraints: js.UndefOr[js.Object] = js.native
  /**
    * Custom WebRTC channel configuration (used by createDataChannel)
    * @default {}
    */
  var channelConfig: js.UndefOr[js.Object] = js.native
  /**
    * Custom WebRTC data channel name
    * @default <randomString>
    */
  var channelName: js.UndefOr[String] = js.native
  /**
    * Custom WebRTC configuration (used by RTCPeerConnection constructor)
    * @default {iceServers:[{urls:'stun:stun.l.google.com:19302'},{urls:'stun:global.stun.twilio.com:3478?transport=udp'}]}
    */
  var config: js.UndefOr[js.Object] = js.native
  /**
    * Custom WebRTC video/voice constrainst (used by RTCPeerConnection constructor)
    * @default {}
    */
  var constraints: js.UndefOr[js.Object] = js.native
  /**
    * Set to true if this is the initiating peer
    * @default false
    */
  var initiator: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to create the stream in Object Mode. In this mode, incoming string data is not automatically converted to Buffer objects
    * @default false
    */
  var objectMode: js.UndefOr[Boolean] = js.native
  /**
    * Custom offer contstraints (used by createOffer methode)
    * @default {}
    */
  var offerConstraints: js.UndefOr[js.Object] = js.native
  /**
    * Function to transform generated SDP signaling data (for advanced users)
    * @default (sdp)=>sdp
    */
  var sdpTransfrom: js.UndefOr[js.Function1[/* sdp */ js.Any, _]] = js.native
  /**
    * If video/voice is desired, pass stream from getUserMedia
    * @default false
    */
  var stream: js.UndefOr[Boolean] = js.native
  /**
    * An array of MediaStreams returned from getUserMedia
    * @default []
    */
  var streams: js.UndefOr[js.Array[MediaStream]] = js.native
  /**
    * Set to false to disable trickle ICE and get single 'signal' event (slower)
    * @default true
    */
  var trickle: js.UndefOr[Boolean] = js.native
  /**
    * Custom WebRTC implementation, mainly useful in node to specify the wrtc package
    * @default {}
    */
  var wrtc: js.UndefOr[RTCPeerConnection | RTCSessionDescription | RTCIceCandidate] = js.native
}

object PeerOpts {
  @scala.inline
  def apply(): PeerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerOpts]
  }
  @scala.inline
  implicit class PeerOptsOps[Self <: PeerOpts] (val x: Self) extends AnyVal {
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
    def withSdpTransfrom(value: /* sdp */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpTransfrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSdpTransfrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpTransfrom")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Boolean): Self = {
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
    def withStreams(value: js.Array[MediaStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(js.undefined)
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
    def withWrtcRTCIceCandidate(value: RTCIceCandidate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrtcRTCPeerConnection(value: RTCPeerConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrtcRTCSessionDescription(value: RTCSessionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrtc(value: RTCPeerConnection | RTCSessionDescription | RTCIceCandidate): Self = {
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

