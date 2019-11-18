package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.normal
  - typings.std.stdStrings.reverse
  - typings.std.stdStrings.alternate
  - typings.std.stdStrings.`alternate-reverse`
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

