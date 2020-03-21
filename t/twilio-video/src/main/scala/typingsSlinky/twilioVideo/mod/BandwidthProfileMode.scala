package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.twilioVideoStrings.grid
  - typingsSlinky.twilioVideo.twilioVideoStrings.collaboration
  - typingsSlinky.twilioVideo.twilioVideoStrings.presentation
*/
trait BandwidthProfileMode extends js.Object

object BandwidthProfileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collaboration: typingsSlinky.twilioVideo.twilioVideoStrings.collaboration = this.cast("collaboration")
  @scala.inline
  def grid: typingsSlinky.twilioVideo.twilioVideoStrings.grid = this.cast("grid")
  @scala.inline
  def presentation: typingsSlinky.twilioVideo.twilioVideoStrings.presentation = this.cast("presentation")
}

