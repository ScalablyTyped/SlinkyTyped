package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xterm.xtermStrings.debug
  - typingsSlinky.xterm.xtermStrings.info
  - typingsSlinky.xterm.xtermStrings.warn
  - typingsSlinky.xterm.xtermStrings.error
  - typingsSlinky.xterm.xtermStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsSlinky.xterm.xtermStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsSlinky.xterm.xtermStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.xterm.xtermStrings.info = this.cast("info")
  @scala.inline
  def off: typingsSlinky.xterm.xtermStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsSlinky.xterm.xtermStrings.warn = this.cast("warn")
}

