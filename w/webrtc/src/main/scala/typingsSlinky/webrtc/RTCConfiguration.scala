package typingsSlinky.webrtc

import org.scalajs.dom.experimental.webrtc.RTCBundlePolicy
import org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy
import typingsSlinky.std.RTCRtcpMuxPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcconfiguration
@js.native
trait RTCConfiguration extends js.Object {
   // default = 'all'
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.native
   // default = null
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.native
  var iceCandidatePoolSize: js.UndefOr[Double] = js.native
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.native
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.native
   // default = 'require'
  var peerIdentity: js.UndefOr[String] = js.native
   // default = 'balanced'
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.native
}

object RTCConfiguration {
  @scala.inline
  def apply(): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCConfiguration]
  }
  @scala.inline
  implicit class RTCConfigurationOps[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundlePolicy(value: RTCBundlePolicy): Self = {
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
    def withIceServers(value: js.Array[RTCIceServer]): Self = {
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
    def withIceTransportPolicy(value: RTCIceTransportPolicy): Self = {
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
    def withPeerIdentity(value: String): Self = {
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

