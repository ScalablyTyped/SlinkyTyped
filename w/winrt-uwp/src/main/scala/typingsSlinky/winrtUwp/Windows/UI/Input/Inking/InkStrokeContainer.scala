package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties and methods to store and manage the collection of InkStroke objects rendered by the InkPresenter . */
@js.native
trait InkStrokeContainer extends js.Object {
  /** Gets the bounding rectangle of the InkStroke collection managed by the InkStrokeContainer . */
  var boundingRect: Rect = js.native
  /**
    * Adds an InkStroke object to the collection managed by the InkStrokeContainer .
    * @param stroke The ink stroke to be added.
    */
  def addStroke(stroke: InkStroke): Unit = js.native
  /**
    * Adds one or more ink strokes to the collection managed by the InkStrokeContainer .
    * @param strokes The ink strokes to be added as a collection of InkStroke objects.
    */
  def addStrokes(strokes: IIterable[InkStroke]): Unit = js.native
  /**
    * Identifies whether content on the clipboard can be added to the InkStroke collection managed by the InkStrokeContainer .
    * @return True if content can be pasted from the clipboard; otherwise, false.
    */
  def canPasteFromClipboard(): Boolean = js.native
  /** Deletes all InkStroke objects from the collection managed by the InkStrokeContainer . */
  def clear(): Unit = js.native
  /** Copies the selected InkStroke objects (from the InkStroke collection managed by the InkStrokeContainer ) to the clipboard in Ink Serialized Format (ISF) format. */
  def copySelectedToClipboard(): Unit = js.native
  /**
    * Deletes the selected InkStroke objects from the InkStroke collection managed by the InkStrokeContainer .
    * @return The bounding rectangle of the selected ink strokes, or the invalidated rectangle (0, 0, 0, 0) if no strokes were removed (no selected strokes).
    */
  def deleteSelected(): Rect = js.native
  /**
    * Gets the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def getRecognitionResults(): IVectorView[InkRecognitionResult] = js.native
  /**
    * Retrieves all ink strokes in the collection managed by the InkStrokeContainer .
    * @return The ink strokes managed by the InkStrokeContainer as a collection of InkStroke objects.
    */
  def getStrokes(): IVectorView[InkStroke] = js.native
  /**
    * Asynchronously loads all InkStroke objects from the specified stream to the InkStroke collection that is managed by the InkStrokeContainer .
    * @param inputStream The target stream.
    * @return The status of the asynchronous operation as the number of bytes fetched. For more information, see ReadAsync method.
    */
  def loadAsync(inputStream: IInputStream): IPromiseWithIAsyncActionWithProgress[Double] = js.native
  /**
    * Moves the selected strokes. All affected strokes are re-rendered.
    * @param translation The destination screen coordinates for the upper-left corner of the bounding rectangle of the selected strokes.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def moveSelected(translation: Point): Rect = js.native
  /**
    * Adds the InkStroke content from the clipboard to the InkStroke collection that is managed by the InkStrokeContainer and renders the new strokes..
    * @param position The screen coordinates for the upper-left corner of the bounding rectangle of the clipboard content.
    * @return The invalidated bounding rectangle of the InkStroke collection.
    */
  def pasteFromClipboard(position: Point): Rect = js.native
  /**
    * Asynchronously saves all InkStroke objects in the InkStroke collection that is managed by the InkStrokeContainer to the specified stream.
    * @param outputStream The target stream. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
    * @return The status of the asynchronous operation as the number of bytes sent. For more information, see WriteAsync method.
    */
  def saveAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /**
    * Selects all strokes intersected by the new stroke.
    * @param from The start of the line.
    * @param to The of the line.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithLine(from: Point, to: Point): Rect = js.native
  /**
    * Selects all strokes contained entirely within the polyline.
    * @param polyline The points of the polyline.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
  /**
    * Updates the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @param recognitionResults The updated collection of InkRecognitionResult objects.
    */
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit = js.native
}

object InkStrokeContainer {
  @scala.inline
  def apply(
    addStroke: InkStroke => Unit,
    addStrokes: IIterable[InkStroke] => Unit,
    boundingRect: Rect,
    canPasteFromClipboard: () => Boolean,
    clear: () => Unit,
    copySelectedToClipboard: () => Unit,
    deleteSelected: () => Rect,
    getRecognitionResults: () => IVectorView[InkRecognitionResult],
    getStrokes: () => IVectorView[InkStroke],
    loadAsync: IInputStream => IPromiseWithIAsyncActionWithProgress[Double],
    moveSelected: Point => Rect,
    pasteFromClipboard: Point => Rect,
    saveAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    selectWithLine: (Point, Point) => Rect,
    selectWithPolyLine: IIterable[Point] => Rect,
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Unit
  ): InkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1(addStroke), addStrokes = js.Any.fromFunction1(addStrokes), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = js.Any.fromFunction0(canPasteFromClipboard), clear = js.Any.fromFunction0(clear), copySelectedToClipboard = js.Any.fromFunction0(copySelectedToClipboard), deleteSelected = js.Any.fromFunction0(deleteSelected), getRecognitionResults = js.Any.fromFunction0(getRecognitionResults), getStrokes = js.Any.fromFunction0(getStrokes), loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1(updateRecognitionResults))
    __obj.asInstanceOf[InkStrokeContainer]
  }
  @scala.inline
  implicit class InkStrokeContainerOps[Self <: InkStrokeContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStroke(value: InkStroke => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddStrokes(value: IIterable[InkStroke] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStrokes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBoundingRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPasteFromClipboard(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPasteFromClipboard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopySelectedToClipboard(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copySelectedToClipboard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteSelected(value: () => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecognitionResults(value: () => IVectorView[InkRecognitionResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecognitionResults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokes(value: () => IVectorView[InkStroke]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadAsync(value: IInputStream => IPromiseWithIAsyncActionWithProgress[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveSelected(value: Point => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPasteFromClipboard(value: Point => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteFromClipboard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSaveAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectWithLine(value: (Point, Point) => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithLine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectWithPolyLine(value: IIterable[Point] => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectWithPolyLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateRecognitionResults(value: IVectorView[InkRecognitionResult] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRecognitionResults")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

