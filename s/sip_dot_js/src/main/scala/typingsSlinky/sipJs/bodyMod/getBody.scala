package typingsSlinky.sipJs.bodyMod

import typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/body", "getBody")
@js.native
object getBody extends js.Object {
  
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(message: IncomingResponseMessage): js.UndefOr[Body] = js.native
  def apply(message: OutgoingRequestMessage): js.UndefOr[Body] = js.native
}
