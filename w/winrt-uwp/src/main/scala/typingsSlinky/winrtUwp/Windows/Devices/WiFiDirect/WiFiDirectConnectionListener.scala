package typingsSlinky.winrtUwp.Windows.Devices.WiFiDirect

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.connectionrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class used to listen for incoming Wi-Fi Direct connection requests. */
@js.native
trait WiFiDirectConnectionListener extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionrequested(
    `type`: connectionrequested,
    listener: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): Unit = js.native
  
  /** Notification on an incoming Wi-Fi Direct connection request. */
  def onconnectionrequested(ev: WiFiDirectConnectionRequestedEventArgs with WinRTEvent[WiFiDirectConnectionListener]): Unit = js.native
  /** Notification on an incoming Wi-Fi Direct connection request. */
  @JSName("onconnectionrequested")
  var onconnectionrequested_Original: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionrequested(
    `type`: connectionrequested,
    listener: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): Unit = js.native
}
