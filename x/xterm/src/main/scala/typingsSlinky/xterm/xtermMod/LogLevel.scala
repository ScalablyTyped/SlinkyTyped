package typingsSlinky.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xterm.xtermStrings.debug
  - typings.xterm.xtermStrings.info
  - typings.xterm.xtermStrings.warn
  - typings.xterm.xtermStrings.error
  - typings.xterm.xtermStrings.off
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

