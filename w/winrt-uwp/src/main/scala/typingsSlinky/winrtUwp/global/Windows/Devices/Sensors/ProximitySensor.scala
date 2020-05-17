package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an interface for a proximity sensor to determine whether or not an object is detected. */
@JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
abstract class ProximitySensor ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.ProximitySensor

/* static members */
@JSGlobal("Windows.Devices.Sensors.ProximitySensor")
@js.native
object ProximitySensor extends js.Object {
  /**
    * Obtains the proximity sensor from its identifier.
    * @param sensorId The sensor identifier.
    * @return Returns the ProximitySensor object from its identifier.
    */
  def fromId(sensorId: String): typingsSlinky.winrtUwp.Windows.Devices.Sensors.ProximitySensor = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector. If no device selector is available, this method returns null.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Gets readings from the trigger details in background task.
    * @param triggerDetails The trigger details received from the background task.
    * @return The collection of proximity data retrieved from the trigger details.
    */
  def getReadingsFromTriggerDetails(triggerDetails: typingsSlinky.winrtUwp.Windows.Devices.Sensors.SensorDataThresholdTriggerDetails): IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Sensors.ProximitySensorReading] = js.native
}

