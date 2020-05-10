package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapSpan extends js.Object {
  /** Column number in the .js file. */
  var emittedColumn: Double = js.native
  /** Line number in the .js file. */
  var emittedLine: Double = js.native
  /** Optional name (index into names array) associated with this span. */
  var nameIndex: js.UndefOr[Double] = js.native
  /** Column number in the .ts file. */
  var sourceColumn: Double = js.native
  /** .ts file (index into sources array) associated with this span */
  var sourceIndex: Double = js.native
  /** Line number in the .ts file. */
  var sourceLine: Double = js.native
}

object SourceMapSpan {
  @scala.inline
  def apply(
    emittedColumn: Double,
    emittedLine: Double,
    sourceColumn: Double,
    sourceIndex: Double,
    sourceLine: Double
  ): SourceMapSpan = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSpan]
  }
  @scala.inline
  implicit class SourceMapSpanOps[Self <: SourceMapSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmittedColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmittedLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameIndex")(js.undefined)
        ret
    }
  }
  
}

