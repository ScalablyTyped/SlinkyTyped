package typingsSlinky.server.typingsCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.server.serverStrings.emergency
  - typings.server.serverStrings.alert
  - typings.server.serverStrings.critical
  - typings.server.serverStrings.error
  - typings.server.serverStrings.warning
  - typings.server.serverStrings.notice
  - typings.server.serverStrings.info
  - typings.server.serverStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def alert: typingsSlinky.server.serverStrings.alert = this.cast("alert")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsSlinky.server.serverStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typingsSlinky.server.serverStrings.debug = this.cast("debug")
  @scala.inline
  def emergency: typingsSlinky.server.serverStrings.emergency = this.cast("emergency")
  @scala.inline
  def error: typingsSlinky.server.serverStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.server.serverStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsSlinky.server.serverStrings.notice = this.cast("notice")
  @scala.inline
  def warning: typingsSlinky.server.serverStrings.warning = this.cast("warning")
}

