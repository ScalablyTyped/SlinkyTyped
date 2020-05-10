package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a background task instance. */
@js.native
trait IBackgroundTaskInstance extends js.Object {
  /** Gets the instance ID of the background task instance. */
  var instanceId: String = js.native
  /** Gets or sets progress status for a background task instance. */
  var progress: Double = js.native
  /** Gets the number of times resource management policy caused the background task to be suspended. */
  var suspendedCount: Double = js.native
  /** Gets access to the registered background task for this background task instance. */
  var task: BackgroundTaskRegistration = js.native
  /** Gets additional information associated with a background task instance. */
  var triggerDetails: js.Any = js.native
  /**
    * Informs the system that the background task might continue to perform work after the IBackgroundTask.Run method returns.
    * @return A background task deferral.
    */
  def getDeferral(): BackgroundTaskDeferral = js.native
  /**
    * Retrieves the number of times the background task has been suspended for using too many resources.
    * @param counter Indicates the type of resource to include in the throttle count: network, CPU, or both.
    * @return This method returns the number of times the background task has been suspended for exceeding its quota of the indicated resource type.
    */
  def getThrottleCount(counter: BackgroundTaskThrottleCounter): Double = js.native
}

object IBackgroundTaskInstance {
  @scala.inline
  def apply(
    getDeferral: () => BackgroundTaskDeferral,
    getThrottleCount: BackgroundTaskThrottleCounter => Double,
    instanceId: String,
    progress: Double,
    suspendedCount: Double,
    task: BackgroundTaskRegistration,
    triggerDetails: js.Any
  ): IBackgroundTaskInstance = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), getThrottleCount = js.Any.fromFunction1(getThrottleCount), instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], suspendedCount = suspendedCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], triggerDetails = triggerDetails.asInstanceOf[js.Any])
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
    def withGetThrottleCount(value: BackgroundTaskThrottleCounter => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThrottleCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
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

