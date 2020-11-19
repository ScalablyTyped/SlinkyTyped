package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.readingchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an interface for a barometric sensor to measure atmospheric pressure. */
@js.native
trait Barometer extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Barometer, BarometerReadingChangedEventArgs]): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current reading for the barometer.
    * @return The current atmospheric pressure according to this sensor.
    */
  def getCurrentReading(): BarometerReading = js.native
  
  /** The smallest report interval that is supported by this barometer sensor. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the barometer sensor reports a new value. */
  def onreadingchanged(ev: BarometerReadingChangedEventArgs with WinRTEvent[Barometer]): Unit = js.native
  /** Occurs each time the barometer sensor reports a new value. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Barometer, BarometerReadingChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Barometer, BarometerReadingChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the current report interval for the barometer. */
  var reportInterval: Double = js.native
}
