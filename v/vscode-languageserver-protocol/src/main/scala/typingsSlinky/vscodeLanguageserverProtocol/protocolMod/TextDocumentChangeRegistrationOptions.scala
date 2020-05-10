package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentChangeRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
    * How documents are synced to the server.
    */
  var syncKind: TextDocumentSyncKind = js.native
}

object TextDocumentChangeRegistrationOptions {
  @scala.inline
  def apply(syncKind: TextDocumentSyncKind): TextDocumentChangeRegistrationOptions = {
    val __obj = js.Dynamic.literal(syncKind = syncKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeRegistrationOptions]
  }
  @scala.inline
  implicit class TextDocumentChangeRegistrationOptionsOps[Self <: TextDocumentChangeRegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyncKind(value: TextDocumentSyncKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncKind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

