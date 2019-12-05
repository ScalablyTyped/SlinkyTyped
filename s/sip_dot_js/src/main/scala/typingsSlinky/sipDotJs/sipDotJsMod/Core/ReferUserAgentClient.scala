package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReferUserAgentClient")
@js.native
class ReferUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.ReferUserAgentClient {
  def this(dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

