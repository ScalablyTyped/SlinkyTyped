package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkRecognizerContainer extends StObject {
  
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
  implicit class IInkRecognizerContainerMutableBuilder[Self <: IInkRecognizerContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRecognizers(value: () => IVectorView[InkRecognizer]): Self = StObject.set(x, "getRecognizers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecognizeAsync(
      value: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]]
    ): Self = StObject.set(x, "recognizeAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDefaultRecognizer(value: InkRecognizer => Unit): Self = StObject.set(x, "setDefaultRecognizer", js.Any.fromFunction1(value))
  }
}
