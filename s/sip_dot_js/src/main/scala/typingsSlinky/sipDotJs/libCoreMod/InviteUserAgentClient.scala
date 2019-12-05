package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsMod.InviteUserAgentClient {
  def this(
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
}

