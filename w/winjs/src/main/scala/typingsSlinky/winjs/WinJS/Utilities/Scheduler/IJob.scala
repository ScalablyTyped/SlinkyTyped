package typingsSlinky.winjs.WinJS.Utilities.Scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Enumerations
//#region Interfaces
/**
  * Represents a work item that's executed by the Scheduler.
  **/
@js.native
trait IJob extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets a value that indicates whether the job has successfully completed.
    **/
  var completed: Boolean = js.native
  /**
    * Gets the unique numeric identifier assigned to the job.
    **/
  var id: Double = js.native
  /**
    * Gets or sets the name of the job.
    **/
  var name: String = js.native
  /**
    * Gets or sets the owner of the job.
    **/
  var owner: IOwnerToken = js.native
  /**
    * Gets or sets the priority of the job.
    **/
  var priority: Priority = js.native
  //#region Methods
  /**
    * Cancels the job.
    **/
  def cancel(): Unit = js.native
  /**
    * Pauses the job.
    **/
  def pause(): Unit = js.native
  /**
    * Resumes the job.
    **/
  def resume(): Unit = js.native
}

object IJob {
  @scala.inline
  def apply(
    cancel: () => Unit,
    completed: Boolean,
    id: Double,
    name: String,
    owner: IOwnerToken,
    pause: () => Unit,
    priority: Priority,
    resume: () => Unit
  ): IJob = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), completed = completed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), priority = priority.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[IJob]
  }
  @scala.inline
  implicit class IJobOps[Self <: IJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCompleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: IOwnerToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPriority(value: Priority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

