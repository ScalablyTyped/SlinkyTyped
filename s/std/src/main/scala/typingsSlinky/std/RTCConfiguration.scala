package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCConfiguration extends js.Object {
  var bundlePolicy: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCBundlePolicy] = js.native
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.native
  var iceCandidatePoolSize: js.UndefOr[Double] = js.native
  var iceServers: js.UndefOr[js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]] = js.native
  var iceTransportPolicy: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy] = js.native
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.native
}

object RTCConfiguration {
  @scala.inline
  def apply(): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCConfiguration]
  }
  @scala.inline
  implicit class RTCConfigurationOps[Self <: org.scalajs.dom.experimental.webrtc.RTCConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundlePolicy(value: org.scalajs.dom.experimental.webrtc.RTCBundlePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundlePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundlePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundlePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificates(value: js.Array[RTCCertificate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(js.undefined)
        ret
    }
    @scala.inline
    def withIceCandidatePoolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceCandidatePoolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceCandidatePoolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceCandidatePoolSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIceServers(value: js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceServers")(js.undefined)
        ret
    }
    @scala.inline
    def withIceTransportPolicy(value: org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceTransportPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceTransportPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceTransportPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerIdentity(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpMuxPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcpMuxPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcpMuxPolicy")(js.undefined)
        ret
    }
  }
  
}

