package typingsSlinky.webrtc

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
/* Rewritten from type alias, can be one of: 
  - js.ThisFunction1[
/ * this * / typingsSlinky.webrtc.RTCIceTransport, 
/ * ev * / typingsSlinky.std.Event, 
js.Any]
  - scala.Null
*/
trait IceTransportEventHandler extends js.Object

object IceTransportEventHandler {
  @scala.inline
  implicit def apply(value: Null): IceTransportEventHandler = value.asInstanceOf[IceTransportEventHandler]
  @scala.inline
  implicit def apply(value: js.ThisFunction1[/* this */ RTCIceTransport, /* ev */ Event, js.Any]): IceTransportEventHandler = value.asInstanceOf[IceTransportEventHandler]
}

