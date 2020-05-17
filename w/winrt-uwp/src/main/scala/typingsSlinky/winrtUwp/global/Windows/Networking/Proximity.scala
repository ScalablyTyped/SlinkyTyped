package typingsSlinky.winrtUwp.global.Windows.Networking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes
import typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerRole
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocket
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.connectionrequested
import typingsSlinky.winrtUwp.winrtUwpStrings.triggeredconnectionstatechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes that support connections between devices that are within close range. */
@JSGlobal("Windows.Networking.Proximity")
@js.native
object Proximity extends js.Object {
  /** Contains properties that are passed to an application with the ConnectionRequested event. */
  @js.native
  abstract class ConnectionRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs
  
  /** Enables you to discover other instances of your app on nearby devices and create a socket connection between the peer apps by using a tap gesture or by browsing. For creating Bluetooth socket connections on Windows 8.1 and later, use Windows.Devices.Bluetooth.Rfcomm instead. */
  @js.native
  abstract class PeerFinder ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerFinder
  
  /** Contains information that identifies a peer. */
  @js.native
  abstract class PeerInformation ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerInformation
  
  /** Dynamically discovers peer apps within wireless range. */
  @js.native
  abstract class PeerWatcher ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcher
  
  /** Enables you to publish messages to proximate devices or subscribe to messages from proximate devices. */
  @js.native
  abstract class ProximityDevice ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.ProximityDevice
  
  /** Represents a message that's received from a subscription. */
  @js.native
  abstract class ProximityMessage ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.ProximityMessage
  
