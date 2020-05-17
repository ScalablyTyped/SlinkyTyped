package typingsSlinky.winrtUwp.Windows.Media.Ocr

import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single word in a line of text recognized by the OCR engine and returned as part of the OcrLine . */
@js.native
trait OcrWord extends js.Object {
  /** Gets the position and size in pixels of the recognized word from the top left corner of image when the value of TextAngle property is 0 (zero). */
  var boundingRect: Rect = js.native
  /** Gets the text of the recognized word. */
  var text: String = js.native
}

object OcrWord {
  @scala.inline
  def apply(boundingRect: Rect, text: String): OcrWord = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrWord]
  }
  @scala.inline
  implicit class OcrWordOps[Self <: OcrWord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingRect")(value.asInstanceOf[js.Any])
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

