package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Storage.Streams.DataReader
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a message received event on a MessageWebSocket . */
@js.native
trait MessageWebSocketMessageReceivedEventArgs extends js.Object {
  /** Gets the type of the message received by a MessageWebSocket object. */
  var messageType: SocketMessageType = js.native
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    */
  def getDataReader(): DataReader = js.native
  /**
    * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
    * @return A message represented as a sequential stream of bytes.
    */
  def getDataStream(): IInputStream = js.native
}

object MessageWebSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
  @scala.inline
  implicit class MessageWebSocketMessageReceivedEventArgsOps[Self <: MessageWebSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
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

