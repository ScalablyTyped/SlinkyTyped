package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentRegistrationOptions extends js.Object {
  /**
    * A document selector to identify the scope of the registration. If set to null
    * the document selector provided on the client side will be used.
    */
  var documentSelector: DocumentSelector | Null = js.native
}

object TextDocumentRegistrationOptions {
  @scala.inline
  def apply(): TextDocumentRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentRegistrationOptions]
  }
  @scala.inline
  implicit class TextDocumentRegistrationOptionsOps[Self <: TextDocumentRegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentSelector(value: DocumentSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentSelectorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSelector")(null)
        ret
    }
  }
  
}

