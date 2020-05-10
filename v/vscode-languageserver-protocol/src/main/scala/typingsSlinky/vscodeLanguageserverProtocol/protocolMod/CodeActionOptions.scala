package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionOptions extends js.Object {
  /**
    * CodeActionKinds that this server may return.
    *
    * The list of kinds may be generic, such as `CodeActionKind.Refactor`, or the server
    * may list out every specific kind they provide.
    */
  var codeActionKinds: js.UndefOr[js.Array[CodeActionKind]] = js.native
}

object CodeActionOptions {
  @scala.inline
  def apply(): CodeActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionOptions]
  }
  @scala.inline
  implicit class CodeActionOptionsOps[Self <: CodeActionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeActionKinds(value: js.Array[CodeActionKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionKinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeActionKinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionKinds")(js.undefined)
        ret
    }
  }
  
}

