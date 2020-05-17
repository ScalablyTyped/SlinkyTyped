package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapEntry extends js.Object {
  var emittedColumn: Double = js.native
  var emittedFile: String = js.native
  var emittedLine: Double = js.native
  var sourceColumn: Double = js.native
  var sourceFile: String = js.native
  var sourceLine: Double = js.native
  var sourceName: String = js.native
}

object SourceMapEntry {
  @scala.inline
  def apply(
    emittedColumn: Double,
    emittedFile: String,
    emittedLine: Double,
    sourceColumn: Double,
    sourceFile: String,
    sourceLine: Double,
    sourceName: String
  ): SourceMapEntry = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedFile = emittedFile.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapEntry]
  }
  @scala.inline
  implicit class SourceMapEntryOps[Self <: SourceMapEntry] (val x: Self) extends AnyVal {
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
    def withEmittedFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emittedFile")(value.asInstanceOf[js.Any])
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
    def withSourceFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

