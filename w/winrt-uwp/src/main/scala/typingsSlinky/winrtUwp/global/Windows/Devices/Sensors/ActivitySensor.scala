package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an activity sensor that provides the activity and status of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivitySensor")
@js.native
abstract class ActivitySensor ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensor
object ActivitySensor {
  
  /**
    * Asynchronously obtains the sensor from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the ActivitySensor object from its identifier.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ActivitySensor.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensor] = js.native
  
  /**
    * Asynchronously obtains the default sensor.
    * @return Asynchronously returns a ActivitySensor object that represents the default sensor.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ActivitySensor.getDefaultAsync")
  @js.native
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sensors.ActivitySensor] = js.native
  
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise, null.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ActivitySensor.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
  
  /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time at which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ActivitySensor.getSystemHistoryAsync")
  @js.native
  def getSystemHistoryAsync(fromTime: js.Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets sensor readings from a specific time and duration.
    * @param fromTime The time at which to get sensor readings.
    * @param duration The time span during which to get sensor readings.
    * @return Asynchronously returns a list of ActivitySensorReading objects that represent info about the sensor.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Sensors.ActivitySensor.getSystemHistoryAsync")
  @js.native
  def getSystemHistoryAsync(fromTime: js.Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}
