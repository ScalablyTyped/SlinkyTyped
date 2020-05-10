package typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var declarationProvider: js.UndefOr[Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)] = js.native
}

object DeclarationServerCapabilities {
  @scala.inline
  def apply(): DeclarationServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationServerCapabilities]
  }
  @scala.inline
  implicit class DeclarationServerCapabilitiesOps[Self <: DeclarationServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclarationProvider(value: Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclarationProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declarationProvider")(js.undefined)
        ret
    }
  }
  
}

