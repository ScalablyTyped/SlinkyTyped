package typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.Declaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[Declaration] = js.native
}

object DeclarationClientCapabilities {
  @scala.inline
  def apply(): DeclarationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationClientCapabilities]
  }
  @scala.inline
  implicit class DeclarationClientCapabilitiesOps[Self <: DeclarationClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDocument(value: Declaration): Self = {
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

