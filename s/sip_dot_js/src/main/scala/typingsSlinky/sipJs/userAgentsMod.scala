package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.Dialog
import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.dialogsMod.SubscriptionDialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typingsSlinky.sipJs.userAgentClientMod.ClientTransactionConstructor
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import typingsSlinky.sipJs.userAgentServerMod.ServerTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentsMod {
  
  @JSImport("sip.js/lib/core/user-agents", "ByeUserAgentClient")
  @js.native
  class ByeUserAgentClient protected ()
    extends typingsSlinky.sipJs.byeUserAgentClientMod.ByeUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ByeUserAgentServer")
  @js.native
  class ByeUserAgentServer protected ()
    extends typingsSlinky.sipJs.byeUserAgentServerMod.ByeUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
  @js.native
  class CancelUserAgentClient protected ()
    extends typingsSlinky.sipJs.cancelUserAgentClientMod.CancelUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InfoUserAgentClient")
  @js.native
  class InfoUserAgentClient protected ()
    extends typingsSlinky.sipJs.infoUserAgentClientMod.InfoUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InfoUserAgentServer")
  @js.native
  class InfoUserAgentServer protected ()
    extends typingsSlinky.sipJs.infoUserAgentServerMod.InfoUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InviteUserAgentClient")
  @js.native
  class InviteUserAgentClient protected ()
    extends typingsSlinky.sipJs.inviteUserAgentClientMod.InviteUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InviteUserAgentServer")
  @js.native
  class InviteUserAgentServer protected ()
    extends typingsSlinky.sipJs.inviteUserAgentServerMod.InviteUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "MessageUserAgentClient")
  @js.native
  class MessageUserAgentClient protected ()
    extends typingsSlinky.sipJs.messageUserAgentClientMod.MessageUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "MessageUserAgentServer")
  @js.native
  class MessageUserAgentServer protected ()
    extends typingsSlinky.sipJs.messageUserAgentServerMod.MessageUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentClient")
  @js.native
  class NotifyUserAgentClient protected ()
    extends typingsSlinky.sipJs.notifyUserAgentClientMod.NotifyUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
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
  
  @JSImport("sip.js/lib/core/user-agents", "PrackUserAgentClient")
  @js.native
  class PrackUserAgentClient protected ()
    extends typingsSlinky.sipJs.prackUserAgentClientMod.PrackUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PrackUserAgentServer")
  @js.native
  class PrackUserAgentServer protected ()
    extends typingsSlinky.sipJs.prackUserAgentServerMod.PrackUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PublishUserAgentClient")
  @js.native
  class PublishUserAgentClient protected ()
    extends typingsSlinky.sipJs.publishUserAgentClientMod.PublishUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentClient")
  @js.native
  class ReInviteUserAgentClient protected ()
    extends typingsSlinky.sipJs.reInviteUserAgentClientMod.ReInviteUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentServer")
  @js.native
  class ReInviteUserAgentServer protected ()
    extends typingsSlinky.sipJs.reInviteUserAgentServerMod.ReInviteUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
  @js.native
  class ReSubscribeUserAgentClient protected ()
    extends typingsSlinky.sipJs.reSubscribeUserAgentClientMod.ReSubscribeUserAgentClient {
    def this(dialog: SubscriptionDialog) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SubscriptionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentServer")
  @js.native
  class ReSubscribeUserAgentServer protected ()
    extends typingsSlinky.sipJs.reSubscribeUserAgentServerMod.ReSubscribeUserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReferUserAgentClient")
  @js.native
  class ReferUserAgentClient protected ()
    extends typingsSlinky.sipJs.referUserAgentClientMod.ReferUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReferUserAgentServer")
  @js.native
  class ReferUserAgentServer protected ()
    extends typingsSlinky.sipJs.referUserAgentServerMod.ReferUserAgentServer {
    /**
      * REFER UAS constructor.
      * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
      * @param message - Incoming REFER request message.
      */
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentClient")
  @js.native
  class RegisterUserAgentClient protected ()
    extends typingsSlinky.sipJs.registerUserAgentClientMod.RegisterUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentServer")
  @js.native
  class RegisterUserAgentServer protected ()
    extends typingsSlinky.sipJs.registerUserAgentServerMod.RegisterUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
  @js.native
  class SubscribeUserAgentClient protected ()
    extends typingsSlinky.sipJs.subscribeUserAgentClientMod.SubscribeUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentServer")
  @js.native
  class SubscribeUserAgentServer protected ()
    extends typingsSlinky.sipJs.subscribeUserAgentServerMod.SubscribeUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
  @js.native
  class UserAgentClient protected ()
    extends typingsSlinky.sipJs.userAgentClientMod.UserAgentClient {
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: UserAgentCore,
      message: OutgoingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: UserAgentCore,
      message: OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "UserAgentServer")
  @js.native
  class UserAgentServer protected ()
    extends typingsSlinky.sipJs.userAgentServerMod.UserAgentServer {
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: UserAgentCore,
      message: IncomingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: UserAgentCore,
      message: IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
}
