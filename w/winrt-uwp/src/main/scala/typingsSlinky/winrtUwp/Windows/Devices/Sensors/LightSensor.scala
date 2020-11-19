package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ambient-light sensor. */
@js.native
trait LightSensor extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current ambient-light sensor reading.
    * @return The current ambient-light sensor reading.
    */
  def getCurrentReading(): LightSensorReading = js.native
  
  /** Gets the minimum report interval supported by the sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the ambient-light sensor reports a new sensor reading. */
  def onreadingchanged(ev: LightSensorReadingChangedEventArgs with WinRTEvent[LightSensor]): Unit = js.native
  /** Occurs each time the ambient-light sensor reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[LightSensor, LightSensorReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the current report interval for the ambient light sensor. */
  var reportInterval: Double = js.native
}
