package typingsSlinky.teslajs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vehicle_ extends /* key */ StringDictionary[String | Double | Boolean | Null] {
  var id: String = js.native
  var vehicleID: Double = js.native
}

object Vehicle_ {
  @scala.inline
  def apply(id: String, vehicleID: Double): Vehicle_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], vehicleID = vehicleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vehicle_]
  }
  @scala.inline
  implicit class Vehicle_Ops[Self <: Vehicle_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVehicleID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

