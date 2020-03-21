package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.twilioVideoStrings.isac
  - typingsSlinky.twilioVideo.twilioVideoStrings.opus
  - typingsSlinky.twilioVideo.twilioVideoStrings.PCMA
  - typingsSlinky.twilioVideo.twilioVideoStrings.PCMU
*/
trait AudioCodec extends js.Object

object AudioCodec {
  @scala.inline
  def PCMA: typingsSlinky.twilioVideo.twilioVideoStrings.PCMA = this.cast("PCMA")
  @scala.inline
  def PCMU: typingsSlinky.twilioVideo.twilioVideoStrings.PCMU = this.cast("PCMU")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def isac: typingsSlinky.twilioVideo.twilioVideoStrings.isac = this.cast("isac")
  @scala.inline
  def opus: typingsSlinky.twilioVideo.twilioVideoStrings.opus = this.cast("opus")
}

