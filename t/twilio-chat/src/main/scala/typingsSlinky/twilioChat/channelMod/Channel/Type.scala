package typingsSlinky.twilioChat.channelMod.Channel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.public
  - typingsSlinky.twilioChat.twilioChatStrings.`private`
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsSlinky.twilioChat.twilioChatStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsSlinky.twilioChat.twilioChatStrings.public = this.cast("public")
}

