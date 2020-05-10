package typingsSlinky.tinymce.mod.dom

import org.scalajs.dom.raw.Range
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeUtils extends js.Object {
  def compareRanges(rng1: Range, rng2: Range): Boolean = js.native
  def getCaretRangeFromPoint(clientX: Double, clientY: Double, doc: Document_): Range = js.native
}

object RangeUtils {
  @scala.inline
  def apply(
    compareRanges: (Range, Range) => Boolean,
    getCaretRangeFromPoint: (Double, Double, Document_) => Range
  ): RangeUtils = {
    val __obj = js.Dynamic.literal(compareRanges = js.Any.fromFunction2(compareRanges), getCaretRangeFromPoint = js.Any.fromFunction3(getCaretRangeFromPoint))
    __obj.asInstanceOf[RangeUtils]
  }
  @scala.inline
  implicit class RangeUtilsOps[Self <: RangeUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompareRanges(value: (Range, Range) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareRanges")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCaretRangeFromPoint(value: (Double, Double, Document_) => Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaretRangeFromPoint")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

