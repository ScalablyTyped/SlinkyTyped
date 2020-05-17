package typingsSlinky.winrtUwp.global.Windows.Networking.Sockets

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Networking.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports network communication using a UDP datagram socket. */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
/** Creates a new DatagramSocket object. */
class DatagramSocket ()
  extends typingsSlinky.winrtUwp.Windows.Networking.Sockets.DatagramSocket

/* static members */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
object DatagramSocket extends js.Object {
  /**
    * Gets a list of EndpointPair objects based on a remote hostname and remote service name that can be used to send datagrams to a remote network destination.
    * @param remoteHostName The remote hostname or IP address.
    * @param remoteServiceName The remote service name or UDP port.
    * @return A list of EndpointPair objects.
    */
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a list of EndpointPair objects based on a remote hostname and remote service name and the sort order to be used.
    * @param remoteHostName The remote hostname or IP address.
    * @param remoteServiceName The remote service name or UDP port.
    * @param sortOptions The sort order to use when returning the list.
    * @return A list of EndpointPair objects.
    */
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String, sortOptions: HostNameSortOptions): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

