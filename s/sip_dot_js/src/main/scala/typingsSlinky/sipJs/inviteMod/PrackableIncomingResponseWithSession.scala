package typingsSlinky.sipJs.inviteMod

import typingsSlinky.sipJs.incomingResponseMod.IncomingResponse
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import typingsSlinky.sipJs.prackMod.OutgoingPrackRequest
import typingsSlinky.sipJs.sessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrackableIncomingResponseWithSession extends IncomingResponse {
  /** Session associated with outgoing request progress. If out of dialog request, an early dialog. */
  val session: Session = js.native
  /**
    * Send an PRACK to acknowledge this response.
    * @param options - Request options bucket.
    */
  def prack(): OutgoingPrackRequest = js.native
  def prack(options: RequestOptions): OutgoingPrackRequest = js.native
}

