package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessesProcessLoadData extends js.Object {
  var cpu: Double = js.native
  var mem: Double = js.native
  var pid: Double = js.native
  var pids: js.Array[Double] = js.native
  var proc: String = js.native
}

object ProcessesProcessLoadData {
  @scala.inline
  def apply(cpu: Double, mem: Double, pid: Double, pids: js.Array[Double], proc: String): ProcessesProcessLoadData = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], mem = mem.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pids = pids.asInstanceOf[js.Any], proc = proc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessLoadData]
  }
  @scala.inline
  implicit class ProcessesProcessLoadDataOps[Self <: ProcessesProcessLoadData] (val x: Self) extends AnyVal {
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
    def withMem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPids(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

