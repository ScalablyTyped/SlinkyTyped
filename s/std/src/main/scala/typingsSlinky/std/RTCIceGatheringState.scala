package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`new`
  - typings.std.stdStrings.gathering
  - typings.std.stdStrings.complete
*/
trait RTCIceGatheringState extends js.Object

object RTCIceGatheringState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.std.stdStrings.complete = this.cast("complete")
  @scala.inline
  def gathering: typingsSlinky.std.stdStrings.gathering = this.cast("gathering")
  @scala.inline
  def `new`: typingsSlinky.std.stdStrings.`new` = this.cast("new")
}

