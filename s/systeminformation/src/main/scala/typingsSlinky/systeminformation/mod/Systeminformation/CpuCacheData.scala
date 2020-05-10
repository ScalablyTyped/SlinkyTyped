package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuCacheData extends js.Object {
  var l1d: Double = js.native
  var l1i: Double = js.native
  var l2: Double = js.native
  var l3: Double = js.native
}

object CpuCacheData {
  @scala.inline
  def apply(l1d: Double, l1i: Double, l2: Double, l3: Double): CpuCacheData = {
    val __obj = js.Dynamic.literal(l1d = l1d.asInstanceOf[js.Any], l1i = l1i.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuCacheData]
  }
  @scala.inline
  implicit class CpuCacheDataOps[Self <: CpuCacheData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL1d(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL1i(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

