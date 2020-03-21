package typingsSlinky.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilsock.twilsockStrings.notification
  - typingsSlinky.twilsock.twilsockStrings.message
  - typingsSlinky.twilsock.twilsockStrings.reply
  - typingsSlinky.twilsock.twilsockStrings.ping
  - typingsSlinky.twilsock.twilsockStrings.close
  - typingsSlinky.twilsock.twilsockStrings.init
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

