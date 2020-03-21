package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.activated
  - typingsSlinky.std.stdStrings.activating
  - typingsSlinky.std.stdStrings.installed
  - typingsSlinky.std.stdStrings.installing
  - typingsSlinky.std.stdStrings.parsed
  - typingsSlinky.std.stdStrings.redundant
*/
trait ServiceWorkerState extends js.Object

object ServiceWorkerState {
  @scala.inline
  def activated: typingsSlinky.std.stdStrings.activated = this.cast("activated")
  @scala.inline
  def activating: typingsSlinky.std.stdStrings.activating = this.cast("activating")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def installed: typingsSlinky.std.stdStrings.installed = this.cast("installed")
  @scala.inline
  def installing: typingsSlinky.std.stdStrings.installing = this.cast("installing")
  @scala.inline
  def parsed: typingsSlinky.std.stdStrings.parsed = this.cast("parsed")
  @scala.inline
  def redundant: typingsSlinky.std.stdStrings.redundant = this.cast("redundant")
}

