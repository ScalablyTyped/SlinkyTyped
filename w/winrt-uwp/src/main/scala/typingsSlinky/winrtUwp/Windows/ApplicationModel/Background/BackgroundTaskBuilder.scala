package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task to be registered with the system. */
@js.native
trait BackgroundTaskBuilder extends js.Object {
  /** Indicates whether the background task will be canceled if at least one of its required conditions is no longer met. */
  var cancelOnConditionLoss: Boolean = js.native
  /** This API is not available to all Windows/Windows Phone apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isNetworkRequested: Boolean = js.native
  /** Gets or sets the name of a background task. */
  var name: String = js.native
  /** Gets or sets the class that performs the work of a background task. */
  var taskEntryPoint: String = js.native
  /**
    * Adds a condition to a background task.
    * @param condition An instance of a SystemCondition object.
    */
  def addCondition(condition: IBackgroundCondition): Unit = js.native
  /**
    * Registers a background task with the system.
    * @return An instance of a BackgroundTaskRegistration object.
    */
  def register(): BackgroundTaskRegistration = js.native
  /**
    * Sets the event trigger for a background task.
    * @param trigger An instance of an event trigger object such as a SystemTrigger , TimeTrigger , or NetworkOperatorNotificationTrigger .
    */
  def setTrigger(trigger: IBackgroundTrigger): Unit = js.native
}

object BackgroundTaskBuilder {
  @scala.inline
  def apply(
    addCondition: IBackgroundCondition => Unit,
    cancelOnConditionLoss: Boolean,
    isNetworkRequested: Boolean,
    name: String,
    register: () => BackgroundTaskRegistration,
    setTrigger: IBackgroundTrigger => Unit,
    taskEntryPoint: String
  ): BackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1(addCondition), cancelOnConditionLoss = cancelOnConditionLoss.asInstanceOf[js.Any], isNetworkRequested = isNetworkRequested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), setTrigger = js.Any.fromFunction1(setTrigger), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskBuilder]
  }
  @scala.inline
  implicit class BackgroundTaskBuilderOps[Self <: BackgroundTaskBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCondition(value: IBackgroundCondition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCondition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCancelOnConditionLoss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOnConditionLoss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNetworkRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNetworkRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegister(value: () => BackgroundTaskRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTrigger(value: IBackgroundTrigger => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrigger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTaskEntryPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskEntryPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

