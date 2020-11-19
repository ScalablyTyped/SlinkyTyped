package typingsSlinky.winrt.Windows.Networking.Sockets

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IClosable
import typingsSlinky.winrt.Windows.Networking.EndpointPair
import typingsSlinky.winrt.Windows.Networking.HostName
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamSocket extends IClosable {
  
  def connectAsync(endpointPair: EndpointPair): IAsyncAction = js.native
  def connectAsync(endpointPair: EndpointPair, protectionLevel: SocketProtectionLevel): IAsyncAction = js.native
  def connectAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncAction = js.native
  def connectAsync(remoteHostName: HostName, remoteServiceName: String, protectionLevel: SocketProtectionLevel): IAsyncAction = js.native
  
  var control: StreamSocketControl = js.native
  
  var information: StreamSocketInformation = js.native
  
  var inputStream: IInputStream = js.native
  
  var outputStream: IOutputStream = js.native
  
  def upgradeToSslAsync(protectionLevel: SocketProtectionLevel, validationHostName: HostName): IAsyncAction = js.native
}
