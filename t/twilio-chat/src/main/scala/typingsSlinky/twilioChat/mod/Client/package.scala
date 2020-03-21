package typingsSlinky.twilioChat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  type ConnectionState = typingsSlinky.twilioNotifications.clientMod.ConnectionState
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioChat.twilioChatStrings.trace
    - typingsSlinky.twilioChat.twilioChatStrings.debug
    - typingsSlinky.twilioChat.twilioChatStrings.info
    - typingsSlinky.twilioChat.twilioChatStrings.warn
    - typingsSlinky.twilioChat.twilioChatStrings.error
    - typingsSlinky.twilioChat.twilioChatStrings.silent
    - scala.Null
  */
  type LogLevel = typingsSlinky.twilioChat.mod.Client._LogLevel | scala.Null
  type NotificationsChannelType = typingsSlinky.twilioNotifications.connectorMod.ChannelType
}
