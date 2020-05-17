package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an activity sensor that provides the activity and status of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
abstract class ActivitySensor ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensor

/* static members */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
object ActivitySensor extends js.Object {
  /**
    * Asynchronously obtains the sensor from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the ActivitySensor object from its identifier.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensor] = js.native
  /**
    * Asynchronously obtains the default sensor.
    * @return Asynchronously returns a ActivitySensor object that represents the default sensor.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensor] = js.native
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise, null.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time at which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: js.Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets sensor readings from a specific time and duration.
    * @param fromTime The time at which to get sensor readings.
    * @param duration The time span during which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: js.Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

