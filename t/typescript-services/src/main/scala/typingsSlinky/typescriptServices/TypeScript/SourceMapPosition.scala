package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapPosition extends js.Object {
  var emittedColumn: Double = js.native
  var emittedLine: Double = js.native
  var sourceColumn: Double = js.native
  var sourceLine: Double = js.native
}

object SourceMapPosition {
  @scala.inline
  def apply(emittedColumn: Double, emittedLine: Double, sourceColumn: Double, sourceLine: Double): SourceMapPosition = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapPosition]
  }
  @scala.inline
  implicit class SourceMapPositionOps[Self <: SourceMapPosition] (val x: Self) extends AnyVal {
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
    def withSourceLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

