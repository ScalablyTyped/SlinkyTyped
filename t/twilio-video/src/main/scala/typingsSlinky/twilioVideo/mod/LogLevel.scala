package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioVideo.twilioVideoStrings.debug
  - typingsSlinky.twilioVideo.twilioVideoStrings.info
  - typingsSlinky.twilioVideo.twilioVideoStrings.warn
  - typingsSlinky.twilioVideo.twilioVideoStrings.error
  - typingsSlinky.twilioVideo.twilioVideoStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.twilioVideo.twilioVideoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.twilioVideo.twilioVideoStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.twilioVideo.twilioVideoStrings.info = this.cast("info")
  @scala.inline
  def off: typingsSlinky.twilioVideo.twilioVideoStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsSlinky.twilioVideo.twilioVideoStrings.warn = this.cast("warn")
}

