package typingsSlinky.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function0[scala.Boolean]
  - js.UndefOr[scala.Nothing]
*/
trait SessionAcceptReject extends js.Object

object SessionAcceptReject {
  @scala.inline
  implicit def apply(value: js.Function0[Boolean]): SessionAcceptReject = value.asInstanceOf[SessionAcceptReject]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => SessionAcceptReject): SessionAcceptReject = value.asInstanceOf[SessionAcceptReject]
}

