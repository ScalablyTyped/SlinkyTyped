package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextLine extends js.Object {
  def end(): Double = js.native
  def endIncludingLineBreak(): Double = js.native
  def extent(): TextSpan = js.native
  def extentIncludingLineBreak(): TextSpan = js.native
  def lineNumber(): Double = js.native
  def start(): Double = js.native
}

object ITextLine {
  @scala.inline
  def apply(
    end: () => Double,
    endIncludingLineBreak: () => Double,
    extent: () => TextSpan,
    extentIncludingLineBreak: () => TextSpan,
    lineNumber: () => Double,
    start: () => Double
  ): ITextLine = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), endIncludingLineBreak = js.Any.fromFunction0(endIncludingLineBreak), extent = js.Any.fromFunction0(extent), extentIncludingLineBreak = js.Any.fromFunction0(extentIncludingLineBreak), lineNumber = js.Any.fromFunction0(lineNumber), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ITextLine]
  }
  @scala.inline
  implicit class ITextLineOps[Self <: ITextLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndIncludingLineBreak(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIncludingLineBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtent(value: () => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtentIncludingLineBreak(value: () => TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extentIncludingLineBreak")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

