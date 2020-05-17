package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalDocumentSymbolSupport extends js.Object {
  /**
    * Whether document symbol supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The client support hierarchical document symbols.
    */
  var hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.native
  /**
    * Specific capabilities for the `SymbolKind`.
    */
  var symbolKind: js.UndefOr[ValueSet] = js.native
}

object HierarchicalDocumentSymbolSupport {
  @scala.inline
  def apply(): HierarchicalDocumentSymbolSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDocumentSymbolSupport]
  }
  @scala.inline
  implicit class HierarchicalDocumentSymbolSupportOps[Self <: HierarchicalDocumentSymbolSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withHierarchicalDocumentSymbolSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalDocumentSymbolSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchicalDocumentSymbolSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchicalDocumentSymbolSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolKind(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolKind")(js.undefined)
        ret
    }
  }
  
}

