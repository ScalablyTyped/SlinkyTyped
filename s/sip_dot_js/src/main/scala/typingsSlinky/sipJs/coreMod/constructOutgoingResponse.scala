package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.outgoingResponseMod.OutgoingResponse
import typingsSlinky.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(
    message: typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
}

