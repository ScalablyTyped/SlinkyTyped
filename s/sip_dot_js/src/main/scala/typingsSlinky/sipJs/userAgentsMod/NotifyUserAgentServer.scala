package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends typingsSlinky.sipJs.notifyUserAgentServerMod.NotifyUserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message - Incoming NOTIFY request message.
    */
  def this(dialogOrCore: Dialog, message: IncomingRequestMessage) = this()
  def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(dialogOrCore: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

