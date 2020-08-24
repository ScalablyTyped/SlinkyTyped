package typingsSlinky.winrt.global.Windows.Networking

import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes
import typingsSlinky.winrt.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Proximity")
@js.native
object Proximity extends js.Object {
  @js.native
  class ConnectionRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Networking.Proximity.ConnectionRequestedEventArgs
  
  @js.native
  class PeerFinder ()
    extends typingsSlinky.winrt.Windows.Networking.Proximity.PeerFinder
  
  @js.native
  class PeerInformation ()
    extends typingsSlinky.winrt.Windows.Networking.Proximity.PeerInformation
  
  @js.native
  class ProximityDevice ()
    extends typingsSlinky.winrt.Windows.Networking.Proximity.ProximityDevice
  
  @js.native
  class ProximityMessage ()
    extends typingsSlinky.winrt.Windows.Networking.Proximity.ProximityMessage
  
  @js.native
  class TriggeredConnectionStateChangedEventArgs ()
    extends typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
  
  @js.native
  object PeerDiscoveryTypes extends js.Object {
    /* 1 */ val browse: typingsSlinky.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.browse with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.none with Double = js.native
    /* 2 */ val triggered: typingsSlinky.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Networking.Proximity.PeerDiscoveryTypes with Double] = js.native
  }
  
  /* static members */
  @js.native
  object PeerFinder extends js.Object {
    var allowBluetooth: Boolean = js.native
    var allowInfrastructure: Boolean = js.native
    var allowWiFiDirect: Boolean = js.native
    var alternateIdentities: IMap[String, String] = js.native
    var displayName: String = js.native
    var onconnectionrequested: js.Any = js.native
    var ontriggeredconnectionstatechanged: js.Any = js.native
    var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
    def connectAsync(peerInformation: typingsSlinky.winrt.Windows.Networking.Proximity.PeerInformation): IAsyncOperation[StreamSocket] = js.native
    def findAllPeersAsync(): IAsyncOperation[IVectorView[typingsSlinky.winrt.Windows.Networking.Proximity.PeerInformation]] = js.native
    def start(): Unit = js.native
    def start(peerMessage: String): Unit = js.native
    def stop(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ProximityDevice extends js.Object {
    def fromId(deviceInterfaceId: String): typingsSlinky.winrt.Windows.Networking.Proximity.ProximityDevice = js.native
    def getDefault(): typingsSlinky.winrt.Windows.Networking.Proximity.ProximityDevice = js.native
    def getDeviceSelector(): String = js.native
  }
  
  @js.native
  object TriggeredConnectState extends js.Object {
    /* 4 */ val canceled: typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState.canceled with Double = js.native
    /* 3 */ val completed: typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState.completed with Double = js.native
    /* 2 */ val connecting: typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState.connecting with Double = js.native
    /* 5 */ val failed: typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState.failed with Double = js.native
    /* 1 */ val listening: typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState.listening with Double = js.native
    /* 0 */ val peerFound: typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState.peerFound with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.Networking.Proximity.TriggeredConnectState with Double
      ] = js.native
  }
  
}

