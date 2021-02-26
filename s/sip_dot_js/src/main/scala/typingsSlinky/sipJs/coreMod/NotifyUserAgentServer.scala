package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "NotifyUserAgentServer")
@js.native
class NotifyUserAgentServer protected ()
  extends typingsSlinky.sipJs.userAgentsMod.NotifyUserAgentServer {
  /**
    * NOTIFY UAS constructor.
    * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
    * @param message - Incoming NOTIFY request message.
    */
  def this(
    dialogOrCore: typingsSlinky.sipJs.dialogsMod.Dialog,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialogOrCore: typingsSlinky.sipJs.dialogsMod.Dialog,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
  def this(
    dialogOrCore: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
