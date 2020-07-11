package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCConfiguration extends js.Object {
  var bundlePolicy: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCBundlePolicy] = js.undefined
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.undefined
  var iceCandidatePoolSize: js.UndefOr[Double] = js.undefined
  var iceServers: js.UndefOr[js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]] = js.undefined
  var iceTransportPolicy: js.UndefOr[org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy] = js.undefined
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.undefined
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBundlePolicy(value: org.scalajs.dom.experimental.webrtc.RTCBundlePolicy): Self = this.set("bundlePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundlePolicy: Self = this.set("bundlePolicy", js.undefined)
    @scala.inline
    def setCertificatesVarargs(value: RTCCertificate*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: js.Array[RTCCertificate]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
    @scala.inline
    def setIceCandidatePoolSize(value: Double): Self = this.set("iceCandidatePoolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceCandidatePoolSize: Self = this.set("iceCandidatePoolSize", js.undefined)
    @scala.inline
    def setIceServersVarargs(value: org.scalajs.dom.experimental.webrtc.RTCIceServer*): Self = this.set("iceServers", js.Array(value :_*))
    @scala.inline
    def setIceServers(value: js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]): Self = this.set("iceServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceServers: Self = this.set("iceServers", js.undefined)
    @scala.inline
    def setIceTransportPolicy(value: org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy): Self = this.set("iceTransportPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceTransportPolicy: Self = this.set("iceTransportPolicy", js.undefined)
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = this.set("peerIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerIdentity: Self = this.set("peerIdentity", js.undefined)
    @scala.inline
    def setRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = this.set("rtcpMuxPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtcpMuxPolicy: Self = this.set("rtcpMuxPolicy", js.undefined)
  }
  
}

