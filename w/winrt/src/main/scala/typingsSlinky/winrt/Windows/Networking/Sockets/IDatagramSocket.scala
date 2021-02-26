package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IClosable
import typingsSlinky.winrt.Windows.Networking.EndpointPair
import typingsSlinky.winrt.Windows.Networking.HostName
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatagramSocket extends IClosable {
  
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction = js.native
  
  def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
  
  def connectAsync(endpointPair: EndpointPair): IAsyncAction = js.native
  def connectAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncAction = js.native
  
  var control: DatagramSocketControl = js.native
  
  def getOutputStreamAsync(endpointPair: EndpointPair): IAsyncOperation[IOutputStream] = js.native
  def getOutputStreamAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncOperation[IOutputStream] = js.native
  
  var information: DatagramSocketInformation = js.native
  
  def joinMulticastGroup(host: HostName): Unit = js.native
  
  var onmessagereceived: js.Any = js.native
  
  var outputStream: IOutputStream = js.native
}
