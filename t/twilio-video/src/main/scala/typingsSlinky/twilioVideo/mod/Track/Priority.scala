package typingsSlinky.twilioVideo.mod.Track

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.twilioVideoStrings.low
  - typingsSlinky.twilioVideo.twilioVideoStrings.standard
  - typingsSlinky.twilioVideo.twilioVideoStrings.high
*/
trait Priority extends js.Object

object Priority {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.twilioVideo.twilioVideoStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.twilioVideo.twilioVideoStrings.low = this.cast("low")
  @scala.inline
  def standard: typingsSlinky.twilioVideo.twilioVideoStrings.standard = this.cast("standard")
}

