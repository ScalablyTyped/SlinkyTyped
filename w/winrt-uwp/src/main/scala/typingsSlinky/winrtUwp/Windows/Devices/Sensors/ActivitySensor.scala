package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an activity sensor that provides the activity and status of a sensor. */
@js.native
trait ActivitySensor extends js.Object {
  /** Gets the device identifier. */
  var deviceId: String = js.native
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs] = js.native
  /** Gets the power in milliwatts that the sensor consumes. */
  var powerInMilliwatts: Double = js.native
  /** Gets the list of activity types that the sensor pledges to perform. */
  var subscribedActivities: IVector[ActivityType] = js.native
  /** Gets the list of activity types that the sensor supports. */
  var supportedActivities: IVectorView[ActivityType] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): Unit = js.native
  /**
    * Asynchronously gets the current sensor reading.
    * @return Asynchronously returns a ActivitySensorReading object that represents info about the sensor.
    */
  def getCurrentReadingAsync(): IPromiseWithIAsyncOperation[ActivitySensorReading] = js.native
  /** Occurs each time the sensor reports a new sensor reading. */
  def onreadingchanged(ev: ActivitySensorReadingChangedEventArgs with WinRTEvent[ActivitySensor]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[ActivitySensor, ActivitySensorReadingChangedEventArgs]
  ): Unit = js.native
}

