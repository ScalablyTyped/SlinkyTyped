package typingsSlinky.workerpool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerPoolStats extends js.Object {
  var activeTasks: Double = js.native
  var busyWorkers: Double = js.native
  var idleWorkers: Double = js.native
  var pendingTasks: Double = js.native
  var totalWorkers: Double = js.native
}

object WorkerPoolStats {
  @scala.inline
  def apply(
    activeTasks: Double,
    busyWorkers: Double,
    idleWorkers: Double,
    pendingTasks: Double,
    totalWorkers: Double
  ): WorkerPoolStats = {
    val __obj = js.Dynamic.literal(activeTasks = activeTasks.asInstanceOf[js.Any], busyWorkers = busyWorkers.asInstanceOf[js.Any], idleWorkers = idleWorkers.asInstanceOf[js.Any], pendingTasks = pendingTasks.asInstanceOf[js.Any], totalWorkers = totalWorkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerPoolStats]
  }
  @scala.inline
  implicit class WorkerPoolStatsOps[Self <: WorkerPoolStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTasks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusyWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("busyWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdleWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingTasks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalWorkers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalWorkers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

