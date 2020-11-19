package typingsSlinky.winrt.Windows.Networking.Proximity

import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPeerFinderStatics extends js.Object {
  
  var allowBluetooth: Boolean = js.native
  
  var allowInfrastructure: Boolean = js.native
  
  var allowWiFiDirect: Boolean = js.native
  
  var alternateIdentities: IMap[String, String] = js.native
  
  def connectAsync(peerInformation: PeerInformation): IAsyncOperation[StreamSocket] = js.native
  
  var displayName: String = js.native
  
  def findAllPeersAsync(): IAsyncOperation[IVectorView[PeerInformation]] = js.native
  
  var onconnectionrequested: js.Any = js.native
  
  var ontriggeredconnectionstatechanged: js.Any = js.native
  
  def start(): Unit = js.native
  def start(peerMessage: String): Unit = js.native
  
  def stop(): Unit = js.native
  
  var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
}
