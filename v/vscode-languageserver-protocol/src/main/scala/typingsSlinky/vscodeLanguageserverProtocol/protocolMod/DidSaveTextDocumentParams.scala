package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidSaveTextDocumentParams extends js.Object {
  /**
    * Optional the content when saved. Depends on the includeText value
    * when the save notification was requested.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The document that was closed.
    */
  var textDocument: VersionedTextDocumentIdentifier = js.native
}

object DidSaveTextDocumentParams {
  @scala.inline
  def apply(textDocument: VersionedTextDocumentIdentifier): DidSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidSaveTextDocumentParams]
  }
  @scala.inline
  implicit class DidSaveTextDocumentParamsOps[Self <: DidSaveTextDocumentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextDocument(value: VersionedTextDocumentIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

