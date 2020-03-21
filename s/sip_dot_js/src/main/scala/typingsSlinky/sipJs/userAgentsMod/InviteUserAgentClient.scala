package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typingsSlinky.sipJs.inviteUserAgentClientMod.InviteUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
}

