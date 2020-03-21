package typingsSlinky.std

import typingsSlinky.std.stdStrings.required_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.optional
  - typingsSlinky.std.stdStrings.required_
  - typingsSlinky.std.stdStrings.silent
*/
trait CredentialMediationRequirement extends js.Object

object CredentialMediationRequirement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typingsSlinky.std.stdStrings.optional = this.cast("optional")
  @scala.inline
  def required: required_ = this.cast("required")
  @scala.inline
  def silent: typingsSlinky.std.stdStrings.silent = this.cast("silent")
}

