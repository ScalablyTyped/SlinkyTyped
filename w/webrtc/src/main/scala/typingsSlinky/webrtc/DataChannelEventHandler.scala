package typingsSlinky.webrtc

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
/* Rewritten from type alias, can be one of: 
  - js.ThisFunction1[/ * this * / typingsSlinky.webrtc.RTCDataChannel, / * ev * / E, js.Any]
  - scala.Null
*/
trait DataChannelEventHandler[E /* <: Event */] extends js.Object

object DataChannelEventHandler {
  @scala.inline
  implicit def apply[E](value: Null): DataChannelEventHandler[E] = value.asInstanceOf[DataChannelEventHandler[E]]
  @scala.inline
  implicit def apply[E](value: js.ThisFunction1[/* this */ RTCDataChannel, /* ev */ E, js.Any]): DataChannelEventHandler[E] = value.asInstanceOf[DataChannelEventHandler[E]]
}

