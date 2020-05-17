package typingsSlinky.winrtUwp.Windows.Media.Ocr

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Globalization.Language
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides optical character recognition (OCR) functionality. */
@js.native
trait OcrEngine extends js.Object {
  /** Gets the language being used for text recognition. */
  var recognizerLanguage: Language = js.native
  /**
    * Scans the specified image for text in the language specified by the RecognizerLanguage property.
    * @param bitmap Represents an uncompressed bitmap.
    * @return The result of the OCR that was initiated by the OcrEngine object.
    */
  def recognizeAsync(bitmap: SoftwareBitmap): IPromiseWithIAsyncOperation[OcrResult] = js.native
}

object OcrEngine {
  @scala.inline
  def apply(
    recognizeAsync: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult],
    recognizerLanguage: Language
  ): OcrEngine = {
    val __obj = js.Dynamic.literal(recognizeAsync = js.Any.fromFunction1(recognizeAsync), recognizerLanguage = recognizerLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[OcrEngine]
  }
  @scala.inline
  implicit class OcrEngineOps[Self <: OcrEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecognizeAsync(value: SoftwareBitmap => IPromiseWithIAsyncOperation[OcrResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecognizerLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizerLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

