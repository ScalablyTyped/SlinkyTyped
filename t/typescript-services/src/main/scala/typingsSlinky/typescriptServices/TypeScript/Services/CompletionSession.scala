package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.IdentiferNameHashTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionSession extends js.Object {
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails] = js.native
  var fileName: String = js.native
  var position: Double = js.native
}

object CompletionSession {
  @scala.inline
  def apply(entries: IdentiferNameHashTable[CachedCompletionEntryDetails], fileName: String, position: Double): CompletionSession = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionSession]
  }
  @scala.inline
  implicit class CompletionSessionOps[Self <: CompletionSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: IdentiferNameHashTable[CachedCompletionEntryDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

