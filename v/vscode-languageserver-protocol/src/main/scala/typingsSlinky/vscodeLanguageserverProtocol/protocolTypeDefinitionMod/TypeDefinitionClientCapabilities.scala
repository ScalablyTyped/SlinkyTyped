package typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.TypeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinitionClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[TypeDefinition] = js.native
}

object TypeDefinitionClientCapabilities {
  @scala.inline
  def apply(): TypeDefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinitionClientCapabilities]
  }
  @scala.inline
  implicit class TypeDefinitionClientCapabilitiesOps[Self <: TypeDefinitionClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDocument(value: TypeDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(js.undefined)
        ret
    }
  }
  
}

