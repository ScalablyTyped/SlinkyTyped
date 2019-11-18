package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.all
  - typings.std.stdStrings.nohost
  - typings.std.stdStrings.relay
*/
trait RTCIceGatherPolicy extends js.Object

object RTCIceGatherPolicy {
  @scala.inline
  def all: typingsSlinky.std.stdStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nohost: typingsSlinky.std.stdStrings.nohost = this.cast("nohost")
  @scala.inline
  def relay: typingsSlinky.std.stdStrings.relay = this.cast("relay")
}

