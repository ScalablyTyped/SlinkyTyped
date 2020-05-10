package typingsSlinky.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerDeviceUsage extends js.Object {
  var maxLogical: Double = js.native
  var maxPhysical: Double = js.native
  var minLogical: Double = js.native
  var minPhysical: Double = js.native
  var physicalMultiplier: Double = js.native
  var unit: Double = js.native
  var usage: Double = js.native
  var usagePage: Double = js.native
}

object PointerDeviceUsage {
  @scala.inline
  def apply(
    maxLogical: Double,
    maxPhysical: Double,
    minLogical: Double,
    minPhysical: Double,
    physicalMultiplier: Double,
    unit: Double,
    usage: Double,
    usagePage: Double
  ): PointerDeviceUsage = {
    val __obj = js.Dynamic.literal(maxLogical = maxLogical.asInstanceOf[js.Any], maxPhysical = maxPhysical.asInstanceOf[js.Any], minLogical = minLogical.asInstanceOf[js.Any], minPhysical = minPhysical.asInstanceOf[js.Any], physicalMultiplier = physicalMultiplier.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerDeviceUsage]
  }
  @scala.inline
  implicit class PointerDeviceUsageOps[Self <: PointerDeviceUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLogical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLogical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPhysical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPhysical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLogical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLogical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPhysical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPhysical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsagePage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

