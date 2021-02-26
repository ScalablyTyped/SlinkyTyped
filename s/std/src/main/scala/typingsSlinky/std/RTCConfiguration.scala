package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCConfiguration extends StObject {
  
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
  def apply(): org.scalajs.dom.experimental.webrtc.RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.webrtc.RTCConfiguration]
  }
  
  @scala.inline
  implicit class RTCConfigurationMutableBuilder[Self <: org.scalajs.dom.experimental.webrtc.RTCConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundlePolicy(value: org.scalajs.dom.experimental.webrtc.RTCBundlePolicy): Self = StObject.set(x, "bundlePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlePolicyUndefined: Self = StObject.set(x, "bundlePolicy", js.undefined)
    
    @scala.inline
    def setCertificates(value: js.Array[RTCCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: RTCCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setIceCandidatePoolSize(value: Double): Self = StObject.set(x, "iceCandidatePoolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceCandidatePoolSizeUndefined: Self = StObject.set(x, "iceCandidatePoolSize", js.undefined)
    
    @scala.inline
    def setIceServers(value: js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersUndefined: Self = StObject.set(x, "iceServers", js.undefined)
    
    @scala.inline
    def setIceServersVarargs(value: org.scalajs.dom.experimental.webrtc.RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceTransportPolicy(value: org.scalajs.dom.experimental.webrtc.RTCIceTransportPolicy): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    @scala.inline
    def setPeerIdentity(value: java.lang.String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    
    @scala.inline
    def setRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = StObject.set(x, "rtcpMuxPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpMuxPolicyUndefined: Self = StObject.set(x, "rtcpMuxPolicy", js.undefined)
  }
}
