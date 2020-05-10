package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemData extends js.Object {
  var active: Double = js.native
  var available: Double = js.native
  var buffcache: Double = js.native
  var buffers: Double = js.native
  var cached: Double = js.native
  var free: Double = js.native
  var slab: Double = js.native
  var swapfree: Double = js.native
  var swaptotal: Double = js.native
  var swapused: Double = js.native
  var total: Double = js.native
  var used: Double = js.native
}

object MemData {
  @scala.inline
  def apply(
    active: Double,
    available: Double,
    buffcache: Double,
    buffers: Double,
    cached: Double,
    free: Double,
    slab: Double,
    swapfree: Double,
    swaptotal: Double,
    swapused: Double,
    total: Double,
    used: Double
  ): MemData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], buffcache = buffcache.asInstanceOf[js.Any], buffers = buffers.asInstanceOf[js.Any], cached = cached.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], slab = slab.asInstanceOf[js.Any], swapfree = swapfree.asInstanceOf[js.Any], swaptotal = swaptotal.asInstanceOf[js.Any], swapused = swapused.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemData]
  }
  @scala.inline
  implicit class MemDataOps[Self <: MemData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffcache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffcache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCached(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlab(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapfree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapfree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwaptotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaptotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapused(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

