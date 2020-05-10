package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeTextDocumentParams extends js.Object {
  /**
    * The actual content changes. The content changes describe single state changes
    * to the document. So if there are two content changes c1 and c2 for a document
    * in state S then c1 move the document to S' and c2 to S''.
    */
  var contentChanges: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentContentChangeEvent */ _
  ] = js.native
  /**
    * The document that did change. The version number points
    * to the version after all provided content changes have
    * been applied.
    */
  var textDocument: VersionedTextDocumentIdentifier = js.native
}

object DidChangeTextDocumentParams {
  @scala.inline
  def apply(
    contentChanges: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentContentChangeEvent */ _
    ],
    textDocument: VersionedTextDocumentIdentifier
  ): DidChangeTextDocumentParams = {
    val __obj = js.Dynamic.literal(contentChanges = contentChanges.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeTextDocumentParams]
  }
  @scala.inline
  implicit class DidChangeTextDocumentParamsOps[Self <: DidChangeTextDocumentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentChanges(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentContentChangeEvent */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDocument(value: VersionedTextDocumentIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

