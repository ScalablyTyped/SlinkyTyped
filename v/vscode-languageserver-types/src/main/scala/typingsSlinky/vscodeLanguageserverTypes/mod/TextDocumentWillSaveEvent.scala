package typingsSlinky.vscodeLanguageserverTypes.mod

import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import typingsSlinky.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentWillSaveEvent extends js.Object {
  /**
    * The document that will be saved
    */
  var document: TextDocument = js.native
  /**
    * The reason why save was triggered.
    */
  var reason: `1` | `2` | `3` = js.native
}

object TextDocumentWillSaveEvent {
  @scala.inline
  def apply(document: TextDocument, reason: `1` | `2` | `3`): TextDocumentWillSaveEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentWillSaveEvent]
  }
  @scala.inline
  implicit class TextDocumentWillSaveEventOps[Self <: TextDocumentWillSaveEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: TextDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: `1` | `2` | `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

