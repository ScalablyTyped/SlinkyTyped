package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSet extends js.Object {
  /**
    * The symbol kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    *
    * If this property is not present the client only supports
    * the symbol kinds from `File` to `Array` as defined in
    * the initial version of the protocol.
    */
  var valueSet: js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind]] = js.undefined
}

object ValueSet {
  @scala.inline
  def apply(valueSet: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind] = null): ValueSet = {
    val __obj = js.Dynamic.literal()
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSet]
  }
}

