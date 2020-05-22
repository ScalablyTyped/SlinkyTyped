package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensRegistrationOptions
  extends TextDocumentRegistrationOptions
     with CodeLensOptions

object CodeLensRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, resolveProvider: js.UndefOr[Boolean] = js.undefined): CodeLensRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensRegistrationOptions]
  }
}

