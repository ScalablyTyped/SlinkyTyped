package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Storage.Streams.DataReader
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageWebSocketMessageReceivedEventArgs extends StObject {
  
  def getDataReader(): DataReader = js.native
  
  def getDataStream(): IInputStream = js.native
  
  var messageType: SocketMessageType = js.native
}
object IMessageWebSocketMessageReceivedEventArgs {
  
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class IMessageWebSocketMessageReceivedEventArgsMutableBuilder[Self <: IMessageWebSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataReader(value: () => DataReader): Self = StObject.set(x, "getDataReader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataStream(value: () => IInputStream): Self = StObject.set(x, "getDataStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageType(value: SocketMessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
  }
}
