package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.ReSubscribeUserAgentClient {
  def this(dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SubscriptionDialog) = this()
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate
  ) = this()
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

