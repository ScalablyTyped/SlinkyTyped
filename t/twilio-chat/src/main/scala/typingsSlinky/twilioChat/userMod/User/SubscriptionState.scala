package typingsSlinky.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.initializing
  - typingsSlinky.twilioChat.twilioChatStrings.subscribed
  - typingsSlinky.twilioChat.twilioChatStrings.unsubscribed
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initializing: typingsSlinky.twilioChat.twilioChatStrings.initializing = this.cast("initializing")
  @scala.inline
  def subscribed: typingsSlinky.twilioChat.twilioChatStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsSlinky.twilioChat.twilioChatStrings.unsubscribed = this.cast("unsubscribed")
}

