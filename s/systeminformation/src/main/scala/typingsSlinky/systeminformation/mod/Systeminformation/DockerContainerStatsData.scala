package typingsSlinky.systeminformation.mod.Systeminformation

import typingsSlinky.systeminformation.anon.R
import typingsSlinky.systeminformation.anon.Rx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockerContainerStatsData extends js.Object {
  var blockIO: R = js.native
  var cpu_percent: Double = js.native
  var cpu_stats: js.Any = js.native
  var id: String = js.native
  var mem_limit: Double = js.native
  var mem_percent: Double = js.native
  var mem_usage: Double = js.native
  var memory_stats: js.Any = js.native
  var netIO: Rx = js.native
  var networks: js.Any = js.native
  var precpu_stats: js.Any = js.native
  var restartCount: Double = js.native
}

object DockerContainerStatsData {
  @scala.inline
  def apply(
    blockIO: R,
    cpu_percent: Double,
    cpu_stats: js.Any,
    id: String,
    mem_limit: Double,
    mem_percent: Double,
    mem_usage: Double,
    memory_stats: js.Any,
    netIO: Rx,
    networks: js.Any,
    precpu_stats: js.Any,
    restartCount: Double
  ): DockerContainerStatsData = {
    val __obj = js.Dynamic.literal(blockIO = blockIO.asInstanceOf[js.Any], cpu_percent = cpu_percent.asInstanceOf[js.Any], cpu_stats = cpu_stats.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mem_limit = mem_limit.asInstanceOf[js.Any], mem_percent = mem_percent.asInstanceOf[js.Any], mem_usage = mem_usage.asInstanceOf[js.Any], memory_stats = memory_stats.asInstanceOf[js.Any], netIO = netIO.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], precpu_stats = precpu_stats.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerContainerStatsData]
  }
  @scala.inline
  implicit class DockerContainerStatsDataOps[Self <: DockerContainerStatsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIO(value: R): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu_stats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMem_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMem_percent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem_percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMem_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mem_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory_stats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetIO(value: Rx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecpu_stats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precpu_stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestartCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

