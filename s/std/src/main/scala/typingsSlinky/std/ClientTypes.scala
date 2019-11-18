package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.window
  - typings.std.stdStrings.worker
  - typings.std.stdStrings.sharedworker
  - typings.std.stdStrings.all
*/
trait ClientTypes extends js.Object

object ClientTypes {
  @scala.inline
  def all: typingsSlinky.std.stdStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sharedworker: typingsSlinky.std.stdStrings.sharedworker = this.cast("sharedworker")
  @scala.inline
  def window: typingsSlinky.std.stdStrings.window = this.cast("window")
  @scala.inline
  def worker: typingsSlinky.std.stdStrings.worker = this.cast("worker")
}

