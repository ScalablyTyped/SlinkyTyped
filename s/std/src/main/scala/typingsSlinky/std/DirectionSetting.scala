package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Empty
  - typings.std.stdStrings.rl
  - typings.std.stdStrings.lr
*/
trait DirectionSetting extends js.Object

object DirectionSetting {
  @scala.inline
  def Empty: typingsSlinky.std.stdStrings.Empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lr: typingsSlinky.std.stdStrings.lr = this.cast("lr")
  @scala.inline
  def rl: typingsSlinky.std.stdStrings.rl = this.cast("rl")
}

