package typingsSlinky.vscode

import typingsSlinky.vscode.mod.Range
import typingsSlinky.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument extends js.Object {
  var document: TextDocument
  var range: Range
}

object AnonDocument {
  @scala.inline
  def apply(document: TextDocument, range: Range): AnonDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDocument]
  }
}

