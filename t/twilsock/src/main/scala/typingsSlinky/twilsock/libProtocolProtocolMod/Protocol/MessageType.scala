package typingsSlinky.twilsock.libProtocolProtocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilsock.twilsockStrings.notification
  - typings.twilsock.twilsockStrings.message
  - typings.twilsock.twilsockStrings.reply
  - typings.twilsock.twilsockStrings.ping
  - typings.twilsock.twilsockStrings.close
  - typings.twilsock.twilsockStrings.init
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsSlinky.twilsock.twilsockStrings.close = this.cast("close")
  @scala.inline
  def init: typingsSlinky.twilsock.twilsockStrings.init = this.cast("init")
  @scala.inline
  def message: typingsSlinky.twilsock.twilsockStrings.message = this.cast("message")
  @scala.inline
  def notification: typingsSlinky.twilsock.twilsockStrings.notification = this.cast("notification")
  @scala.inline
  def ping: typingsSlinky.twilsock.twilsockStrings.ping = this.cast("ping")
  @scala.inline
  def reply: typingsSlinky.twilsock.twilsockStrings.reply = this.cast("reply")
}

