package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RTCDtlsTransport
  - typingsSlinky.std.RTCSrtpSdesTransport
*/
trait RTCTransport extends js.Object

object RTCTransport {
  @scala.inline
  implicit def apply(value: RTCDtlsTransport): RTCTransport = value.asInstanceOf[RTCTransport]
  @scala.inline
  implicit def apply(value: RTCSrtpSdesTransport): RTCTransport = value.asInstanceOf[RTCTransport]
}

