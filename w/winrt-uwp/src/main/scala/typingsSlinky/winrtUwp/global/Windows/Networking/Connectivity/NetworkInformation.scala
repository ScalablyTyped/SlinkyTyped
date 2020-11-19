package typingsSlinky.winrtUwp.global.Windows.Networking.Connectivity

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkStatusChangedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.EndpointPair
import typingsSlinky.winrtUwp.Windows.Networking.HostName
import typingsSlinky.winrtUwp.Windows.Networking.HostNameSortOptions
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.networkstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to network connection information for the local machine. */
@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
abstract class NetworkInformation ()
  extends typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkInformation
/* static members */
@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
object NetworkInformation extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_networkstatuschanged(`type`: networkstatuschanged, listener: NetworkStatusChangedEventHandler): Unit = js.native
  
  /**
    * Returns an array of ConnectionProfile objects that match the filtering criteria defined by ConnectionProfileFilter .
    * @param pProfileFilter Provides the filtering criteria.
    * @return An array of ConnectionProfile objects.
    */
  def findConnectionProfilesAsync(pProfileFilter: typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ConnectionProfileFilter): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets a list of profiles for connections, active or otherwise, on the local machine.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): IVectorView[typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile] = js.native
  
  /**
    * Gets a list of host names associated with the local machine.
    * @return An array of host names for the local machine.
    */
  def getHostNames(): IVectorView[HostName] = js.native
  
  /**
    * Gets the connection profile associated with the internet connection currently used by the local machine.
    * @return The profile for the connection currently used to connect the machine to the Internet, or null if there is no connection profile with a suitable connection.
    */
  def getInternetConnectionProfile(): typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile = js.native
  
  /**
    * Gets an array of LanIdentifier objects that contain locality information for each NetworkAdapter object that currently connected to a network.
    * @return An array of LanIdentifier objects.
    */
  def getLanIdentifiers(): IVectorView[typingsSlinky.winrtUwp.Windows.Networking.Connectivity.LanIdentifier] = js.native
  
  /**
    * Gets proxy configuration for a connection using the specified URI.
    * @param uri The proxy configuration URI.
    * @return Information about the connection proxy.
    */
  def getProxyConfigurationAsync(uri: Uri): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration] = js.native
  
  /**
    * Gets a sorted list of EndpointPair objects.
    * @param destinationList A list of EndpointPair objects to be sorted.
    * @param sortOptions Indicates sorting options for the returned array.
    * @return A sorted array of EndpointPair objects.
    */
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair] = js.native
  
  /** Occurs when the network status changes for a connection. */
  def onnetworkstatuschanged(ev: WinRTEvent[_]): Unit = js.native
  /** Occurs when the network status changes for a connection. */
  @JSName("onnetworkstatuschanged")
  var onnetworkstatuschanged_Original: NetworkStatusChangedEventHandler = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_networkstatuschanged(`type`: networkstatuschanged, listener: NetworkStatusChangedEventHandler): Unit = js.native
}
