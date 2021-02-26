package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogStateMod.DialogState
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.messagesMod.IncomingResponseMessage
import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.sessionSessionDelegateMod.SessionDelegate
import typingsSlinky.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import typingsSlinky.sipJs.subscriptionSubscriptionMod.SubscriptionState
import typingsSlinky.sipJs.transactionsMod.InviteClientTransaction
import typingsSlinky.sipJs.transactionsMod.InviteServerTransaction
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogsMod {
  
  @JSImport("sip.js/lib/core/dialogs", "Dialog")
  @js.native
  class Dialog protected ()
    extends typingsSlinky.sipJs.dialogMod.Dialog {
    /**
      * Dialog constructor.
      * @param core - User agent core.
      * @param dialogState - Initial dialog state.
      */
    protected def this(core: UserAgentCore, dialogState: DialogState) = this()
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
    @JSImport("sip.js/lib/core/dialogs", "Dialog.initialDialogStateForUserAgentClient")
    @js.native
    def initialDialogStateForUserAgentClient(outgoingRequestMessage: OutgoingRequestMessage, incomingResponseMessage: IncomingResponseMessage): DialogState = js.native
    
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage - Incoming request message creating dialog.
      * @param toTag - Tag in the To field in the response to the incoming request.
      */
    @JSImport("sip.js/lib/core/dialogs", "Dialog.initialDialogStateForUserAgentServer")
    @js.native
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String): DialogState = js.native
    @JSImport("sip.js/lib/core/dialogs", "Dialog.initialDialogStateForUserAgentServer")
    @js.native
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String, early: Boolean): DialogState = js.native
  }
  
  @JSImport("sip.js/lib/core/dialogs", "SessionDialog")
  @js.native
  class SessionDialog protected ()
    extends typingsSlinky.sipJs.sessionDialogMod.SessionDialog {
    def this(initialTransaction: InviteClientTransaction, core: UserAgentCore, state: DialogState) = this()
    def this(initialTransaction: InviteServerTransaction, core: UserAgentCore, state: DialogState) = this()
    def this(
      initialTransaction: InviteClientTransaction,
      core: UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
    def this(
      initialTransaction: InviteServerTransaction,
      core: UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
  }
  
  @JSImport("sip.js/lib/core/dialogs", "SubscriptionDialog")
  @js.native
  class SubscriptionDialog protected ()
    extends typingsSlinky.sipJs.subscriptionDialogMod.SubscriptionDialog {
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: typingsSlinky.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: typingsSlinky.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore,
      state: DialogState,
      delegate: SubscriptionDelegate
    ) = this()
  }
  /* static members */
  object SubscriptionDialog {
    
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    @JSImport("sip.js/lib/core/dialogs", "SubscriptionDialog.initialDialogStateForSubscription")
    @js.native
    def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: OutgoingRequestMessage,
      incomingNotifyRequestMessage: IncomingRequestMessage
    ): DialogState = js.native
  }
}
