package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatteryData extends js.Object {
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
  implicit class BatteryDataOps[Self <: BatteryData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcconnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acconnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapacityUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentcapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentcapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyclecount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyclecount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesignedcapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designedcapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasbattery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasbattery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIscharging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ischarging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxcapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxcapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeremaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeremaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoltage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voltage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

