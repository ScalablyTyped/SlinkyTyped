package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationResult extends js.Object {
  var entries: js.Array[ClassificationInfo] = js.native
  var finalLexState: EndOfLineState = js.native
}

object ClassificationResult {
  @scala.inline
  def apply(entries: js.Array[ClassificationInfo], finalLexState: EndOfLineState): ClassificationResult = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], finalLexState = finalLexState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationResult]
  }
  @scala.inline
  implicit class ClassificationResultOps[Self <: ClassificationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[ClassificationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalLexState(value: EndOfLineState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalLexState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

