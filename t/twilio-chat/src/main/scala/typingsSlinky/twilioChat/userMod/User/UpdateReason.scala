package typingsSlinky.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.friendlyName
  - typingsSlinky.twilioChat.twilioChatStrings.attributes
  - typingsSlinky.twilioChat.twilioChatStrings.online
  - typingsSlinky.twilioChat.twilioChatStrings.notifiable
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typingsSlinky.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def friendlyName: typingsSlinky.twilioChat.twilioChatStrings.friendlyName = this.cast("friendlyName")
  @scala.inline
  def notifiable: typingsSlinky.twilioChat.twilioChatStrings.notifiable = this.cast("notifiable")
  @scala.inline
  def online: typingsSlinky.twilioChat.twilioChatStrings.online = this.cast("online")
}

