package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ByeUserAgentClient")
@js.native
class ByeUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.ByeUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
