package typingsSlinky.twilioDashChat.libUserMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilioDashChat.twilioDashChatStrings.initializing
  - typings.twilioDashChat.twilioDashChatStrings.subscribed
  - typings.twilioDashChat.twilioDashChatStrings.unsubscribed
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initializing: typingsSlinky.twilioDashChat.twilioDashChatStrings.initializing = this.cast("initializing")
  @scala.inline
  def subscribed: typingsSlinky.twilioDashChat.twilioDashChatStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typingsSlinky.twilioDashChat.twilioDashChatStrings.unsubscribed = this.cast("unsubscribed")
}

