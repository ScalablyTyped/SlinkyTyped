package typingsSlinky.twilioChat.pushnotificationMod.PushNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotnew_message
  - typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotadded_to_channel
  - typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotinvited_to_channel
  - typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotremoved_from_channel
*/
trait Type extends js.Object

object Type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def twilioDotchannelDotadded_to_channel: typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotadded_to_channel = this.cast("twilio.channel.added_to_channel")
  @scala.inline
  def twilioDotchannelDotinvited_to_channel: typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotinvited_to_channel = this.cast("twilio.channel.invited_to_channel")
  @scala.inline
  def twilioDotchannelDotnew_message: typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotnew_message = this.cast("twilio.channel.new_message")
  @scala.inline
  def twilioDotchannelDotremoved_from_channel: typingsSlinky.twilioChat.twilioChatStrings.twilioDotchannelDotremoved_from_channel = this.cast("twilio.channel.removed_from_channel")
}

