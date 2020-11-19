package typingsSlinky.webrtc

import org.scalajs.dom.experimental.webrtc.RTCBundlePolicy
import org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy
import typingsSlinky.std.RTCRtcpMuxPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBundlePolicy(value: RTCBundlePolicy): Self = this.set("bundlePolicy", value.asInstanceOf[js.Any])
    
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
    def setIceServersVarargs(value: RTCIceServer*): Self = this.set("iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceServers(value: js.Array[RTCIceServer]): Self = this.set("iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceServers: Self = this.set("iceServers", js.undefined)
    
    @scala.inline
    def setIceTransportPolicy(value: RTCIceTransportPolicy): Self = this.set("iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceTransportPolicy: Self = this.set("iceTransportPolicy", js.undefined)
    
    @scala.inline
    def setPeerIdentity(value: String): Self = this.set("peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerIdentity: Self = this.set("peerIdentity", js.undefined)
    
    @scala.inline
    def setRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = this.set("rtcpMuxPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcpMuxPolicy: Self = this.set("rtcpMuxPolicy", js.undefined)
  }
}
