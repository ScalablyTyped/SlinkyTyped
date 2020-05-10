package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeActionLiteralSupport extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    */
  var codeActionLiteralSupport: js.UndefOr[AnonCodeActionKind] = js.native
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object AnonCodeActionLiteralSupport {
  @scala.inline
  def apply(): AnonCodeActionLiteralSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCodeActionLiteralSupport]
  }
  @scala.inline
  implicit class AnonCodeActionLiteralSupportOps[Self <: AnonCodeActionLiteralSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeActionLiteralSupport(value: AnonCodeActionKind): Self = {
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

