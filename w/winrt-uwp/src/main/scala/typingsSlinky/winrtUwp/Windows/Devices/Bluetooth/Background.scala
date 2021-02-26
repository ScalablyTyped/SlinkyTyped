package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocket
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides class describing trigger details for Bluetooth triggers. */
object Background {
  
  /** Provides information about a BluetoothLEAdvertisementPublisher trigger. */
  @js.native
  trait BluetoothLEAdvertisementPublisherTriggerDetails extends StObject {
    
    /** Gets the error status for the trigger. */
    var error: BluetoothError = js.native
    
    /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
    var status: BluetoothLEAdvertisementPublisherStatus = js.native
  }
  object BluetoothLEAdvertisementPublisherTriggerDetails {
    
    @scala.inline
    def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherTriggerDetails = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[BluetoothLEAdvertisementPublisherTriggerDetails]
    }
    
    @scala.inline
    implicit class BluetoothLEAdvertisementPublisherTriggerDetailsMutableBuilder[Self <: BluetoothLEAdvertisementPublisherTriggerDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: BluetoothLEAdvertisementPublisherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about a BluetoothLEAdvertisementWatcher trigger. */
  @js.native
  trait BluetoothLEAdvertisementWatcherTriggerDetails extends StObject {
    
    /** Gets a collection of Bluetooth LE advertisements. */
    var advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs] = js.native
    
    /** Gets the error status for the trigger. */
    var error: BluetoothError = js.native
    
    /** Gets the parameters used to configure received signal strength indicator (RSSI)-based filtering. */
    var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
  }
  object BluetoothLEAdvertisementWatcherTriggerDetails {
    
    @scala.inline
    def apply(
      advertisements: IVectorView[BluetoothLEAdvertisementReceivedEventArgs],
      error: BluetoothError,
      signalStrengthFilter: BluetoothSignalStrengthFilter
    ): BluetoothLEAdvertisementWatcherTriggerDetails = {
      val __obj = js.Dynamic.literal(advertisements = advertisements.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], signalStrengthFilter = signalStrengthFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[BluetoothLEAdvertisementWatcherTriggerDetails]
    }
    
    @scala.inline
    implicit class BluetoothLEAdvertisementWatcherTriggerDetailsMutableBuilder[Self <: BluetoothLEAdvertisementWatcherTriggerDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvertisements(value: IVectorView[BluetoothLEAdvertisementReceivedEventArgs]): Self = StObject.set(x, "advertisements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalStrengthFilter(value: BluetoothSignalStrengthFilter): Self = StObject.set(x, "signalStrengthFilter", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about the Bluetooth LE device that caused this trigger to fire. */
  @js.native
  trait GattCharacteristicNotificationTriggerDetails extends StObject {
    
    /** Gets the GATT characteristic that changed. */
    var characteristic: GattCharacteristic = js.native
    
    /** Gets a byte stream containing the new value of the characteristic. */
    var value: IBuffer = js.native
  }
  object GattCharacteristicNotificationTriggerDetails {
    
    @scala.inline
    def apply(characteristic: GattCharacteristic, value: IBuffer): GattCharacteristicNotificationTriggerDetails = {
      val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GattCharacteristicNotificationTriggerDetails]
    }
    
    @scala.inline
    implicit class GattCharacteristicNotificationTriggerDetailsMutableBuilder[Self <: GattCharacteristicNotificationTriggerDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacteristic(value: GattCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about the Bluetooth device that caused this trigger to fire. */
  @js.native
  trait RfcommConnectionTriggerDetails extends StObject {
    
    /** Gets whether this is an incoming connection. */
    var incoming: Boolean = js.native
    
    /** Gets the BluetoothDevice object that represents the remote device. */
    var remoteDevice: BluetoothDevice = js.native
    
    /** Gets a reference to the underlying StreamSocket of this connection. */
    var socket: StreamSocket = js.native
  }
  object RfcommConnectionTriggerDetails {
    
    @scala.inline
    def apply(incoming: Boolean, remoteDevice: BluetoothDevice, socket: StreamSocket): RfcommConnectionTriggerDetails = {
      val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], remoteDevice = remoteDevice.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommConnectionTriggerDetails]
    }
    
    @scala.inline
    implicit class RfcommConnectionTriggerDetailsMutableBuilder[Self <: RfcommConnectionTriggerDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncoming(value: Boolean): Self = StObject.set(x, "incoming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteDevice(value: BluetoothDevice): Self = StObject.set(x, "remoteDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: StreamSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
  @js.native
  trait RfcommInboundConnectionInformation extends StObject {
    
    /** Gets or sets the service UUID that will be advertised in the SDP record. */
    var localServiceId: RfcommServiceId = js.native
    
    /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
    var sdpRecord: IBuffer = js.native
    
    /** Gets or sets the service capabilities that will be advertised. */
    var serviceCapabilities: BluetoothServiceCapabilities = js.native
  }
  object RfcommInboundConnectionInformation {
    
    @scala.inline
    def apply(
      localServiceId: RfcommServiceId,
      sdpRecord: IBuffer,
      serviceCapabilities: BluetoothServiceCapabilities
    ): RfcommInboundConnectionInformation = {
      val __obj = js.Dynamic.literal(localServiceId = localServiceId.asInstanceOf[js.Any], sdpRecord = sdpRecord.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommInboundConnectionInformation]
    }
    
    @scala.inline
    implicit class RfcommInboundConnectionInformationMutableBuilder[Self <: RfcommInboundConnectionInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalServiceId(value: RfcommServiceId): Self = StObject.set(x, "localServiceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdpRecord(value: IBuffer): Self = StObject.set(x, "sdpRecord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCapabilities(value: BluetoothServiceCapabilities): Self = StObject.set(x, "serviceCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides information for RFCOMM outbound connections. If an app wants the system to create outbound connections on its behalf, the app must create this object and attach it to the RfcommConnectionTrigger . */
  @js.native
  trait RfcommOutboundConnectionInformation extends StObject {
    
    /** Gets or sets the service UUID of the remote service to which the system will connect on behalf of the app. */
    var remoteServiceId: RfcommServiceId = js.native
  }
  object RfcommOutboundConnectionInformation {
    
    @scala.inline
    def apply(remoteServiceId: RfcommServiceId): RfcommOutboundConnectionInformation = {
      val __obj = js.Dynamic.literal(remoteServiceId = remoteServiceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommOutboundConnectionInformation]
    }
    
    @scala.inline
    implicit class RfcommOutboundConnectionInformationMutableBuilder[Self <: RfcommOutboundConnectionInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteServiceId(value: RfcommServiceId): Self = StObject.set(x, "remoteServiceId", value.asInstanceOf[js.Any])
    }
  }
}
