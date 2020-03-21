package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.rtcp
  - typingsSlinky.std.stdStrings.rtp
*/
trait RTCIceComponent extends js.Object

object RTCIceComponent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rtcp: typingsSlinky.std.stdStrings.rtcp = this.cast("rtcp")
  @scala.inline
  def rtp: typingsSlinky.std.stdStrings.rtp = this.cast("rtp")
}

