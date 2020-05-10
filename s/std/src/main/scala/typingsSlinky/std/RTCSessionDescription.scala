package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
@js.native
trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String = js.native
  val `type`: org.scalajs.dom.experimental.webrtc.RTCSdpType = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("RTCSessionDescription")
@js.native
object RTCSessionDescription
  extends Instantiable0[org.scalajs.dom.experimental.webrtc.RTCSessionDescription]
     with Instantiable1[
      /* descriptionInitDict */ org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit, 
      org.scalajs.dom.experimental.webrtc.RTCSessionDescription
    ]

