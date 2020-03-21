package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.inviteMod.OutgoingInviteRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.InviteUserAgentClient")
@js.native
class InviteUserAgentClient protected ()
  extends typingsSlinky.sipJs.coreMod.InviteUserAgentClient {
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

