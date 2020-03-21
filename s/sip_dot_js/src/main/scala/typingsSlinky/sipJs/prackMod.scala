package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/prack", JSImport.Namespace)
@js.native
object prackMod extends js.Object {
  type IncomingPrackRequest = IncomingRequest
  type IncomingPrackResponse = IncomingResponse
  type OutgoingPrackRequest = OutgoingRequest
}

