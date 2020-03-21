package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.native
  - typingsSlinky.std.stdStrings.transparent
*/
trait EndingType extends js.Object

object EndingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def native: typingsSlinky.std.stdStrings.native = this.cast("native")
  @scala.inline
  def transparent: typingsSlinky.std.stdStrings.transparent = this.cast("transparent")
}

