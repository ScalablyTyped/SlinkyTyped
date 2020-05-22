package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalDocumentSymbolSupport extends js.Object {
  /**
    * Whether document symbol supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client support hierarchical document symbols.
    */
  var hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Specific capabilities for the `SymbolKind`.
    */
  var symbolKind: js.UndefOr[ValueSet] = js.undefined
}

object HierarchicalDocumentSymbolSupport {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.undefined,
    symbolKind: ValueSet = null
  ): HierarchicalDocumentSymbolSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hierarchicalDocumentSymbolSupport)) __obj.updateDynamic("hierarchicalDocumentSymbolSupport")(hierarchicalDocumentSymbolSupport.get.asInstanceOf[js.Any])
    if (symbolKind != null) __obj.updateDynamic("symbolKind")(symbolKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchicalDocumentSymbolSupport]
  }
}

