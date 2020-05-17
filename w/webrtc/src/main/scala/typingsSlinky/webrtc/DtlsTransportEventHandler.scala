package typingsSlinky.webrtc

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
/* Rewritten from type alias, can be one of: 
  - js.ThisFunction1[
/ * this * / typingsSlinky.webrtc.RTCDtlsTransport, 
/ * ev * / typingsSlinky.std.Event, 
js.Any]
  - scala.Null
*/
trait DtlsTransportEventHandler extends js.Object

object DtlsTransportEventHandler {
  @scala.inline
  implicit def apply(value: Null): DtlsTransportEventHandler = value.asInstanceOf[DtlsTransportEventHandler]
  @scala.inline
  implicit def apply(value: js.ThisFunction1[/* this */ RTCDtlsTransport, /* ev */ Event, js.Any]): DtlsTransportEventHandler = value.asInstanceOf[DtlsTransportEventHandler]
}

