package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods to manage InkStroke handwriting recognition data. */
@js.native
trait InkRecognitionResult extends StObject {
  
  /** Gets the bounding rectangle of the InkStroke data used for handwriting recognition. */
  var boundingRect: Rect = js.native
  
  /**
    * Retrieves all ink strokes used for handwriting recognition.
    * @return The ink strokes used for handwriting recognition as a collection of InkStroke objects.
    */
  def getStrokes(): IVectorView[InkStroke] = js.native
  
  /**
    * Retrieves the collection of strings identified as potential matches for each word returned by handwriting recognition.
    * @return The recognition matches as a collection of String objects. The most likely candidate is topmost in the collection.
    */
  def getTextCandidates(): IVectorView[String] = js.native
}
object InkRecognitionResult {
  
  @scala.inline
  def apply(
    boundingRect: Rect,
    getStrokes: () => IVectorView[InkStroke],
    getTextCandidates: () => IVectorView[String]
  ): InkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], getStrokes = js.Any.fromFunction0(getStrokes), getTextCandidates = js.Any.fromFunction0(getTextCandidates))
    __obj.asInstanceOf[InkRecognitionResult]
  }
  
  @scala.inline
  implicit class InkRecognitionResultMutableBuilder[Self <: InkRecognitionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStrokes(value: () => IVectorView[InkStroke]): Self = StObject.set(x, "getStrokes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextCandidates(value: () => IVectorView[String]): Self = StObject.set(x, "getTextCandidates", js.Any.fromFunction0(value))
  }
}
