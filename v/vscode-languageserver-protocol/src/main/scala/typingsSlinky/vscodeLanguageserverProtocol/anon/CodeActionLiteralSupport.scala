package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionLiteralSupport extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    */
  var codeActionLiteralSupport: js.UndefOr[CodeActionKind] = js.undefined
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object CodeActionLiteralSupport {
  @scala.inline
  def apply(
    codeActionLiteralSupport: CodeActionKind = null,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): CodeActionLiteralSupport = {
    val __obj = js.Dynamic.literal()
    if (codeActionLiteralSupport != null) __obj.updateDynamic("codeActionLiteralSupport")(codeActionLiteralSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionLiteralSupport]
  }
}

