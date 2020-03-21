package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/info", JSImport.Namespace)
@js.native
object methodsInfoMod extends js.Object {
  type IncomingInfoRequest = IncomingRequest
  type IncomingInfoResponse = IncomingResponse
  type OutgoingInfoRequest = OutgoingRequest
}

