package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSymbolKind extends js.Object {
  /**
    * Symbol request supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
    */
  var symbolKind: js.UndefOr[AnonValueSet] = js.undefined
}

object AnonSymbolKind {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined, symbolKind: AnonValueSet = null): AnonSymbolKind = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (symbolKind != null) __obj.updateDynamic("symbolKind")(symbolKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSymbolKind]
  }
}

