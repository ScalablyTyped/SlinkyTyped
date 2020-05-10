package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkRecognizerContainer extends js.Object {
  def getRecognizers(): IVectorView[InkRecognizer] = js.native
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]] = js.native
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit = js.native
}

object IInkRecognizerContainer {
  @scala.inline
  def apply(
    getRecognizers: () => IVectorView[InkRecognizer],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]],
    setDefaultRecognizer: InkRecognizer => Unit
  ): IInkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = js.Any.fromFunction0(getRecognizers), recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1(setDefaultRecognizer))
    __obj.asInstanceOf[IInkRecognizerContainer]
  }
  @scala.inline
  implicit class IInkRecognizerContainerOps[Self <: IInkRecognizerContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRecognizers(value: () => IVectorView[InkRecognizer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecognizers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecognizeAsync(
      value: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizeAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetDefaultRecognizer(value: InkRecognizer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultRecognizer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

