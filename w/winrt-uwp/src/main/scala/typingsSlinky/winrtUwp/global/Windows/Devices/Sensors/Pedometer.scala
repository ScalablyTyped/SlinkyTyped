package typingsSlinky.winrtUwp.global.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a pedometer to measure the number of steps taken. */
@JSGlobal("Windows.Devices.Sensors.Pedometer")
@js.native
abstract class Pedometer ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Sensors.Pedometer
/* static members */
@JSGlobal("Windows.Devices.Sensors.Pedometer")
@js.native
object Pedometer extends js.Object {
  
  /**
    * Obtains the pedometer from its identifier.
    * @param deviceId The sensor identifier.
    * @return Returns the Pedometer object from its identifier.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sensors.Pedometer] = js.native
  
  /**
    * Asynchronously obtains the default pedometer.
    * @return Asynchronously returns a Pedometer object that represents the default sensor.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Sensors.Pedometer] = js.native
  
  /**
    * Gets the device selector.
    * @return Returns the device selector, if it exists; otherwise null.
    */
  def getDeviceSelector(): String = js.native
  
  var getReadingsFromTriggerDetails: js.Any = js.native
  
   /* unmapped type */ /**
    * Asynchronously gets sensor readings from a specific time.
    * @param fromTime The time for which you want to retrieve the reading.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: js.Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets pedometer readings from a specific time and duration.
    * @param fromTime The time for which you want to retrieve the reading.
    * @param duration The duration over which you want to retrieve data.
    * @return Asynchronously returns a list of PedometerReading objects that represent info about the sensor.
    */
  def getSystemHistoryAsync(fromTime: js.Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}
