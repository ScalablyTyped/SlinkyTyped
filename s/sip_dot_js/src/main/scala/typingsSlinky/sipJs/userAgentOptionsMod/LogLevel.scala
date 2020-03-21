package typingsSlinky.sipJs.userAgentOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sipJs.sipJsStrings.debug
  - typingsSlinky.sipJs.sipJsStrings.log
  - typingsSlinky.sipJs.sipJsStrings.warn
  - typingsSlinky.sipJs.sipJsStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.sipJs.sipJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.sipJs.sipJsStrings.error = this.cast("error")
  @scala.inline
  def log: typingsSlinky.sipJs.sipJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typingsSlinky.sipJs.sipJsStrings.warn = this.cast("warn")
}

