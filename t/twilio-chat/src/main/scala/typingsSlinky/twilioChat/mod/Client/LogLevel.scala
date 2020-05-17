package typingsSlinky.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.trace
  - typingsSlinky.twilioChat.twilioChatStrings.debug
  - typingsSlinky.twilioChat.twilioChatStrings.info
  - typingsSlinky.twilioChat.twilioChatStrings.warn
  - typingsSlinky.twilioChat.twilioChatStrings.error
  - typingsSlinky.twilioChat.twilioChatStrings.silent
  - scala.Null
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def trace: typingsSlinky.twilioChat.twilioChatStrings.trace = "trace".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.trace]
  @scala.inline
  def debug: typingsSlinky.twilioChat.twilioChatStrings.debug = "debug".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.debug]
  @scala.inline
  def info: typingsSlinky.twilioChat.twilioChatStrings.info = "info".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.info]
  @scala.inline
  def warn: typingsSlinky.twilioChat.twilioChatStrings.warn = "warn".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.warn]
  @scala.inline
  def error: typingsSlinky.twilioChat.twilioChatStrings.error = "error".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.error]
  @scala.inline
  def silent: typingsSlinky.twilioChat.twilioChatStrings.silent = "silent".asInstanceOf[typingsSlinky.twilioChat.twilioChatStrings.silent]
  @scala.inline
  implicit def apply(value: Null): LogLevel = value.asInstanceOf[LogLevel]
}

