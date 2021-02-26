package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods to manage one or more InkRecognizer objects used for handwriting recognition. */
@js.native
trait InkRecognizerContainer extends StObject {
  
  /**
    * Gets the collection of installed handwriting recognizers.
    * @return The installed handwriting recognizers as a collection of InkRecognizer objects.
    */
  def getRecognizers(): IVectorView[InkRecognizer] = js.native
  
  /**
    * Performs handwriting recognition on one or more InkStroke objects.
    * @param strokeCollection The set of strokes on which recognition is performed.
    * @param recognitionTarget One of the values from the InkRecognitionTarget enumeration.
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Sets the default InkRecognizer used for handwriting recognition.
    * @param recognizer The InkRecognizer .
    */
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit = js.native
}
object InkRecognizerContainer {
  
  @scala.inline
  def apply(
    getRecognizers: () => IVectorView[InkRecognizer],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IPromiseWithIAsyncOperation[IVectorView[_]],
    setDefaultRecognizer: InkRecognizer => Unit
  ): InkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = js.Any.fromFunction0(getRecognizers), recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1(setDefaultRecognizer))
    __obj.asInstanceOf[InkRecognizerContainer]
  }
  
  @scala.inline
  implicit class InkRecognizerContainerMutableBuilder[Self <: InkRecognizerContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRecognizers(value: () => IVectorView[InkRecognizer]): Self = StObject.set(x, "getRecognizers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecognizeAsync(value: (InkStrokeContainer, InkRecognitionTarget) => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = StObject.set(x, "recognizeAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDefaultRecognizer(value: InkRecognizer => Unit): Self = StObject.set(x, "setDefaultRecognizer", js.Any.fromFunction1(value))
  }
}
