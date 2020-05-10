package typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinitionServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var typeDefinitionProvider: js.UndefOr[Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)] = js.native
}

object TypeDefinitionServerCapabilities {
  @scala.inline
  def apply(): TypeDefinitionServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinitionServerCapabilities]
  }
  @scala.inline
  implicit class TypeDefinitionServerCapabilitiesOps[Self <: TypeDefinitionServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeDefinitionProvider(value: Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefinitionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeDefinitionProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeDefinitionProvider")(js.undefined)
        ret
    }
  }
  
}

