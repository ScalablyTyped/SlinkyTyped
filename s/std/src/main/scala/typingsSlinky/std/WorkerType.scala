package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.classic
  - typings.std.stdStrings.module
*/
trait WorkerType extends js.Object

object WorkerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def classic: typingsSlinky.std.stdStrings.classic = this.cast("classic")
  @scala.inline
  def module: typingsSlinky.std.stdStrings.module = this.cast("module")
}

