package typingsSlinky.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.default
  - typingsSlinky.twilioChat.twilioChatStrings.muted
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.twilioChat.twilioChatStrings.default = this.cast("default")
  @scala.inline
  def muted: typingsSlinky.twilioChat.twilioChatStrings.muted = this.cast("muted")
}

