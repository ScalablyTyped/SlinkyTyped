package typingsSlinky.teslajs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleID(value: Double): Self = this.set("vehicleID", value.asInstanceOf[js.Any])
  }
}
