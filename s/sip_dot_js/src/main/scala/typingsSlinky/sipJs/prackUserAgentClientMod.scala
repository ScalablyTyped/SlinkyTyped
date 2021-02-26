package typingsSlinky.sipJs

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.userAgentClientMod.UserAgentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prackUserAgentClientMod {
  
  @JSImport("sip.js/lib/core/user-agents/prack-user-agent-client", "PrackUserAgentClient")
  @js.native
  class PrackUserAgentClient protected () extends UserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
}
