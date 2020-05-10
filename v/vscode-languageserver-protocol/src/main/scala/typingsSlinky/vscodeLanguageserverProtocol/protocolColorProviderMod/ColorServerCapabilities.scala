package typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorServerCapabilities extends js.Object {
  /**
    * The server provides color provider support.
    */
  var colorProvider: js.UndefOr[
    Boolean | ColorProviderOptions | (ColorProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions)
  ] = js.native
}

object ColorServerCapabilities {
  @scala.inline
  def apply(): ColorServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorServerCapabilities]
  }
  @scala.inline
  implicit class ColorServerCapabilitiesOps[Self <: ColorServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorProvider(
      value: Boolean | ColorProviderOptions | (ColorProviderOptions with TextDocumentRegistrationOptions with StaticRegistrationOptions)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorProvider")(js.undefined)
        ret
    }
  }
  
}

