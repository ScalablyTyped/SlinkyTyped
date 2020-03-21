package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/cancel", JSImport.Namespace)
@js.native
object cancelMod extends js.Object {
  type IncomingCancelRequest = IncomingRequest
  type IncomingCancelResponse = IncomingResponse
  type OutgoingCancelRequest = OutgoingRequest
}

