package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameParams extends js.Object {
  /**
    * The new name of the symbol. If the given name is not valid the
    * request must return a [ResponseError](#ResponseError) with an
    * appropriate message set.
    */
  var newName: String = js.native
  /**
    * The position at which this request was sent.
    */
  var position: Position = js.native
  /**
    * The document to rename.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object RenameParams {
  @scala.inline
  def apply(newName: String, position: Position, textDocument: TextDocumentIdentifier): RenameParams = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameParams]
  }
  @scala.inline
  implicit class RenameParamsOps[Self <: RenameParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
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

