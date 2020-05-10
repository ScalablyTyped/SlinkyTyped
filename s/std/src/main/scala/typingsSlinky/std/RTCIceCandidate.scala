package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
@js.native
trait RTCIceCandidate extends js.Object {
  val candidate: java.lang.String = js.native
  val component: RTCIceComponent | Null = js.native
  val foundation: java.lang.String | Null = js.native
  val port: Double | Null = js.native
  val priority: Double | Null = js.native
  val protocol: RTCIceProtocol | Null = js.native
  val relatedAddress: java.lang.String | Null = js.native
  val relatedPort: Double | Null = js.native
  val sdpMLineIndex: Double | Null = js.native
  val sdpMid: java.lang.String | Null = js.native
  val tcpType: RTCIceTcpCandidateType | Null = js.native
  val `type`: RTCIceCandidateType | Null = js.native
  val usernameFragment: java.lang.String | Null = js.native
  def toJSON(): org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit = js.native
}

@JSGlobal("RTCIceCandidate")
@js.native
object RTCIceCandidate
  extends Instantiable0[org.scalajs.dom.experimental.webrtc.RTCIceCandidate]
     with Instantiable1[
      /* candidateInitDict */ org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit, 
      org.scalajs.dom.experimental.webrtc.RTCIceCandidate
    ]

