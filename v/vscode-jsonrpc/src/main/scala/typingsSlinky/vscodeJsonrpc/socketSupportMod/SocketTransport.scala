package typingsSlinky.vscodeJsonrpc.socketSupportMod

import typingsSlinky.vscodeJsonrpc.Thenable
import typingsSlinky.vscodeJsonrpc.messageReaderMod.MessageReader
import typingsSlinky.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTransport extends js.Object {
  def onConnected(): Thenable[js.Tuple2[MessageReader, MessageWriter]] = js.native
}

object SocketTransport {
  @scala.inline
  def apply(onConnected: () => Thenable[js.Tuple2[MessageReader, MessageWriter]]): SocketTransport = {
    val __obj = js.Dynamic.literal(onConnected = js.Any.fromFunction0(onConnected))
    __obj.asInstanceOf[SocketTransport]
  }
  @scala.inline
  implicit class SocketTransportOps[Self <: SocketTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnConnected(value: () => Thenable[js.Tuple2[MessageReader, MessageWriter]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnected")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

