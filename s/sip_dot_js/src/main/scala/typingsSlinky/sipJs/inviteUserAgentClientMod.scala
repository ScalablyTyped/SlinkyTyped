package typingsSlinky.sipJs

import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.userAgentClientMod.UserAgentClient
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/invite-user-agent-client", JSImport.Namespace)
@js.native
object inviteUserAgentClientMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest because Already inherited
  - typingsSlinky.sipJs.inviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class InviteUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
    var confirmedDialogAcks: js.Any = js.native
    var confirmedDialogs: js.Any = js.native
    @JSName("delegate")
    var delegate_InviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    var earlyDialogs: js.Any = js.native
  }
  
}

