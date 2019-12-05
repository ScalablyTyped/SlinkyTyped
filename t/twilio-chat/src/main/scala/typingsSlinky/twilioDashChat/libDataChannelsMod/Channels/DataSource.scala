package typingsSlinky.twilioDashChat.libDataChannelsMod.Channels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.sync
  - typings.twilioDashChat.twilioDashChatStrings.chat
  - typings.twilioDashChat.twilioDashChatStrings.synclist
*/
trait DataSource extends js.Object

object DataSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typingsSlinky.twilioDashChat.twilioDashChatStrings.chat = this.cast("chat")
  @scala.inline
  def sync: typingsSlinky.twilioDashChat.twilioDashChatStrings.sync = this.cast("sync")
  @scala.inline
  def synclist: typingsSlinky.twilioDashChat.twilioDashChatStrings.synclist = this.cast("synclist")
}

