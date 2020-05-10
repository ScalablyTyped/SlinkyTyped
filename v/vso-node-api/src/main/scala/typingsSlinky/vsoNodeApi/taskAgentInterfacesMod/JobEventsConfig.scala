package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobEventsConfig extends js.Object {
  var jobAssigned: JobEventConfig = js.native
  var jobCompleted: JobEventConfig = js.native
  var jobStarted: JobEventConfig = js.native
}

object JobEventsConfig {
  @scala.inline
  def apply(jobAssigned: JobEventConfig, jobCompleted: JobEventConfig, jobStarted: JobEventConfig): JobEventsConfig = {
    val __obj = js.Dynamic.literal(jobAssigned = jobAssigned.asInstanceOf[js.Any], jobCompleted = jobCompleted.asInstanceOf[js.Any], jobStarted = jobStarted.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEventsConfig]
  }
  @scala.inline
  implicit class JobEventsConfigOps[Self <: JobEventsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobAssigned(value: JobEventConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobAssigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobCompleted(value: JobEventConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobStarted(value: JobEventConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobStarted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

