package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionContext extends js.Object {
  /**
  		 * An array of diagnostics.
  		 */
  val diagnostics: js.Array[Diagnostic] = js.native
  /**
  		 * Requested kind of actions to return.
  		 *
  		 * Actions not of this kind are filtered out before being shown by the [lightbulb](https://code.visualstudio.com/docs/editor/editingevolved#_code-action).
  		 */
  val only: js.UndefOr[CodeActionKind] = js.native
}

object CodeActionContext {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic]): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  @scala.inline
  implicit class CodeActionContextOps[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagnostics(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly(value: CodeActionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

