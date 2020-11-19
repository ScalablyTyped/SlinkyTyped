package typingsSlinky.winrtUwp.Windows.Networking.ServiceDiscovery.Dnssd

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.DatagramSocket
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates an instance of a service that uses DNS Service Discovery (DNS-SD). */
@js.native
trait DnssdServiceInstance extends js.Object {
  
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
