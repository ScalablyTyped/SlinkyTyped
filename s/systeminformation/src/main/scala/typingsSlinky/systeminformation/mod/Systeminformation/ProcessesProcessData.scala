package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessesProcessData extends js.Object {
  var command: String = js.native
  var mem_rss: Double = js.native
  var mem_vsz: Double = js.native
  var name: String = js.native
  var nice: Double = js.native
  var params: String = js.native
  var parentPid: Double = js.native
  var path: String = js.native
  var pcpu: Double = js.native
  var pcpus: Double = js.native
  var pcpuu: Double = js.native
  var pid: Double = js.native
  var pmem: Double = js.native
  var priority: Double = js.native
  var started: String = js.native
  var state: String = js.native
  var tty: String = js.native
  var user: String = js.native
}

object ProcessesProcessData {
  @scala.inline
  def apply(
    command: String,
    mem_rss: Double,
    mem_vsz: Double,
    name: String,
    nice: Double,
    params: String,
    parentPid: Double,
    path: String,
    pcpu: Double,
    pcpus: Double,
    pcpuu: Double,
    pid: Double,
    pmem: Double,
    priority: Double,
    started: String,
    state: String,
    tty: String,
    user: String
  ): ProcessesProcessData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], mem_rss = mem_rss.asInstanceOf[js.Any], mem_vsz = mem_vsz.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], parentPid = parentPid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pcpu = pcpu.asInstanceOf[js.Any], pcpus = pcpus.asInstanceOf[js.Any], pcpuu = pcpuu.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pmem = pmem.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessesProcessData]
  }
  @scala.inline
  implicit class ProcessesProcessDataOps[Self <: ProcessesProcessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMem_rss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem_rss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMem_vsz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem_vsz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentPid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcpu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcpuu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcpuu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPmem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

