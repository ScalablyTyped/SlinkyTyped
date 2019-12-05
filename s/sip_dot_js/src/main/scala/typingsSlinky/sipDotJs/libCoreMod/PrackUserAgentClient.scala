package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "PrackUserAgentClient")
@js.native
class PrackUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsMod.PrackUserAgentClient {
  def this(dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

