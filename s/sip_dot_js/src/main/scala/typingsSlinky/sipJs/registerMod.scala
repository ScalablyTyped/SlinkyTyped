package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  type IncomingRegisterRequest = IncomingRequest
  type IncomingRegisterResponse = IncomingResponse
  type OutgoingRegisterRequest = OutgoingRequest
}

