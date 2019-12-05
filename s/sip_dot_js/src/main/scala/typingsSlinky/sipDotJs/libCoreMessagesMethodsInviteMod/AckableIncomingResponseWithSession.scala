package typingsSlinky.sipDotJs.libCoreMessagesMethodsInviteMod

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashResponseMod.IncomingResponse
import typingsSlinky.sipDotJs.libCoreMessagesMethodsAckMod.OutgoingAckRequest
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typingsSlinky.sipDotJs.libCoreSessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckableIncomingResponseWithSession extends IncomingResponse {
  /** Session associated with outgoing request acceptance. */
  val session: Session = js.native
  /**
    * Send an ACK to acknowledge this response.
    * @param options - Request options bucket.
    */
  def ack(): OutgoingAckRequest = js.native
  def ack(options: RequestOptions): OutgoingAckRequest = js.native
}

