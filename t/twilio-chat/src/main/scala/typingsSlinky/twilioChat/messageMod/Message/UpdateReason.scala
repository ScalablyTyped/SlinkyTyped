package typingsSlinky.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.body
  - typingsSlinky.twilioChat.twilioChatStrings.lastUpdatedBy
  - typingsSlinky.twilioChat.twilioChatStrings.dateUpdated
  - typingsSlinky.twilioChat.twilioChatStrings.timestamp
  - typingsSlinky.twilioChat.twilioChatStrings.attributes
  - typingsSlinky.twilioChat.twilioChatStrings.author
*/
trait UpdateReason extends js.Object

object UpdateReason {
  @scala.inline
  def attributes: typingsSlinky.twilioChat.twilioChatStrings.attributes = this.cast("attributes")
  @scala.inline
  def author: typingsSlinky.twilioChat.twilioChatStrings.author = this.cast("author")
  @scala.inline
  def body: typingsSlinky.twilioChat.twilioChatStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dateUpdated: typingsSlinky.twilioChat.twilioChatStrings.dateUpdated = this.cast("dateUpdated")
  @scala.inline
  def lastUpdatedBy: typingsSlinky.twilioChat.twilioChatStrings.lastUpdatedBy = this.cast("lastUpdatedBy")
  @scala.inline
  def timestamp: typingsSlinky.twilioChat.twilioChatStrings.timestamp = this.cast("timestamp")
}

