package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.InviteUserAgentClient {
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingInviteRequestDelegate
  ) = this()
}
