package typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonColorProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[AnonColorProvider] = js.native
}

object ColorClientCapabilities {
  @scala.inline
  def apply(): ColorClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorClientCapabilities]
  }
  @scala.inline
  implicit class ColorClientCapabilitiesOps[Self <: ColorClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDocument(value: AnonColorProvider): Self = {
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

