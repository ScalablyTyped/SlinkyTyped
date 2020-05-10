package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTaskInstance extends js.Object {
  var instanceId: String = js.native
  var oncanceled: js.Any = js.native
  var progress: Double = js.native
  var suspendedCount: Double = js.native
  var task: BackgroundTaskRegistration = js.native
  var triggerDetails: js.Any = js.native
  def getDeferral(): BackgroundTaskDeferral = js.native
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: () => BackgroundTaskDeferral,
    instanceId: String,
    oncanceled: js.Any,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), instanceId = instanceId.asInstanceOf[js.Any], oncanceled = oncanceled.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskInstance]
  }
  @scala.inline
  implicit class IBackgroundTaskInstanceOps[Self <: IBackgroundTaskInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeferral(value: () => BackgroundTaskDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncanceled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspendedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: BackgroundTaskRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

