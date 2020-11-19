package typingsSlinky.sipJs.inviteMod

import typingsSlinky.sipJs.ackMod.OutgoingAckRequest
import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.sessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AckableIncomingResponseWithSession extends IncomingResponse {
  
  /**
    * Send an ACK to acknowledge this response.
    * @param options - Request options bucket.
    */
  def ack(): OutgoingAckRequest = js.native
  def ack(options: RequestOptions): OutgoingAckRequest = js.native
  
  /** Session associated with outgoing request acceptance. */
  val session: Session = js.native
}
