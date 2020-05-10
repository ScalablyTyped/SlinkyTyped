package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextSnapshotLine extends js.Object {
  def end(): SnapshotPoint = js.native
  def endIncludingLineBreak(): SnapshotPoint = js.native
  def endIncludingLineBreakPosition(): Double = js.native
  def endPosition(): Double = js.native
  def getText(): String = js.native
  def length(): Double = js.native
  def lineNumber(): Double = js.native
  def snapshot(): ITextSnapshot = js.native
  def start(): SnapshotPoint = js.native
  def startPosition(): Double = js.native
}

object ITextSnapshotLine {
  @scala.inline
  def apply(
    end: () => SnapshotPoint,
    endIncludingLineBreak: () => SnapshotPoint,
    endIncludingLineBreakPosition: () => Double,
    endPosition: () => Double,
    getText: () => String,
    length: () => Double,
    lineNumber: () => Double,
    snapshot: () => ITextSnapshot,
    start: () => SnapshotPoint,
    startPosition: () => Double
  ): ITextSnapshotLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), endIncludingLineBreakPosition = js.Any.fromFunction0(endIncludingLineBreakPosition), endPosition = js.Any.fromFunction0(endPosition), getText = js.Any.fromFunction0(getText), length = js.Any.fromFunction0(length), lineNumber = js.Any.fromFunction0(lineNumber), snapshot = js.Any.fromFunction0(snapshot), start = js.Any.fromFunction0(start), startPosition = js.Any.fromFunction0(startPosition))
    __obj.asInstanceOf[ITextSnapshotLine]
  }
  @scala.inline
  implicit class ITextSnapshotLineOps[Self <: ITextSnapshotLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => SnapshotPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndIncludingLineBreak(value: () => SnapshotPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIncludingLineBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndIncludingLineBreakPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIncludingLineBreakPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSnapshot(value: () => ITextSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => SnapshotPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartPosition(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPosition")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

