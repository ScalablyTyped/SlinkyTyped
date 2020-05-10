package typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImplementationServerCapabilities extends js.Object {
  /**
    * The server provides Goto Implementation support.
    */
  var implementationProvider: js.UndefOr[Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)] = js.native
}

object ImplementationServerCapabilities {
  @scala.inline
  def apply(): ImplementationServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplementationServerCapabilities]
  }
  @scala.inline
  implicit class ImplementationServerCapabilitiesOps[Self <: ImplementationServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImplementationProvider(value: Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementationProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationProvider")(js.undefined)
        ret
    }
  }
  
}

