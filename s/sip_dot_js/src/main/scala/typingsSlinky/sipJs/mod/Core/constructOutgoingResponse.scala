package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  
  def apply(
    message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
}
