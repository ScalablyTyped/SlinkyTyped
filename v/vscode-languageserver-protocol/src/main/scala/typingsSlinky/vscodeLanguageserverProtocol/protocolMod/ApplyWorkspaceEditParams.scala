package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyWorkspaceEditParams extends js.Object {
  /**
    * The edits to apply.
    */
  var edit: WorkspaceEdit = js.native
  /**
    * An optional label of the workspace edit. This label is
    * presented in the user interface for example on an undo
    * stack to undo the workspace edit.
    */
  var label: js.UndefOr[String] = js.native
}

object ApplyWorkspaceEditParams {
  @scala.inline
  def apply(edit: WorkspaceEdit): ApplyWorkspaceEditParams = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditParams]
  }
  @scala.inline
  implicit class ApplyWorkspaceEditParamsOps[Self <: ApplyWorkspaceEditParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdit(value: WorkspaceEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

