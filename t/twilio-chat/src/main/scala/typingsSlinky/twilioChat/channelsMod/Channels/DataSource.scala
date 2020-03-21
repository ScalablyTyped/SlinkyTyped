package typingsSlinky.twilioChat.channelsMod.Channels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.sync
  - typingsSlinky.twilioChat.twilioChatStrings.chat
  - typingsSlinky.twilioChat.twilioChatStrings.synclist
*/
trait DataSource extends js.Object

object DataSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typingsSlinky.twilioChat.twilioChatStrings.chat = this.cast("chat")
  @scala.inline
  def sync: typingsSlinky.twilioChat.twilioChatStrings.sync = this.cast("sync")
  @scala.inline
  def synclist: typingsSlinky.twilioChat.twilioChatStrings.synclist = this.cast("synclist")
}

