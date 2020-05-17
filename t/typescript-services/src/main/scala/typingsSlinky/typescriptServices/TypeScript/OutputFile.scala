package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFile extends js.Object {
  var fileType: OutputFileType = js.native
  var name: String = js.native
  var sourceMapEntries: js.Array[SourceMapEntry] = js.native
  var text: String = js.native
  var writeByteOrderMark: Boolean = js.native
}

object OutputFile {
  @scala.inline
  def apply(
    fileType: OutputFileType,
    name: String,
    sourceMapEntries: js.Array[SourceMapEntry],
    text: String,
    writeByteOrderMark: Boolean
  ): OutputFile = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
  @scala.inline
  implicit class OutputFileOps[Self <: OutputFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileType(value: OutputFileType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapEntries(value: js.Array[SourceMapEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteByteOrderMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeByteOrderMark")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

