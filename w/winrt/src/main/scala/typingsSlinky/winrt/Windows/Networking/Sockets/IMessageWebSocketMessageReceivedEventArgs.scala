package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Storage.Streams.DataReader
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageWebSocketMessageReceivedEventArgs extends js.Object {
  var messageType: SocketMessageType = js.native
  def getDataReader(): DataReader = js.native
  def getDataStream(): IInputStream = js.native
}

object IMessageWebSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
  @scala.inline
  implicit class IMessageWebSocketMessageReceivedEventArgsOps[Self <: IMessageWebSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDataReader(value: () => DataReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataReader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataStream(value: () => IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessageType(value: SocketMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

