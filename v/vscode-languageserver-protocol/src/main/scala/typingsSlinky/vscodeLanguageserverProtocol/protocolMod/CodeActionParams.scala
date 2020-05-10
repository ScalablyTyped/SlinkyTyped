package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionParams extends js.Object {
  /**
    * Context carrying additional information.
    */
  var context: CodeActionContext = js.native
  /**
    * The range for which the command was invoked.
    */
  var range: Range = js.native
  /**
    * The document in which the command was invoked.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object CodeActionParams {
  @scala.inline
  def apply(context: CodeActionContext, range: Range, textDocument: TextDocumentIdentifier): CodeActionParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionParams]
  }
  @scala.inline
  implicit class CodeActionParamsOps[Self <: CodeActionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: CodeActionContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
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

