package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import typingsSlinky.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextSnapshot extends js.Object {
  def getLineFromLineNumber(lineNumber: Double): ITextSnapshotLine = js.native
  def getLineFromPosition(position: Double): ITextSnapshotLine = js.native
  def getLineNumberFromPosition(position: Double): Double = js.native
  def getText(span: TextSpan): String = js.native
}

object ITextSnapshot {
  @scala.inline
  def apply(
    getLineFromLineNumber: Double => ITextSnapshotLine,
    getLineFromPosition: Double => ITextSnapshotLine,
    getLineNumberFromPosition: Double => Double,
    getText: TextSpan => String
  ): ITextSnapshot = {
    val __obj = js.Dynamic.literal(getLineFromLineNumber = js.Any.fromFunction1(getLineFromLineNumber), getLineFromPosition = js.Any.fromFunction1(getLineFromPosition), getLineNumberFromPosition = js.Any.fromFunction1(getLineNumberFromPosition), getText = js.Any.fromFunction1(getText))
    __obj.asInstanceOf[ITextSnapshot]
  }
  @scala.inline
  implicit class ITextSnapshotOps[Self <: ITextSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLineFromLineNumber(value: Double => ITextSnapshotLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineFromLineNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLineFromPosition(value: Double => ITextSnapshotLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineFromPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLineNumberFromPosition(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineNumberFromPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetText(value: TextSpan => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

