package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeAction extends js.Object {
  /** Text changes to apply to each file as part of the code action */
  var changes: js.Array[FileTextChanges] = js.native
  /**
    * If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
    * This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
    */
  var commands: js.UndefOr[js.Array[CodeActionCommand]] = js.native
  /** Description of the code action to display in the UI of the editor */
  var description: java.lang.String = js.native
}

object CodeAction {
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], description: java.lang.String): CodeAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
  @scala.inline
  implicit class CodeActionOps[Self <: CodeAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[FileTextChanges]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: js.Array[CodeActionCommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(js.undefined)
        ret
    }
  }
  
}

