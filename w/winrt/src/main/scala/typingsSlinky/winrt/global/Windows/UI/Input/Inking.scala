package typingsSlinky.winrt.global.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.Foundation.Size
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrt.Windows.UI.Color
import typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget
import typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking")
@js.native
object Inking extends js.Object {
  @js.native
  class InkDrawingAttributes ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkDrawingAttributes {
    /* CompleteClass */
    override var color: Color = js.native
    /* CompleteClass */
    override var fitToCurve: Boolean = js.native
    /* CompleteClass */
    override var ignorePressure: Boolean = js.native
    /* CompleteClass */
    override var penTip: PenTipShape = js.native
    /* CompleteClass */
    override var size: Size = js.native
  }
  
  @js.native
  class InkManager ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkManager {
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /* CompleteClass */
    override def addStroke(stroke: typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke): Unit = js.native
    /* CompleteClass */
    override def canPasteFromClipboard(): Boolean = js.native
    /* CompleteClass */
    override def copySelectedToClipboard(): Unit = js.native
    /* CompleteClass */
    override def deleteSelected(): Rect = js.native
    /* CompleteClass */
    override def getRecognitionResults(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
    /* CompleteClass */
    override def getRecognizers(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer] = js.native
    /* CompleteClass */
    override def getStrokes(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
    /* CompleteClass */
    override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
    /* CompleteClass */
    override def moveSelected(translation: Point): Rect = js.native
    /* CompleteClass */
    override def pasteFromClipboard(position: Point): Rect = js.native
    /* CompleteClass */
    override def recognizeAsync(
      strokeCollection: typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeContainer,
      recognitionTarget: InkRecognitionTarget
    ): IAsyncOperation[IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult]] = js.native
    /* CompleteClass */
    override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    /* CompleteClass */
    override def selectWithLine(from: Point, to: Point): Rect = js.native
    /* CompleteClass */
    override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
    /* CompleteClass */
    override def setDefaultRecognizer(recognizer: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
    /* CompleteClass */
    override def updateRecognitionResults(recognitionResults: IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult]): Unit = js.native
  }
  
  @js.native
  class InkRecognitionResult ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult {
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /* CompleteClass */
    override def getStrokes(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
    /* CompleteClass */
    override def getTextCandidates(): IVectorView[String] = js.native
  }
  
  @js.native
  class InkRecognizer ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer {
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class InkRecognizerContainer ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizerContainer {
    /* CompleteClass */
    override def getRecognizers(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer] = js.native
    /* CompleteClass */
    override def recognizeAsync(
      strokeCollection: typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeContainer,
      recognitionTarget: InkRecognitionTarget
    ): IAsyncOperation[IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult]] = js.native
    /* CompleteClass */
    override def setDefaultRecognizer(recognizer: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
  }
  
  @js.native
  class InkStroke ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke {
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /* CompleteClass */
    override var drawingAttributes: typingsSlinky.winrt.Windows.UI.Input.Inking.InkDrawingAttributes = js.native
    /* CompleteClass */
    override var recognized: Boolean = js.native
    /* CompleteClass */
    override var selected: Boolean = js.native
    /* CompleteClass */
    override def getRenderingSegments(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment] = js.native
  }
  
  @js.native
  class InkStrokeBuilder ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeBuilder {
    /* CompleteClass */
    override def appendToStroke(pointerPoint: typingsSlinky.winrt.Windows.UI.Input.PointerPoint): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
    /* CompleteClass */
    override def beginStroke(pointerPoint: typingsSlinky.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
    /* CompleteClass */
    override def createStroke(points: IIterable[Point]): typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke = js.native
    /* CompleteClass */
    override def endStroke(pointerPoint: typingsSlinky.winrt.Windows.UI.Input.PointerPoint): typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke = js.native
    /* CompleteClass */
    override def setDefaultDrawingAttributes(drawingAttributes: typingsSlinky.winrt.Windows.UI.Input.Inking.InkDrawingAttributes): Unit = js.native
  }
  
  @js.native
  class InkStrokeContainer ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeContainer {
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /* CompleteClass */
    override def addStroke(stroke: typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke): Unit = js.native
    /* CompleteClass */
    override def canPasteFromClipboard(): Boolean = js.native
    /* CompleteClass */
    override def copySelectedToClipboard(): Unit = js.native
    /* CompleteClass */
    override def deleteSelected(): Rect = js.native
    /* CompleteClass */
    override def getRecognitionResults(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
    /* CompleteClass */
    override def getStrokes(): IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
    /* CompleteClass */
    override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
    /* CompleteClass */
    override def moveSelected(translation: Point): Rect = js.native
    /* CompleteClass */
    override def pasteFromClipboard(position: Point): Rect = js.native
    /* CompleteClass */
    override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
    /* CompleteClass */
    override def selectWithLine(from: Point, to: Point): Rect = js.native
    /* CompleteClass */
    override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
    /* CompleteClass */
    override def updateRecognitionResults(recognitionResults: IVectorView[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult]): Unit = js.native
  }
  
  @js.native
  class InkStrokeRenderingSegment ()
    extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment {
    /* CompleteClass */
    override var bezierControlPoint1: Point = js.native
    /* CompleteClass */
    override var bezierControlPoint2: Point = js.native
    /* CompleteClass */
    override var position: Point = js.native
    /* CompleteClass */
    override var pressure: Double = js.native
    /* CompleteClass */
    override var tiltX: Double = js.native
    /* CompleteClass */
    override var tiltY: Double = js.native
    /* CompleteClass */
    override var twist: Double = js.native
  }
  
  @js.native
  object InkManipulationMode extends js.Object {
    /* 1 */ val erasing: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
    /* 0 */ val inking: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
    /* 2 */ val selecting: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode with Double] = js.native
  }
  
  @js.native
  object InkRecognitionTarget extends js.Object {
    /* 0 */ val all: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
    /* 2 */ val recent: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
    /* 1 */ val selected: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget with Double] = js.native
  }
  
  @js.native
  object PenTipShape extends js.Object {
    /* 0 */ val circle: typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
    /* 1 */ val rectangle: typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape with Double] = js.native
  }
  
}

