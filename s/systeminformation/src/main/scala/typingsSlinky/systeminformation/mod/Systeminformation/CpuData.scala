package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3. CPU, Memory, Disks, Battery, Graphics
@js.native
trait CpuData extends js.Object {
  var brand: String = js.native
  var cache: CpuCacheData = js.native
  var cores: Double = js.native
  var family: String = js.native
  var governor: String = js.native
  var manufacturer: String = js.native
  var model: String = js.native
  var physicalCores: Double = js.native
  var processors: Double = js.native
  var revision: String = js.native
  var socket: String = js.native
  var speed: String = js.native
  var speedmax: String = js.native
  var speedmin: String = js.native
  var stepping: String = js.native
  var vendor: String = js.native
  var voltage: String = js.native
}

object CpuData {
  @scala.inline
  def apply(
    brand: String,
    cache: CpuCacheData,
    cores: Double,
    family: String,
    governor: String,
    manufacturer: String,
    model: String,
    physicalCores: Double,
    processors: Double,
    revision: String,
    socket: String,
    speed: String,
    speedmax: String,
    speedmin: String,
    stepping: String,
    vendor: String,
    voltage: String
  ): CpuData = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cores = cores.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], governor = governor.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], speedmax = speedmax.asInstanceOf[js.Any], speedmin = speedmin.asInstanceOf[js.Any], stepping = stepping.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], voltage = voltage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuData]
  }
  @scala.inline
  implicit class CpuDataOps[Self <: CpuData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: CpuCacheData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCores(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGovernor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("governor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalCores(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalCores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedmax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeedmin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speedmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoltage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voltage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

