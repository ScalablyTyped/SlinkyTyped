package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterAction extends js.Object {
  /**
  		 * Describes text to be appended after the new line and after the indentation.
  		 */
  var appendText: js.UndefOr[String] = js.native
  /**
  		 * Describe what to do with the indentation.
  		 */
  var indentAction: IndentAction = js.native
  /**
  		 * Describes the number of characters to remove from the new line's indentation.
  		 */
  var removeText: js.UndefOr[Double] = js.native
}

object EnterAction {
  @scala.inline
  def apply(indentAction: IndentAction): EnterAction = {
    val __obj = js.Dynamic.literal(indentAction = indentAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterAction]
  }
  @scala.inline
  implicit class EnterActionOps[Self <: EnterAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentAction(value: IndentAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeText")(js.undefined)
        ret
    }
  }
  
}

