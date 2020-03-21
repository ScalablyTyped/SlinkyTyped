package typingsSlinky.tinymce.mod.dom

import org.scalajs.dom.raw.Range
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeUtils extends js.Object {
  def compareRanges(rng1: Range, rng2: Range): Boolean
  def getCaretRangeFromPoint(clientX: Double, clientY: Double, doc: Document_): Range
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
}

