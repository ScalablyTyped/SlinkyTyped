package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTasksUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: Double = js.native
  var job: ReleaseTask = js.native
  var releaseDeployPhaseId: Double = js.native
  var releaseStepId: Double = js.native
  var tasks: js.Array[ReleaseTask] = js.native
}

object ReleaseTasksUpdatedEvent {
  @scala.inline
  def apply(
    environmentId: Double,
    job: ReleaseTask,
    projectId: String,
    releaseDeployPhaseId: Double,
    releaseId: Double,
    releaseStepId: Double,
    tasks: js.Array[ReleaseTask]
  ): ReleaseTasksUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseDeployPhaseId = releaseDeployPhaseId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], releaseStepId = releaseStepId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTasksUpdatedEvent]
  }
  @scala.inline
  implicit class ReleaseTasksUpdatedEventOps[Self <: ReleaseTasksUpdatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJob(value: ReleaseTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDeployPhaseId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDeployPhaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseStepId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseStepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[ReleaseTask]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

