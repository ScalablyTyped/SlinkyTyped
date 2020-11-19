package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.getBody")
@js.native
object getBody extends js.Object {
  
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(message: typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def apply(message: typingsSlinky.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
}
