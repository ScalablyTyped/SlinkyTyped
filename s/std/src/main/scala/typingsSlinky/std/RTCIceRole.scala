package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.controlled
  - typingsSlinky.std.stdStrings.controlling
  - typingsSlinky.std.stdStrings.unknown
*/
trait RTCIceRole extends js.Object

object RTCIceRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controlled: typingsSlinky.std.stdStrings.controlled = this.cast("controlled")
  @scala.inline
  def controlling: typingsSlinky.std.stdStrings.controlling = this.cast("controlling")
  @scala.inline
  def unknown: typingsSlinky.std.stdStrings.unknown = this.cast("unknown")
}

