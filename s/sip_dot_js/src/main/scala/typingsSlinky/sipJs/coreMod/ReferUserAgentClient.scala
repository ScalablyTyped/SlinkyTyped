package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReferUserAgentClient")
@js.native
class ReferUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.ReferUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

