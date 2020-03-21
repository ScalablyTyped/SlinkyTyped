package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/message", JSImport.Namespace)
@js.native
object methodsMessageMod extends js.Object {
  type IncomingMessageRequest = IncomingRequest
  type IncomingMessageResponse = IncomingResponse
  type OutgoingMessageRequest = OutgoingRequest
}

