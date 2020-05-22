package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorReading extends js.Object {
  var illuminanceInLux: Double
  var timestamp: js.Date
}

object ILightSensorReading {
  @scala.inline
  def apply(illuminanceInLux: Double, timestamp: js.Date): ILightSensorReading = {
    val __obj = js.Dynamic.literal(illuminanceInLux = illuminanceInLux.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightSensorReading]
  }
}

