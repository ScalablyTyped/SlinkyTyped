package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit
import typingsSlinky.std.RTCIceCandidateType
import typingsSlinky.std.RTCIceComponent
import typingsSlinky.std.RTCIceProtocol
import typingsSlinky.std.RTCIceTcpCandidateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCIceCandidate")
@js.native
class RTCIceCandidate ()
  extends typingsSlinky.std.RTCIceCandidate {
  def this(candidateInitDict: RTCIceCandidateInit) = this()
  /* CompleteClass */
  override val candidate: java.lang.String = js.native
  /* CompleteClass */
  override val component: RTCIceComponent | Null = js.native
  /* CompleteClass */
  override val foundation: java.lang.String | Null = js.native
  /* CompleteClass */
  override val port: Double | Null = js.native
  /* CompleteClass */
  override val priority: Double | Null = js.native
  /* CompleteClass */
  override val protocol: RTCIceProtocol | Null = js.native
  /* CompleteClass */
  override val relatedAddress: java.lang.String | Null = js.native
  /* CompleteClass */
  override val relatedPort: Double | Null = js.native
  /* CompleteClass */
  override val sdpMLineIndex: Double | Null = js.native
  /* CompleteClass */
  override val sdpMid: java.lang.String | Null = js.native
  /* CompleteClass */
  override val tcpType: RTCIceTcpCandidateType | Null = js.native
  /* CompleteClass */
  override val `type`: RTCIceCandidateType | Null = js.native
  /* CompleteClass */
  override val usernameFragment: java.lang.String | Null = js.native
  /* CompleteClass */
  override def toJSON(): RTCIceCandidateInit = js.native
}

@JSGlobal("RTCIceCandidate")
@js.native
object RTCIceCandidate
  extends Instantiable0[org.scalajs.dom.experimental.webrtc.RTCIceCandidate]
     with Instantiable1[
      /* candidateInitDict */ RTCIceCandidateInit, 
      org.scalajs.dom.experimental.webrtc.RTCIceCandidate
    ]

