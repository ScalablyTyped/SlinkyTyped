package typingsSlinky.webrtc

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
/* Rewritten from type alias, can be one of: 
  - js.ThisFunction1[/ * this * / typingsSlinky.webrtc.RTCPeerConnection, / * ev * / E, js.Any]
  - scala.Null
*/
trait PeerConnectionEventHandler[E /* <: Event */] extends js.Object

object PeerConnectionEventHandler {
  @scala.inline
  implicit def apply[E](value: Null): PeerConnectionEventHandler[E] = value.asInstanceOf[PeerConnectionEventHandler[E]]
  @scala.inline
  implicit def apply[E](value: js.ThisFunction1[/* this */ RTCPeerConnection, /* ev */ E, js.Any]): PeerConnectionEventHandler[E] = value.asInstanceOf[PeerConnectionEventHandler[E]]
}

