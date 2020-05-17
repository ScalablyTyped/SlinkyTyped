package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSnapshot extends ITextSnapshot {
  var lines: js.Any = js.native
  var snapshot: js.Any = js.native
  /* private */ def getLineFromLineNumberWorker(lineNumber: js.Any): js.Any = js.native
}

object TextSnapshot {
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromLineNumberWorker: js.Any => js.Any,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String,
    lines: js.Any,
    snapshot: js.Any
  ): TextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromLineNumberWorker = js.Any.fromFunction1(getLineFromLineNumberWorker), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText), lines = lines.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSnapshot]
  }
  @scala.inline
  implicit class TextSnapshotOps[Self <: TextSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLineFromLineNumberWorker(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineFromLineNumberWorker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

