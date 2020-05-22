package typingsSlinky.winrtUwp.global.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the device updates that invoked the trigger. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherTriggerDetails")
@js.native
abstract class DeviceWatcherTriggerDetails ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherTriggerDetails {
  /** Gets the events that activated the trigger. */
  /* CompleteClass */
  override var deviceWatcherEvents: IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherEvent] = js.native
}

