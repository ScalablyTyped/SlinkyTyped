package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkManager
  extends IInkStrokeContainer
     with IInkRecognizerContainer {
  
  var mode: InkManipulationMode = js.native
  
  def processPointerDown(pointerPoint: PointerPoint): Unit = js.native
  
  def processPointerUp(pointerPoint: PointerPoint): Rect = js.native
  
  def processPointerUpdate(pointerPoint: PointerPoint): js.Any = js.native
  
  def recognizeAsync(recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]] = js.native
  
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}
