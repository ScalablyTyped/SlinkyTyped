package typingsSlinky.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
  */
@js.native
trait AutoCompleteCommand extends js.Object {
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The Identifier
    */
  var id: String = js.native
  /**
    * Label to display at the bottom of the auto complete view
    */
  var label: String = js.native
  /**
    * Action to perform when user clicks on label
    */
  def action(): Unit = js.native
}

object AutoCompleteCommand {
  @scala.inline
  def apply(action: () => Unit, id: String, label: String): AutoCompleteCommand = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteCommand]
  }
  @scala.inline
  implicit class AutoCompleteCommandOps[Self <: AutoCompleteCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
  }
  
}

