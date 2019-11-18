package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.denied
  - typings.std.stdStrings.granted
  - typings.std.stdStrings.prompt
*/
trait PushPermissionState extends js.Object

object PushPermissionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsSlinky.std.stdStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsSlinky.std.stdStrings.granted = this.cast("granted")
  @scala.inline
  def prompt: typingsSlinky.std.stdStrings.prompt = this.cast("prompt")
}

