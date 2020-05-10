package typingsSlinky.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SysStats extends js.Object {
  var cpu: Double = js.native
  var external: Double = js.native
  var heapTotal: Double = js.native
  var heapUsed: Double = js.native
  var rss: Double = js.native
}

object SysStats {
  @scala.inline
  def apply(cpu: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): SysStats = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[SysStats]
  }
  @scala.inline
  implicit class SysStatsOps[Self <: SysStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeapTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeapUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

