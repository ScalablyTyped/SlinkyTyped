package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.accesschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about access to a device. */
@js.native
trait DeviceAccessInformation extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accesschanged(
    `type`: accesschanged,
    listener: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): Unit = js.native
  
  /** The current device access status. */
  var currentStatus: DeviceAccessStatus = js.native
  
  /** Raised when access to a device has changed. */
  def onaccesschanged(ev: DeviceAccessChangedEventArgs with WinRTEvent[DeviceAccessInformation]): Unit = js.native
  /** Raised when access to a device has changed. */
  @JSName("onaccesschanged")
  var onaccesschanged_Original: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accesschanged(
    `type`: accesschanged,
    listener: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): Unit = js.native
}
