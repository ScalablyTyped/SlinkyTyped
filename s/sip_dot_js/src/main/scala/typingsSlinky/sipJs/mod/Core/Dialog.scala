package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.dialogStateMod.DialogState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.Dialog")
@js.native
class Dialog protected ()
  extends typingsSlinky.sipJs.coreMod.Dialog {
  /**
    * Dialog constructor.
    * @param core - User agent core.
    * @param dialogState - Initial dialog state.
    */
  protected def this(core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore, dialogState: DialogState) = this()
}
/* static members */
object Dialog {
  
  /**
    * When a UAC receives a response that establishes a dialog, it
    * constructs the state of the dialog.  This state MUST be maintained
    * for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.2
    * @param outgoingRequestMessage - Outgoing request message for dialog.
    * @param incomingResponseMessage - Incoming response message creating dialog.
    */
  @JSImport("sip.js", "Core.Dialog.initialDialogStateForUserAgentClient")
  @js.native
  def initialDialogStateForUserAgentClient(
    outgoingRequestMessage: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage,
    incomingResponseMessage: typingsSlinky.sipJs.messagesMod.IncomingResponseMessage
  ): DialogState = js.native
  
  /**
    * The UAS then constructs the state of the dialog.  This state MUST be
    * maintained for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.1
    * @param incomingRequestMessage - Incoming request message creating dialog.
    * @param toTag - Tag in the To field in the response to the incoming request.
    */
  @JSImport("sip.js", "Core.Dialog.initialDialogStateForUserAgentServer")
  @js.native
  def initialDialogStateForUserAgentServer(incomingRequestMessage: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage, toTag: String): DialogState = js.native
  @JSImport("sip.js", "Core.Dialog.initialDialogStateForUserAgentServer")
  @js.native
  def initialDialogStateForUserAgentServer(
    incomingRequestMessage: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    toTag: String,
    early: Boolean
  ): DialogState = js.native
}
