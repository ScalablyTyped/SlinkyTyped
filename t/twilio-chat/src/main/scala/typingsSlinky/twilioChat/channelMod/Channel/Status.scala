package typingsSlinky.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.unknown
  - typingsSlinky.twilioChat.twilioChatStrings.known
  - typingsSlinky.twilioChat.twilioChatStrings.invited
  - typingsSlinky.twilioChat.twilioChatStrings.joined
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def invited: typingsSlinky.twilioChat.twilioChatStrings.invited = this.cast("invited")
  @scala.inline
  def joined: typingsSlinky.twilioChat.twilioChatStrings.joined = this.cast("joined")
  @scala.inline
  def known: typingsSlinky.twilioChat.twilioChatStrings.known = this.cast("known")
  @scala.inline
  def unknown: typingsSlinky.twilioChat.twilioChatStrings.unknown = this.cast("unknown")
}

