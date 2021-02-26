package typingsSlinky.winrtUwp.Windows.Devices.WiFi

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import typingsSlinky.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.availablenetworkschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use this class to enumerate local Wi-Fi adapters, initiate Wi-Fi scans, enumerate scan results, and to connect or disconnect individual adapters. */
@js.native
trait WiFiAdapter extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availablenetworkschanged(`type`: availablenetworkschanged, listener: TypedEventHandler[WiFiAdapter, _]): Unit = js.native
  
  /**
    * Connect this Wi-Fi device to the specified network, with the specified reconnection policy.
    * @param availableNetwork Describes the Wi-Fi network to be connected.
    * @param reconnectionKind Specifies how to reconnect if the connection is lost.
    * @return An asynchronous connect operation. On successful conclusion of the operation, returns an object that describes the result of the connect operation.
    */
  def connectAsync(availableNetwork: WiFiAvailableNetwork, reconnectionKind: WiFiReconnectionKind): IPromiseWithIAsyncOperation[WiFiConnectionResult] = js.native
  /**
    * Connect this Wi-Fi device to the specified network, with the specified passphrase and reconnection policy.
    * @param availableNetwork Specifies the Wi-Fi network to connect to.
    * @param reconnectionKind Describes how to reconnect to the network if connection is lost.
    * @param passwordCredential The passphrase to be used to connect to the access point.
    * @return An asynchronous connect operation. On successful conclusion of the operation, returns an object that describes the result of the connect operation.
    */
  def connectAsync(
    availableNetwork: WiFiAvailableNetwork,
    reconnectionKind: WiFiReconnectionKind,
    passwordCredential: PasswordCredential
  ): IPromiseWithIAsyncOperation[WiFiConnectionResult] = js.native
  /**
    * Connect this Wi-Fi device to a hidden network, with the given passphrase and reconnection policy.
    * @param availableNetwork Describes the Wi-Fi network to connect to.
    * @param reconnectionKind Describes how to reconnect to the network if connection is lost.
    * @param passwordCredential Password or other credential to use to connect to the network.
    * @param ssid When the network SSID is hidden, use this parameter to provide the SSID.
    * @return An asynchronous connect operation. On successful conclusion of the operation, returns an object that describes the result of the connect operation.
    */
  def connectAsync(
    availableNetwork: WiFiAvailableNetwork,
    reconnectionKind: WiFiReconnectionKind,
    passwordCredential: PasswordCredential,
    ssid: String
  ): IPromiseWithIAsyncOperation[WiFiConnectionResult] = js.native
  
  /** Disconnects any active Wi-Fi connection through this adapter. */
  def disconnect(): Unit = js.native
  
  /** Gets information about a Wi-Fi adapter. */
  var networkAdapter: NetworkAdapter = js.native
  
  /** Gets a list of available networks populated by the last Wi-Fi scan on this WiFiNetworkAdapter. */
  var networkReport: WiFiNetworkReport = js.native
  
  /** Event raised when a scan completes on this Wi-Fi adapter. This even cannot be raised from a background task. */
  def onavailablenetworkschanged(ev: js.Any with WinRTEvent[WiFiAdapter]): Unit = js.native
  /** Event raised when a scan completes on this Wi-Fi adapter. This even cannot be raised from a background task. */
  @JSName("onavailablenetworkschanged")
  var onavailablenetworkschanged_Original: TypedEventHandler[WiFiAdapter, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availablenetworkschanged(`type`: availablenetworkschanged, listener: TypedEventHandler[WiFiAdapter, _]): Unit = js.native
  
  /**
    * Directs this adapter to initiate an asynchronous network scan.
    * @return An asynchronous scan operation. On successful completion, returns a list of networks scanned by this adapter.
    */
  def scanAsync(): IPromiseWithIAsyncAction = js.native
}
