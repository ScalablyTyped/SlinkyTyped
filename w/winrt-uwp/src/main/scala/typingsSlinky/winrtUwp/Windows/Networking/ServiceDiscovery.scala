package typingsSlinky.winrtUwp.Windows.Networking

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.DatagramSocket
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsDnssdServiceInstance
import typingsSlinky.winrtUwp.winrtUwpStrings.added
import typingsSlinky.winrtUwp.winrtUwpStrings.enumerationcompleted
import typingsSlinky.winrtUwp.winrtUwpStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServiceDiscovery {
  
  /** Supports the registration and discovery of services that advertise themselves using DNS Service Discovery (DNS-SD). */
  object Dnssd {
    
    @js.native
    sealed trait DnssdRegistrationStatus extends StObject
    /** Values representing the status of a DNS-SD registration attempt. */
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus")
    @js.native
    object DnssdRegistrationStatus extends StObject {
      
      /** The service was not registered because the service name provided is not valid. */
      @js.native
      sealed trait invalidServiceName extends DnssdRegistrationStatus
      
      /** The service was not registered because security settings did not allow it. */
      @js.native
      sealed trait securityError extends DnssdRegistrationStatus
      
      /** The service was not registered because of an error on the DNS server. */
      @js.native
      sealed trait serverError extends DnssdRegistrationStatus
      
      /** The service has been registered successfully. */
      @js.native
      sealed trait success extends DnssdRegistrationStatus
    }
    
    @js.native
    sealed trait DnssdServiceWatcherStatus extends StObject
    /** Values representing the status of a DnssdServiceWatcher. */
    @JSGlobal("Windows.Networking.ServiceDiscovery.Dnssd.DnssdServiceWatcherStatus")
    @js.native
    object DnssdServiceWatcherStatus extends StObject {
      
      /** The watcher has been aborted in the process of enumerating service instances. */
      @js.native
      sealed trait aborted extends DnssdServiceWatcherStatus
      
      /** The watcher has been created. */
      @js.native
      sealed trait created extends DnssdServiceWatcherStatus
      
      /** The watcher has finished enumerating service instances. */
      @js.native
      sealed trait enumerationCompleted extends DnssdServiceWatcherStatus
      
      /** The watcher has acknowledged receiving a start command. */
      @js.native
      sealed trait started extends DnssdServiceWatcherStatus
      
      /** The watcher has completed processing a stop command. */
      @js.native
      sealed trait stopped extends DnssdServiceWatcherStatus
      
      /** The watcher has acknowledged receiving a stop command. */
      @js.native
      sealed trait stopping extends DnssdServiceWatcherStatus
    }
    
    /** Encapsulates detailed information about the result of an attempt to register a service instance using DNS-SD. */
    @js.native
    trait DnssdRegistrationResult extends StObject {
      
      /** Indicates whether the instance name was changed in the course of the registration process. */
      var hasInstanceNameChanged: Boolean = js.native
      
      /** The IP address of the successfully-created service instance. */
      var ipAddress: HostName = js.native
      
      /** An enumeration value indicating the result of a service instance registration attempt. */
      var status: DnssdRegistrationStatus = js.native
    }
    object DnssdRegistrationResult {
      
      @scala.inline
      def apply(hasInstanceNameChanged: Boolean, ipAddress: HostName, status: DnssdRegistrationStatus): DnssdRegistrationResult = {
        val __obj = js.Dynamic.literal(hasInstanceNameChanged = hasInstanceNameChanged.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[DnssdRegistrationResult]
      }
      
      @scala.inline
      implicit class DnssdRegistrationResultMutableBuilder[Self <: DnssdRegistrationResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHasInstanceNameChanged(value: Boolean): Self = StObject.set(x, "hasInstanceNameChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIpAddress(value: HostName): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: DnssdRegistrationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /** Encapsulates an instance of a service that uses DNS Service Discovery (DNS-SD). */
    @js.native
    trait DnssdServiceInstance extends StObject {
      
      /** Gets or sets the DNS-SD service instance name for this DnssdServiceInstance . */
      var dnssdServiceInstanceName: String = js.native
      
      /** Gets or sets the hostname of the host for this DnssdServiceInstance . */
      var hostName: HostName = js.native
      
      /** Gets or sets the port number used by this DnssdServiceInstance . */
      var port: Double = js.native
      
      /** Gets or sets the priority value to assign to this service instance, as defined in RFC 2782. Clients use Priority to decide which of several equivalent service instances to attach to. */
      var priority: Double = js.native
      
      /**
        * Asynchronously registers a datagram (UDP) socket listener for the service, on a given socket.
        * @param socket Describes the socket that this service instance uses to listen for new service clients.
        * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
        */
      def registerDatagramSocketAsync(socket: DatagramSocket): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
      /**
        * Asynchronously registers a datagram (UDP) socket listener for the service, on a given socket and network adapter.
        * @param socket Describes the socket that this service instance uses to listen for new service clients.
        * @param adapter Specifies the network adapter this service uses to listen for new service clients.
        * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
        */
      def registerDatagramSocketAsync(socket: DatagramSocket, adapter: NetworkAdapter): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
      
      /**
        * Asynchronously registers a stream (TCP) socket listener for the service, on the given socket.
        * @param socket Describes the socket that this service instance uses to listen for new service clients.
        * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
        */
      def registerStreamSocketListenerAsync(socket: StreamSocketListener): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
      /**
        * Asynchronously registers a stream (TCP) socket listener for the service, on the given socket and network adapter.
        * @param socket Describes the socket that this service instance uses to listen for new service clients.
        * @param adapter Specifies the network adapter this service uses to listen for new service clients.
        * @return On successful completion of the asynchronous operation, returns an object describing the results of registration.
        */
      def registerStreamSocketListenerAsync(socket: StreamSocketListener, adapter: NetworkAdapter): IPromiseWithIAsyncOperation[DnssdRegistrationResult] = js.native
      
      /** Gets the attributes of this service instance, as a list of [name, value] pairs of strings. Attributes can be inspected by service clients to determine additional information about a service instance. */
      var textAttributes: IMap[String, String] = js.native
      
      /** Gets or sets the weight value assigned to this service instance, as defined in RFC 2782. Clients use the Weight value to choose between servers with the same Priority value. */
      var weight: Double = js.native
    }
    
    /** A collection of DNS Service Discovery (DNS-SD) service instances. */
    @js.native
    trait DnssdServiceInstanceCollection extends Array[DnssdServiceInstance] {
      
      /**
        * Gets an iterator that is initialized to refer to the first item in the instance collection.
        * @return Gets an iterator instance initialized to the first item in the service instance collection. Your code can use this iterator to enumerate all members of the collection.
        */
      def first(): IIterator[DnssdServiceInstance] = js.native
      
      /**
        * Gets the DnssdServiceInstance at a given index into the DnssdServiceInstanceCollection .
        * @param index The index of the instance to be retrieved. Indices are 0-based. If your code specifies an index that is out of bounds, an exception is thrown. The maximum valid index is equal to one less than the DnssdServiceInstanceCollection.Size value.
        * @return The DnssdServiceInstance at the given index in the collection.
        */
      def getAt(index: Double): DnssdServiceInstance = js.native
      
      /**
        * Gets multiple DnssdServiceInstance objects from a DNS-SD service instance collection.
        * @param startIndex Index of the first collection item to be retrieved.
        */
      def getMany(startIndex: Double): ItemsDnssdServiceInstance = js.native
      
      def indexOf(value: DnssdServiceInstance, extra: js.Any*): Index = js.native
      /**
        * Gets a value indicating whether a given DnssdServiceInstance is at the specified index in this service instance collection.
        * @param value The DnssdServiceInstance to get the index of.
        */
      @JSName("indexOf")
      def indexOf_Index(value: DnssdServiceInstance): Index = js.native
      
      /** Gets the number of items in the collection */
      var size: Double = js.native
    }
    
    /** Maintains a collection of available DNS Service Discovery (DNS-SD) service instances. */
    @js.native
    trait DnssdServiceWatcher extends StObject {
      
      def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_added(`type`: added, listener: TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
      
      /** Event that is triggered when a DnssdServiceWatcher has added a DNS Service Discovery (DNS-SD) instance to its collection of available service instances. */
      def onadded(ev: DnssdServiceInstance with WinRTEvent[DnssdServiceWatcher]): Unit = js.native
      /** Event that is triggered when a DnssdServiceWatcher has added a DNS Service Discovery (DNS-SD) instance to its collection of available service instances. */
      @JSName("onadded")
      var onadded_Original: TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance] = js.native
      
      /** Event triggered when a DnssdServiceWatcher has finished enumerating available DNS Service Discovery (DNS-SD) service instances. */
      def onenumerationcompleted(ev: js.Any with WinRTEvent[DnssdServiceWatcher]): Unit = js.native
      /** Event triggered when a DnssdServiceWatcher has finished enumerating available DNS Service Discovery (DNS-SD) service instances. */
      @JSName("onenumerationcompleted")
      var onenumerationcompleted_Original: TypedEventHandler[DnssdServiceWatcher, _] = js.native
      
      /** Event triggered when an in-progress enumeration has been stopped. */
      def onstopped(ev: js.Any with WinRTEvent[DnssdServiceWatcher]): Unit = js.native
      /** Event triggered when an in-progress enumeration has been stopped. */
      @JSName("onstopped")
      var onstopped_Original: TypedEventHandler[DnssdServiceWatcher, _] = js.native
      
      def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_added(`type`: added, listener: TypedEventHandler[DnssdServiceWatcher, DnssdServiceInstance]): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
      @JSName("removeEventListener")
      def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[DnssdServiceWatcher, _]): Unit = js.native
      
      /** Starts an enumeration of the network for available DNS Service Discovery (DNS-SD) service instances. */
      def start(): Unit = js.native
      
      /** Gets the current status of the DnssdServiceWatcherStatus . */
      var status: DnssdServiceWatcherStatus = js.native
      
      /** Stops an in-progress enumeration of available DNS Service Discovery (DNS-SD) service instances. */
      def stop(): Unit = js.native
    }
  }
}
