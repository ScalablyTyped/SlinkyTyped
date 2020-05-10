package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskExecution extends js.Object {
  /**
  		 * The task that got started.
  		 */
  var task: Task = js.native
  /**
  		 * Terminates the task execution.
  		 */
  def terminate(): Unit = js.native
}

object TaskExecution {
  @scala.inline
  def apply(task: Task, terminate: () => Unit): TaskExecution = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[TaskExecution]
  }
  @scala.inline
  implicit class TaskExecutionOps[Self <: TaskExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTask(value: Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

