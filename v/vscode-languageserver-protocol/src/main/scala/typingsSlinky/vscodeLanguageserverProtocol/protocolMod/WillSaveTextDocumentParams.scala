package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WillSaveTextDocumentParams extends js.Object {
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentSaveReason */ js.Any = js.native
  /**
    * The document that will be saved.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object WillSaveTextDocumentParams {
  @scala.inline
  def apply(
    reason: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentSaveReason */ js.Any,
    textDocument: TextDocumentIdentifier
  ): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
  @scala.inline
  implicit class WillSaveTextDocumentParamsOps[Self <: WillSaveTextDocumentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentSaveReason */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDocument(value: TextDocumentIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

