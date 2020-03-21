package typingsSlinky.twilioChat.memberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.chat
  - typingsSlinky.twilioChat.twilioChatStrings.sms
  - typingsSlinky.twilioChat.twilioChatStrings.whatsapp
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chat: typingsSlinky.twilioChat.twilioChatStrings.chat = this.cast("chat")
  @scala.inline
  def sms: typingsSlinky.twilioChat.twilioChatStrings.sms = this.cast("sms")
  @scala.inline
  def whatsapp: typingsSlinky.twilioChat.twilioChatStrings.whatsapp = this.cast("whatsapp")
}

