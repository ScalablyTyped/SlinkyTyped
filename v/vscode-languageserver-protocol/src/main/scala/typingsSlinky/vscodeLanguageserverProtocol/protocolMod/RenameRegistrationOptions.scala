package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameRegistrationOptions
  extends TextDocumentRegistrationOptions
     with RenameOptions

object RenameRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, prepareProvider: js.UndefOr[Boolean] = js.undefined): RenameRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}

