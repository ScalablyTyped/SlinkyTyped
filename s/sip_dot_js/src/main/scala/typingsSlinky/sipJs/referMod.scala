package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/refer", JSImport.Namespace)
@js.native
object referMod extends js.Object {
  type IncomingReferRequest = IncomingRequest
  type IncomingReferResponse = IncomingResponse
  type OutgoingReferRequest = OutgoingRequest
}

