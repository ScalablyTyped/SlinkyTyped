package typingsSlinky.storybookComponents.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookComponents.storybookComponentsStrings.valid
  - typingsSlinky.storybookComponents.storybookComponentsStrings.error
  - typingsSlinky.storybookComponents.storybookComponentsStrings.warn
*/
trait ValidationStates extends js.Object

object ValidationStates {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.storybookComponents.storybookComponentsStrings.error = this.cast("error")
  @scala.inline
  def valid: typingsSlinky.storybookComponents.storybookComponentsStrings.valid = this.cast("valid")
  @scala.inline
  def warn: typingsSlinky.storybookComponents.storybookComponentsStrings.warn = this.cast("warn")
}

