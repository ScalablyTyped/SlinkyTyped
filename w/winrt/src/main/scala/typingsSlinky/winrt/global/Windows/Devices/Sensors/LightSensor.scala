package typingsSlinky.winrt.global.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
class LightSensor ()
  extends typingsSlinky.winrt.Windows.Devices.Sensors.LightSensor {
  /* CompleteClass */
  override var minimumReportInterval: Double = js.native
  /* CompleteClass */
  override var onreadingchanged: js.Any = js.native
  /* CompleteClass */
  override var reportInterval: Double = js.native
  /* CompleteClass */
  override def getCurrentReading(): typingsSlinky.winrt.Windows.Devices.Sensors.LightSensorReading = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Sensors.LightSensor")
@js.native
object LightSensor extends js.Object {
  def getDefault(): typingsSlinky.winrt.Windows.Devices.Sensors.LightSensor = js.native
}

