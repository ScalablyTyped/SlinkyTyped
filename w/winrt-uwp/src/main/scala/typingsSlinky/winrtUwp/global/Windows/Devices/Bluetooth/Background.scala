package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocket
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides class describing trigger details for Bluetooth triggers. */
@JSGlobal("Windows.Devices.Bluetooth.Background")
@js.native
object Background extends js.Object {
  /** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
  @js.native
  abstract class BluetoothLEAdvertisementPublisherTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementPublisherTriggerDetails {
    /** Gets the error status for the trigger. */
    /* CompleteClass */
    override var error: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothError = js.native
    /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
    /* CompleteClass */
    override var status: BluetoothLEAdvertisementPublisherStatus = js.native
  }
  
  /** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
  @js.native
  abstract class BluetoothLEAdvertisementWatcherTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.BluetoothLEAdvertisementWatcherTriggerDetails {
    /** Gets a collection of Bluetooth LE advertisements. */
    /* CompleteClass */
    override var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs] = js.native
    /** Gets the error status for the trigger. */
    /* CompleteClass */
    override var error: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothError = js.native
    /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
    /* CompleteClass */
    override var signalStrengthFilter: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter = js.native
  }
  
  /** Provides information about the Bluetooth LE device that caused this trigger to fire. */
  @js.native
  abstract class GattCharacteristicNotificationTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.GattCharacteristicNotificationTriggerDetails {
    /** Gets the GATT characteristic that changed. */
    /* CompleteClass */
    override var characteristic: GattCharacteristic = js.native
    /** Gets a byte stream containing the new value of the characteristic. */
    /* CompleteClass */
    override var value: IBuffer = js.native
  }
  
  /** Provides information about the Bluetooth device that caused this trigger to fire. */
  @js.native
  abstract class RfcommConnectionTriggerDetails ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommConnectionTriggerDetails {
    /** Gets whether this is an incoming connection. */
    /* CompleteClass */
    override var incoming: Boolean = js.native
    /** Gets the BluetoothDevice object that represents the remote device. */
    /* CompleteClass */
    override var remoteDevice: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice = js.native
    /** Gets a reference to the underlying StreamSocket of this connection. */
    /* CompleteClass */
    override var socket: StreamSocket = js.native
  }
  
  /** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
  @js.native
  abstract class RfcommInboundConnectionInformation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation {
    /** Gets or sets the service UUID that will be advertised in the SDP record. */
    /* CompleteClass */
    override var localServiceId: RfcommServiceId = js.native
    /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
    /* CompleteClass */
    override var sdpRecord: IBuffer = js.native
    /** Gets or sets the service capabilities that will be advertised. */
    /* CompleteClass */
    override var serviceCapabilities: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities = js.native
  }
  
  /** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
  @js.native
  abstract class RfcommOutboundConnectionInformation ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background.RfcommOutboundConnectionInformation {
    /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
    /* CompleteClass */
    override var remoteServiceId: RfcommServiceId = js.native
  }
  
}

