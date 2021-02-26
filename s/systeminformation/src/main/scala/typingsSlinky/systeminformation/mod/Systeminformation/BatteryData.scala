package typingsSlinky.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatteryData extends StObject {
  
  var acconnected: Boolean = js.native
  
  var capacityUnit: String = js.native
  
  var currentcapacity: Double = js.native
  
  var cyclecount: Double = js.native
  
  var designedcapacity: Double = js.native
  
  var hasbattery: Boolean = js.native
  
  var ischarging: Boolean = js.native
  
  var manufacturer: String = js.native
  
  var maxcapacity: Double = js.native
  
  var model: String = js.native
  
  var percent: Double = js.native
  
  var serial: String = js.native
  
  var timeremaining: Double = js.native
  
  var `type`: String = js.native
  
  var voltage: Double = js.native
}
object BatteryData {
  
  @scala.inline
  def apply(
    acconnected: Boolean,
    capacityUnit: String,
    currentcapacity: Double,
    cyclecount: Double,
    designedcapacity: Double,
    hasbattery: Boolean,
    ischarging: Boolean,
    manufacturer: String,
    maxcapacity: Double,
    model: String,
    percent: Double,
    serial: String,
    timeremaining: Double,
    `type`: String,
    voltage: Double
  ): BatteryData = {
    val __obj = js.Dynamic.literal(acconnected = acconnected.asInstanceOf[js.Any], capacityUnit = capacityUnit.asInstanceOf[js.Any], currentcapacity = currentcapacity.asInstanceOf[js.Any], cyclecount = cyclecount.asInstanceOf[js.Any], designedcapacity = designedcapacity.asInstanceOf[js.Any], hasbattery = hasbattery.asInstanceOf[js.Any], ischarging = ischarging.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], maxcapacity = maxcapacity.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], timeremaining = timeremaining.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatteryData]
  }
  
  @scala.inline
  implicit class BatteryDataMutableBuilder[Self <: BatteryData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcconnected(value: Boolean): Self = StObject.set(x, "acconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUnit(value: String): Self = StObject.set(x, "capacityUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentcapacity(value: Double): Self = StObject.set(x, "currentcapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyclecount(value: Double): Self = StObject.set(x, "cyclecount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignedcapacity(value: Double): Self = StObject.set(x, "designedcapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasbattery(value: Boolean): Self = StObject.set(x, "hasbattery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscharging(value: Boolean): Self = StObject.set(x, "ischarging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxcapacity(value: Double): Self = StObject.set(x, "maxcapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeremaining(value: Double): Self = StObject.set(x, "timeremaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoltage(value: Double): Self = StObject.set(x, "voltage", value.asInstanceOf[js.Any])
  }
}
