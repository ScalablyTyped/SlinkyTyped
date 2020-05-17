package typingsSlinky.winrtUwp.Windows.Media.Ocr

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the results of Optical Character Recognition (OCR). */
@js.native
trait OcrResult extends js.Object {
  /** Gets the collection of OcrLine objects that represents the lines of text detected in the image by the RecognizeAsync method. */
  var lines: IVectorView[OcrLine] = js.native
  /** Gets the recognized text. */
  var text: String = js.native
  /** Gets the clockwise rotation of the recognized text, in degrees, around the center of the image. */
  var textAngle: Double = js.native
}

object OcrResult {
  @scala.inline
  def apply(lines: IVectorView[OcrLine], text: String, textAngle: Double): OcrResult = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrResult]
  }
  @scala.inline
  implicit class OcrResultOps[Self <: OcrResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLines(value: IVectorView[OcrLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAngle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

