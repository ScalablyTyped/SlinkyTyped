package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var valueSet: js.UndefOr[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind]] = js.native
}

object ValueSet {
  @scala.inline
  def apply(): ValueSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSet]
  }
  @scala.inline
  implicit class ValueSetOps[Self <: ValueSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueSet(value: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSet")(js.undefined)
        ret
    }
  }
  
}

