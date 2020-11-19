package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.SubscriptionDialog
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typingsSlinky.sipJs.reSubscribeUserAgentClientMod.ReSubscribeUserAgentClient {
  def this(dialog: SubscriptionDialog) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SubscriptionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}
