package typingsSlinky.sipJs.coreTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport extends js.Object {
  /**
    * The transport protocol.
    *
    * @remarks
    * Formatted as defined for the Via header sent-protocol transport.
    * https://tools.ietf.org/html/rfc3261#section-20.42
    */
  val protocol: String = js.native
  /**
    * Send a message.
    *
    * @remarks
    * Resolves once message is sent. Otherwise rejects with an Error.
    *
    * @param message - Message to send.
    */
  def send(message: String): js.Promise[Unit] = js.native
}

object Transport {
  @scala.inline
  def apply(protocol: String, send: String => js.Promise[Unit]): Transport = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Transport]
  }
  @scala.inline
  implicit class TransportOps[Self <: Transport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

