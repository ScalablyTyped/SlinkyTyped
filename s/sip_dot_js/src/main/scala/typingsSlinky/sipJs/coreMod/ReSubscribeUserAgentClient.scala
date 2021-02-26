package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.ReSubscribeUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}
