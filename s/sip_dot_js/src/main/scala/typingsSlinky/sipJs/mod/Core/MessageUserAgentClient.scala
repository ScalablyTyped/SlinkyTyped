package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.MessageUserAgentClient")
@js.native
class MessageUserAgentClient protected ()
  extends typingsSlinky.sipJs.coreMod.MessageUserAgentClient {
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}
