package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextWriter extends js.Object {
  var contents: js.Any = js.native
  var name: js.Any = js.native
  var onNewLine: Boolean = js.native
  var outputFileType: js.Any = js.native
  var writeByteOrderMark: js.Any = js.native
  def Close(): Unit = js.native
  def Write(s: String): Unit = js.native
  def WriteLine(s: String): Unit = js.native
  def getOutputFile(): OutputFile = js.native
}

object TextWriter {
  @scala.inline
  def apply(
    Close: () => Unit,
    Write: String => Unit,
    WriteLine: String => Unit,
    contents: js.Any,
    getOutputFile: () => OutputFile,
    name: js.Any,
    onNewLine: Boolean,
    outputFileType: js.Any,
    writeByteOrderMark: js.Any
  ): TextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine), contents = contents.asInstanceOf[js.Any], getOutputFile = js.Any.fromFunction0(getOutputFile), name = name.asInstanceOf[js.Any], onNewLine = onNewLine.asInstanceOf[js.Any], outputFileType = outputFileType.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWriter]
  }
  @scala.inline
  implicit class TextWriterOps[Self <: TextWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrite(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteLine(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOutputFile(value: () => OutputFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutputFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnNewLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputFileType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteByteOrderMark(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeByteOrderMark")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

