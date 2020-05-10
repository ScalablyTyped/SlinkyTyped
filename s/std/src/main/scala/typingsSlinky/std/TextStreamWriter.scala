package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStreamWriter extends TextStreamBase {
  /**
    * Sends a string to an output stream.
    */
  def Write(s: java.lang.String): Unit = js.native
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  def WriteBlankLines(intLines: Double): Unit = js.native
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  def WriteLine(s: java.lang.String): Unit = js.native
}

object TextStreamWriter {
  @scala.inline
  def apply(
    Close: () => Unit,
    Column: Double,
    Line: Double,
    Write: java.lang.String => Unit,
    WriteBlankLines: Double => Unit,
    WriteLine: java.lang.String => Unit
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Write = js.Any.fromFunction1(Write), WriteBlankLines = js.Any.fromFunction1(WriteBlankLines), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[TextStreamWriter]
  }
  @scala.inline
  implicit class TextStreamWriterOps[Self <: TextStreamWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrite(value: java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteBlankLines(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteBlankLines")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteLine(value: java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteLine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

