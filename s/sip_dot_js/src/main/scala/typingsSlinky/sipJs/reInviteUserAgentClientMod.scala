package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.userAgentClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/re-invite-user-agent-client", JSImport.Namespace)
@js.native
object reInviteUserAgentClientMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest because Already inherited
  - typingsSlinky.sipJs.inviteMod.OutgoingInviteRequest because var conflicts: delegate, message. Inlined  */ @js.native
  class ReInviteUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
    @JSName("delegate")
    var delegate_ReInviteUserAgentClient: js.UndefOr[OutgoingInviteRequestDelegate] = js.native
    var dialog: js.Any = js.native
  }
  
}

