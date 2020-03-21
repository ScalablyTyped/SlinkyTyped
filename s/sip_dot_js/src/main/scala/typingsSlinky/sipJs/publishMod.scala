package typingsSlinky.sipJs

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/publish", JSImport.Namespace)
@js.native
object publishMod extends js.Object {
  type IncomingPublishRequest = IncomingRequest
  type IncomingPublishResponse = IncomingResponse
  type OutgoingPublishRequest = OutgoingRequest
}

