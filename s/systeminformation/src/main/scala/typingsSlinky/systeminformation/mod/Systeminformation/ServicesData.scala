package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesData extends js.Object {
  var name: String = js.native
  var pcpu: Double = js.native
  var pids: js.Array[Double] = js.native
  var pmem: Double = js.native
  var running: Boolean = js.native
  var startmode: String = js.native
}

object ServicesData {
  @scala.inline
  def apply(
    name: String,
    pcpu: Double,
    pids: js.Array[Double],
    pmem: Double,
    running: Boolean,
    startmode: String
  ): ServicesData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pcpu = pcpu.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], pmem = pmem.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], startmode = startmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesData]
  }
  @scala.inline
  implicit class ServicesDataOps[Self <: ServicesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPmem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartmode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startmode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