  /** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
  @js.native
  abstract class TriggeredConnectionStateChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
  
  /** Indicates which discovery options are available to use with the PeerFinder class. */
  @js.native
  object PeerDiscoveryTypes extends js.Object {
    /* 1 */ val browse: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.browse with Double = js.native
    /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.none with Double = js.native
    /* 2 */ val triggered: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes.triggered with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerDiscoveryTypes with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object PeerFinder extends js.Object {
    /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Bluetooth. */
    var allowBluetooth: Boolean = js.native
    /** Specifies whether the PeerFinder class may connect to a StreamSocket object using TCP/IP. */
    var allowInfrastructure: Boolean = js.native
    /** Specifies whether the PeerFinder class may connect a StreamSocket object by using Wi-Fi Direct. */
    var allowWiFiDirect: Boolean = js.native
    /** Gets a list of alternate appId values to match with peer applications on other platforms. */
    var alternateIdentities: IMap[String, String] = js.native
    /** Gets or sets user or device data to include during device discovery. */
    var discoveryData: IBuffer = js.native
    /** Gets or sets the name that identifies your computer to remote peers. */
    var displayName: String = js.native
    /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
    @JSName("onconnectionrequested")
    var onconnectionrequested_Original: TypedEventHandler[
        _, 
        typingsSlinky.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs
      ] = js.native
    /** Occurs during a tap gesture from a remote peer. */
    @JSName("ontriggeredconnectionstatechanged")
    var ontriggeredconnectionstatechanged_Original: TypedEventHandler[
        _, 
        typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
      ] = js.native
    /** Gets or sets the role of the app in peer-to-peer connections. */
    var role: PeerRole = js.native
    /** Gets a value that indicates which discovery options are available to use with the PeerFinder class. */
    var supportedDiscoveryTypes: PeerDiscoveryTypes = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_connectionrequested(
      `type`: connectionrequested,
      listener: TypedEventHandler[
          _, 
          typingsSlinky.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_triggeredconnectionstatechanged(
      `type`: triggeredconnectionstatechanged,
      listener: TypedEventHandler[
          _, 
          typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
    ): Unit = js.native
    /**
      * Connects to a peer discovered by a call to the FindAllPeersAsync method.
      * @param peerInformation A peer information object representing the peer to connect to.
      * @return An asynchronous operation for connecting to a remote peer using the supplied StreamSocket object.
      */
    def connectAsync(peerInformation: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerInformation): IPromiseWithIAsyncOperation[StreamSocket] = js.native
    /**
      * Creates a new instance of a PeerWatcher object for dynamic discovery of peer apps.
      * @return An instance of a PeerWatcher object for dynamic discovery of peer apps.
      */
    def createWatcher(): typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcher = js.native
    /**
      * Asynchronously browses for peer devices that are running the same app within wireless range.
      * @return The asynchronous operation for browsing for peer devices that are running your app.
      */
    def findAllPeersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /** Occurs when a remote peer requests a connection using the ConnectAsync method. */
    def onconnectionrequested(
      ev: typingsSlinky.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs with WinRTEvent[_]
    ): Unit = js.native
    /** Occurs during a tap gesture from a remote peer. */
    def ontriggeredconnectionstatechanged(
      ev: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs with WinRTEvent[_]
    ): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_connectionrequested(
      `type`: connectionrequested,
      listener: TypedEventHandler[
          _, 
          typingsSlinky.winrtUwp.Windows.Networking.Proximity.ConnectionRequestedEventArgs
        ]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_triggeredconnectionstatechanged(
      `type`: triggeredconnectionstatechanged,
      listener: TypedEventHandler[
          _, 
          typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs
        ]
    ): Unit = js.native
    /** Makes an app discoverable to remote peers. */
    def start(): Unit = js.native
    /**
      * Makes an app discoverable to remote peers.
      * @param peerMessage The message to deliver to the proximate device.
      */
    def start(peerMessage: String): Unit = js.native
    /** Stops advertising for a peer connection. */
    def stop(): Unit = js.native
  }
  
  /** Describes the role of the peer app when connected to multiple peers. */
  @js.native
  object PeerRole extends js.Object {
    /* 2 */ val client: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerRole.client with Double = js.native
    /* 1 */ val host: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerRole.host with Double = js.native
    /* 0 */ val peer: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerRole.peer with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerRole with Double] = js.native
  }
  
  /** Describes the status of a PeerWatcher object. */
  @js.native
  object PeerWatcherStatus extends js.Object {
    /* 5 */ val aborted: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.aborted with Double = js.native
    /* 0 */ val created: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.created with Double = js.native
    /* 2 */ val enumerationCompleted: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.enumerationCompleted with Double = js.native
    /* 1 */ val started: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.started with Double = js.native
    /* 4 */ val stopped: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.stopped with Double = js.native
    /* 3 */ val stopping: typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus.stopping with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Proximity.PeerWatcherStatus with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object ProximityDevice extends js.Object {
    /**
      * Creates an instance of a ProximityDevice class and activates the specified proximity device interface.
      * @param deviceId The DeviceInformation Id of a proximity device.
      * @return A new ProximityDevice that uses the specified proximity device interface. Throws a System.IO.FileNotFoundException exception if the specified proximity device interface isunavailable.
      */
    def fromId(deviceId: String): typingsSlinky.winrtUwp.Windows.Networking.Proximity.ProximityDevice = js.native
    /**
      * Creates an instance of a ProximityDevice class and activates the default proximity provider.
      * @return A new proximity device that uses the default proximity provider. Returns NULL if no proximity devices are installed.
      */
    def getDefault(): typingsSlinky.winrtUwp.Windows.Networking.Proximity.ProximityDevice = js.native
    /**
      * Returns the class selection string that you can use to enumerate proximity devices.
      * @return The class selection string for proximity devices.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Indicates the current state of a connection to a peer application. */
  @js.native
  object TriggeredConnectState extends js.Object {
    /* 4 */ val canceled: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.canceled with Double = js.native
    /* 3 */ val completed: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.completed with Double = js.native
    /* 2 */ val connecting: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.connecting with Double = js.native
    /* 5 */ val failed: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.failed with Double = js.native
    /* 1 */ val listening: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.listening with Double = js.native
    /* 0 */ val peerFound: typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState.peerFound with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Networking.Proximity.TriggeredConnectState with Double
      ] = js.native
  }
  
}

