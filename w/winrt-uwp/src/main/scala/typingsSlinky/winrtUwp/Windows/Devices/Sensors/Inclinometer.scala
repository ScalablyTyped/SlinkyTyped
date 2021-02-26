package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an inclinometer sensor. */
@js.native
trait Inclinometer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current inclinometer reading.
    * @return The current inclinometer reading.
    */
  def getCurrentReading(): InclinometerReading = js.native
  
  /** Gets the minimum report interval supported by the inclinometer. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the inclinometer reports a new sensor reading. */
  def onreadingchanged(ev: InclinometerReadingChangedEventArgs with WinRTEvent[Inclinometer]): Unit = js.native
  /** Occurs each time the inclinometer reports a new sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  /** Gets the sensor reading type. */
  var readingType: SensorReadingType = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(
    `type`: readingchanged,
    listener: TypedEventHandler[Inclinometer, InclinometerReadingChangedEventArgs]
  ): Unit = js.native
  
  /** Gets or sets the current report interval for the inclinometer. */
  var reportInterval: Double = js.native
}
