package typingsSlinky.twilioChat.messageMod.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.text
  - typingsSlinky.twilioChat.twilioChatStrings.media
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def media: typingsSlinky.twilioChat.twilioChatStrings.media = this.cast("media")
  @scala.inline
  def text: typingsSlinky.twilioChat.twilioChatStrings.text = this.cast("text")
}

