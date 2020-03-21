package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.alternate
  - typingsSlinky.std.stdStrings.`alternate-reverse`
  - typingsSlinky.std.stdStrings.normal
  - typingsSlinky.std.stdStrings.reverse
*/
trait PlaybackDirection extends js.Object

object PlaybackDirection {
  @scala.inline
  def alternate: typingsSlinky.std.stdStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typingsSlinky.std.stdStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsSlinky.std.stdStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typingsSlinky.std.stdStrings.reverse = this.cast("reverse")
}

