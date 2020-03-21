package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.host
  - typingsSlinky.std.stdStrings.prflx
  - typingsSlinky.std.stdStrings.relay
  - typingsSlinky.std.stdStrings.srflx
*/
trait RTCIceCandidateType extends js.Object

object RTCIceCandidateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def host: typingsSlinky.std.stdStrings.host = this.cast("host")
  @scala.inline
  def prflx: typingsSlinky.std.stdStrings.prflx = this.cast("prflx")
  @scala.inline
  def relay: typingsSlinky.std.stdStrings.relay = this.cast("relay")
  @scala.inline
  def srflx: typingsSlinky.std.stdStrings.srflx = this.cast("srflx")
}

