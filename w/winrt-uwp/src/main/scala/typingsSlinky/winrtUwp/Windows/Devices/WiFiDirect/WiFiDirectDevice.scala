package typingsSlinky.winrtUwp.Windows.Devices.WiFiDirect

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Networking.EndpointPair
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.connectionstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages connections to associated Wi-Fi Direct devices. */
@js.native
trait WiFiDirectDevice extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[WiFiDirectDevice, _]): Unit = js.native
  
  /** Close the active Wi-Fi Direct device connection. */
  def close(): Unit = js.native
  
  /** Gets the connection status for the WiFi-Direct device. */
  var connectionStatus: WiFiDirectConnectionStatus = js.native
  
  /** Gets the DeviceInformation Id for the Wi-Fi Direct device. */
  var deviceId: String = js.native
  
  /**
    * Gets a collection of network addresses for the Wi-Fi Direct device as endpoint pairs.
    * @return A collection of network addresses for the Wi-Fi Direct device as endpoint pairs.
    */
  def getConnectionEndpointPairs(): IVectorView[EndpointPair] = js.native
  
  /** Occurs when a Wi-Fi Direct device connection is connected or disconnected. */
  def onconnectionstatuschanged(ev: js.Any with WinRTEvent[WiFiDirectDevice]): Unit = js.native
  /** Occurs when a Wi-Fi Direct device connection is connected or disconnected. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[WiFiDirectDevice, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[WiFiDirectDevice, _]): Unit = js.native
}
