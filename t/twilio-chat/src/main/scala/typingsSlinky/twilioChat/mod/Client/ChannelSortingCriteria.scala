package typingsSlinky.twilioChat.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.lastMessage
  - typingsSlinky.twilioChat.twilioChatStrings.friendlyName
  - typingsSlinky.twilioChat.twilioChatStrings.uniqueName
*/
trait ChannelSortingCriteria extends js.Object

object ChannelSortingCriteria {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typingsSlinky.twilioChat.twilioChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def lastMessage: typingsSlinky.twilioChat.twilioChatStrings.lastMessage = this.cast("lastMessage")
  @scala.inline
  def uniqueName: typingsSlinky.twilioChat.twilioChatStrings.uniqueName = this.cast("uniqueName")
}

