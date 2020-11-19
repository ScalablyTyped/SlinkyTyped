package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when the connection status of a device changes. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
@js.native
abstract class DeviceConnectionChangeTrigger ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger
/* static members */
@JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
@js.native
object DeviceConnectionChangeTrigger extends js.Object {
  
  /**
    * Begins an asynchronous operation to get the DeviceConnectionChangeTrigger associated with the specified Id.
    * @param deviceId The device Id with which to find the associated trigger.
    * @return The DeviceConnectionChangeTrigger object associated with the specified device Id.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[
    typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger
  ] = js.native
}
