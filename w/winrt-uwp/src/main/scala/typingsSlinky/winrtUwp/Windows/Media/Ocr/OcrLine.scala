package typingsSlinky.winrtUwp.Windows.Media.Ocr

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single line of text recognized by the OCR engine and returned as part of the OcrResult . */
@js.native
trait OcrLine extends js.Object {
  /** Gets the text of the recognized line. */
  var text: String = js.native
  /** Gets the collection of OcrWord objects that represents the words detected in the current line of text by the RecognizeAsync method. */
  var words: IVectorView[OcrWord] = js.native
}

object OcrLine {
  @scala.inline
  def apply(text: String, words: IVectorView[OcrWord]): OcrLine = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrLine]
  }
  @scala.inline
  implicit class OcrLineOps[Self <: OcrLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: IVectorView[OcrWord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

