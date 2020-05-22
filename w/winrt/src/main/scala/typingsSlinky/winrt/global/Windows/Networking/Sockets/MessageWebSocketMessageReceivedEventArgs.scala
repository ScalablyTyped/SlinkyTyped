package typingsSlinky.winrt.global.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Storage.Streams.DataReader
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
@js.native
class MessageWebSocketMessageReceivedEventArgs ()
  extends typingsSlinky.winrt.Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs {
  /* CompleteClass */
  override var messageType: typingsSlinky.winrt.Windows.Networking.Sockets.SocketMessageType = js.native
  /* CompleteClass */
  override def getDataReader(): DataReader = js.native
  /* CompleteClass */
  override def getDataStream(): IInputStream = js.native
}

