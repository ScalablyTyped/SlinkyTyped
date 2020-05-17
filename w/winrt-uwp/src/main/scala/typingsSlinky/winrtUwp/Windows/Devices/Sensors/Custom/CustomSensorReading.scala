package typingsSlinky.winrtUwp.Windows.Devices.Sensors.Custom

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
@js.native
trait CustomSensorReading extends js.Object {
  /** Gets the property set for the sensor. */
  var properties: IMapView[String, _] = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: js.Date = js.native
}

object CustomSensorReading {
  @scala.inline
  def apply(properties: IMapView[String, _], timestamp: js.Date): CustomSensorReading = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSensorReading]
  }
  @scala.inline
  implicit class CustomSensorReadingOps[Self <: CustomSensorReading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

