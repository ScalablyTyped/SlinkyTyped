package typingsSlinky.winrtUwp.Windows.Devices.Sensors

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.orientationchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a simple orientation sensor. */
@js.native
trait SimpleOrientationSensor extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchanged(
    `type`: orientationchanged,
    listener: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the default simple orientation sensor.
    * @return The default simple orientation sensor.
    */
  def getCurrentOrientation(): SimpleOrientation = js.native
  
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  def onorientationchanged(ev: SimpleOrientationSensorOrientationChangedEventArgs with WinRTEvent[SimpleOrientationSensor]): Unit = js.native
  /** Occurs each time the simple orientation sensor reports a new sensor reading */
  @JSName("onorientationchanged")
  var onorientationchanged_Original: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchanged(
    `type`: orientationchanged,
    listener: TypedEventHandler[SimpleOrientationSensor, SimpleOrientationSensorOrientationChangedEventArgs]
  ): Unit = js.native
}
