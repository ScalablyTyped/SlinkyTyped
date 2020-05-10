package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskPresentationOptions extends js.Object {
  /**
  		 * Controls whether the terminal is cleared before executing the task.
  		 */
  var clear: js.UndefOr[Boolean] = js.native
  /**
  		 * Controls whether the command associated with the task is echoed
  		 * in the user interface.
  		 */
  var echo: js.UndefOr[Boolean] = js.native
  /**
  		 * Controls whether the panel showing the task output is taking focus.
  		 */
  var focus: js.UndefOr[Boolean] = js.native
  /**
  		 * Controls if the task panel is used for this task only (dedicated),
  		 * shared between tasks (shared) or if a new panel is created on
  		 * every task execution (new). Defaults to `TaskInstanceKind.Shared`
  		 */
  var panel: js.UndefOr[TaskPanelKind] = js.native
  /**
  		 * Controls whether the task output is reveal in the user interface.
  		 * Defaults to `RevealKind.Always`.
  		 */
  var reveal: js.UndefOr[TaskRevealKind] = js.native
  /**
  		 * Controls whether to show the "Terminal will be reused by tasks, press any key to close it" message.
  		 */
  var showReuseMessage: js.UndefOr[Boolean] = js.native
}

object TaskPresentationOptions {
  @scala.inline
  def apply(): TaskPresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskPresentationOptions]
  }
  @scala.inline
  implicit class TaskPresentationOptionsOps[Self <: TaskPresentationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withEcho(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echo")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: TaskPanelKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withReveal(value: TaskRevealKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReveal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reveal")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReuseMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReuseMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReuseMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReuseMessage")(js.undefined)
        ret
    }
  }
  
}

