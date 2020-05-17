package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionLiteralSupport extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    */
  var codeActionLiteralSupport: js.UndefOr[CodeActionKind] = js.native
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object CodeActionLiteralSupport {
  @scala.inline
  def apply(): CodeActionLiteralSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionLiteralSupport]
  }
  @scala.inline
  implicit class CodeActionLiteralSupportOps[Self <: CodeActionLiteralSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeActionLiteralSupport(value: CodeActionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionLiteralSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeActionLiteralSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionLiteralSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
        ret
    }
  }
  
}

