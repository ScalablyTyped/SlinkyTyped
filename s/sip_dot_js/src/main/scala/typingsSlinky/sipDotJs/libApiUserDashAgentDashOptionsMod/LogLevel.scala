package typingsSlinky.sipDotJs.libApiUserDashAgentDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sipDotJs.sipDotJsStrings.debug
  - typings.sipDotJs.sipDotJsStrings.log
  - typings.sipDotJs.sipDotJsStrings.warn
  - typings.sipDotJs.sipDotJsStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.sipDotJs.sipDotJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.sipDotJs.sipDotJsStrings.error = this.cast("error")
  @scala.inline
  def log: typingsSlinky.sipDotJs.sipDotJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typingsSlinky.sipDotJs.sipDotJsStrings.warn = this.cast("warn")
}

