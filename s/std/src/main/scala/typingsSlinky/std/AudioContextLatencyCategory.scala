package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.balanced
  - typings.std.stdStrings.interactive
  - typings.std.stdStrings.playback
*/
trait AudioContextLatencyCategory extends js.Object

object AudioContextLatencyCategory {
  @scala.inline
  def balanced: typingsSlinky.std.stdStrings.balanced = this.cast("balanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interactive: typingsSlinky.std.stdStrings.interactive = this.cast("interactive")
  @scala.inline
  def playback: typingsSlinky.std.stdStrings.playback = this.cast("playback")
}

