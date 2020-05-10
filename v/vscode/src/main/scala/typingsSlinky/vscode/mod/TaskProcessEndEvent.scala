package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProcessEndEvent extends js.Object {
  /**
  		 * The task execution for which the process got started.
  		 */
  val execution: TaskExecution = js.native
  /**
  		 * The process's exit code.
  		 */
  val exitCode: Double = js.native
}

object TaskProcessEndEvent {
  @scala.inline
  def apply(execution: TaskExecution, exitCode: Double): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
  @scala.inline
  implicit class TaskProcessEndEventOps[Self <: TaskProcessEndEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution(value: TaskExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

