package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.negotiate
  - typingsSlinky.std.stdStrings.require
*/
trait RTCRtcpMuxPolicy extends js.Object

object RTCRtcpMuxPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def negotiate: typingsSlinky.std.stdStrings.negotiate = this.cast("negotiate")
  @scala.inline
  def require: typingsSlinky.std.stdStrings.require = this.cast("require")
}

