package typingsSlinky.winrtUwp.Windows.Devices.WiFiDirect.Services

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.EndpointPair
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.DatagramSocket
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.remoteportadded
import typingsSlinky.winrtUwp.winrtUwpStrings.sessionstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Wi-Fi Direct Services (WFDS) session. */
@js.native
trait WiFiDirectServiceSession extends js.Object {
  
  /**
    * Adds a DatagramSocket to the session. Your code creates the DatagramSocket before calling this method. Associating a socket to the session causes port information to be sent to the remote device(s) in the session. (In terms of this API, a RemotePortAdded event is raised on each remote device in the session, specifying the UDP protocol.) A remote device can use that information to open a socket and connect back to the local machine.
    * @param value The DatagramSocket instance to associate with this session.
    * @return An asynchronous association action. Returns on successful completion of the association.
    */
  def addDatagramSocketAsync(value: DatagramSocket): IPromiseWithIAsyncAction = js.native
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remoteportadded(
    `type`: remoteportadded,
    listener: TypedEventHandler[WiFiDirectServiceSession, WiFiDirectServiceRemotePortAddedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessionstatuschanged(`type`: sessionstatuschanged, listener: TypedEventHandler[WiFiDirectServiceSession, _]): Unit = js.native
  
  /**
    * Adds a StreamSocketListener to the session. Your code creates the StreamSocketListener before calling this method. Associating a socket to the session causes port information to be sent to the remote device(s) in the session. (In terms of this API, a RemotePortAdded event is raised on each remote device in the session, specifying the TCP protocol.) A remote device can use that information to open a socket and connect back to the local machine.
    * @param value The StreamSocketListener instance to be associated with the session.
    * @return An asynchronous association action. Returns on successful completion of the association.
    */
  def addStreamSocketListenerAsync(value: StreamSocketListener): IPromiseWithIAsyncAction = js.native
  
  /** Gets the advertisement ID for the session. */
  var advertisementId: Double = js.native
  
  /** Closes the session. */
  def close(): Unit = js.native
  
  /** Gets the error status of the session. */
  var errorStatus: WiFiDirectServiceSessionErrorStatus = js.native
  
  /**
    * Gets a list of connection endpoint pairs for the session. Your code uses IVectorView operations to enumerate the endpoint pairs in the list.
    * @return An immutable snapshot list of endpoint pairs involved in the session.
    */
  def getConnectionEndpointPairs(): IVectorView[EndpointPair] = js.native
  
  /** Event raised when a new remote port is added to the session. Your event handler should respond by establishing the appropriate socket connection to the new remote port. */
  def onremoteportadded(ev: WiFiDirectServiceRemotePortAddedEventArgs with WinRTEvent[WiFiDirectServiceSession]): Unit = js.native
  /** Event raised when a new remote port is added to the session. Your event handler should respond by establishing the appropriate socket connection to the new remote port. */
  @JSName("onremoteportadded")
  var onremoteportadded_Original: TypedEventHandler[WiFiDirectServiceSession, WiFiDirectServiceRemotePortAddedEventArgs] = js.native
  
  /** Event raised when the session status changes. */
  def onsessionstatuschanged(ev: js.Any with WinRTEvent[WiFiDirectServiceSession]): Unit = js.native
  /** Event raised when the session status changes. */
  @JSName("onsessionstatuschanged")
  var onsessionstatuschanged_Original: TypedEventHandler[WiFiDirectServiceSession, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remoteportadded(
    `type`: remoteportadded,
    listener: TypedEventHandler[WiFiDirectServiceSession, WiFiDirectServiceRemotePortAddedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessionstatuschanged(`type`: sessionstatuschanged, listener: TypedEventHandler[WiFiDirectServiceSession, _]): Unit = js.native
  
  /** Gets the service address for this session. */
  var serviceAddress: String = js.native
  
  /** Gets the service name of the advertiser service involved in the session. */
  var serviceName: String = js.native
  
  /** Gets the session address for the session. */
  var sessionAddress: String = js.native
  
  /** Gets the session ID. */
  var sessionId: Double = js.native
  
  /** Gets the session status. */
  var status: WiFiDirectServiceSessionStatus = js.native
}
