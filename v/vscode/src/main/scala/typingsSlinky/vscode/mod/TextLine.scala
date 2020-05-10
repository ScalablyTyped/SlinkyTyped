package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextLine extends js.Object {
  /**
  		 * The offset of the first character which is not a whitespace character as defined
  		 * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
  		 */
  val firstNonWhitespaceCharacterIndex: Double = js.native
  /**
  		 * Whether this line is whitespace only, shorthand
  		 * for [TextLine.firstNonWhitespaceCharacterIndex](#TextLine.firstNonWhitespaceCharacterIndex) === [TextLine.text.length](#TextLine.text).
  		 */
  val isEmptyOrWhitespace: Boolean = js.native
  /**
  		 * The zero-based line number.
  		 */
  val lineNumber: Double = js.native
  /**
  		 * The range this line covers without the line separator characters.
  		 */
  val range: Range = js.native
  /**
  		 * The range this line covers with the line separator characters.
  		 */
  val rangeIncludingLineBreak: Range = js.native
  /**
  		 * The text of this line without the line separator characters.
  		 */
  val text: String = js.native
}

object TextLine {
  @scala.inline
  def apply(
    firstNonWhitespaceCharacterIndex: Double,
    isEmptyOrWhitespace: Boolean,
    lineNumber: Double,
    range: Range,
    rangeIncludingLineBreak: Range,
    text: String
  ): TextLine = {
    val __obj = js.Dynamic.literal(firstNonWhitespaceCharacterIndex = firstNonWhitespaceCharacterIndex.asInstanceOf[js.Any], isEmptyOrWhitespace = isEmptyOrWhitespace.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeIncludingLineBreak = rangeIncludingLineBreak.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLine]
  }
  @scala.inline
  implicit class TextLineOps[Self <: TextLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstNonWhitespaceCharacterIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstNonWhitespaceCharacterIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmptyOrWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyOrWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeIncludingLineBreak(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeIncludingLineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

