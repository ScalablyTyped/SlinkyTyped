package typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.Implementation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImplementationClientCapabilities extends js.Object {
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[Implementation] = js.native
}

object ImplementationClientCapabilities {
  @scala.inline
  def apply(): ImplementationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplementationClientCapabilities]
  }
  @scala.inline
  implicit class ImplementationClientCapabilitiesOps[Self <: ImplementationClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDocument(value: Implementation): Self = {
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

