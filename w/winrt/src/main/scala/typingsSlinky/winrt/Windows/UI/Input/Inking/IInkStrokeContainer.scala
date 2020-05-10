package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkStrokeContainer extends js.Object {
  var boundingRect: Rect = js.native
  def addStroke(stroke: InkStroke): Unit = js.native
  def canPasteFromClipboard(): Boolean = js.native
  def copySelectedToClipboard(): Unit = js.native
  def deleteSelected(): Rect = js.native
  def getRecognitionResults(): IVectorView[InkRecognitionResult] = js.native
  def getStrokes(): IVectorView[InkStroke] = js.native
  def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
  def moveSelected(translation: Point): Rect = js.native
  def pasteFromClipboard(position: Point): Rect = js.native
  def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  def selectWithLine(from: Point, to: Point): Rect = js.native
  def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit = js.native
}

object IInkStrokeContainer {
  @scala.inline
  def apply(
    addStroke: InkStroke => Unit,
    boundingRect: Rect,
    canPasteFromClipboard: () => Boolean,
    copySelectedToClipboard: () => Unit,
    deleteSelected: () => Rect,
    getRecognitionResults: () => IVectorView[InkRecognitionResult],
    getStrokes: () => IVectorView[InkStroke],
    loadAsync: IInputStream => IAsyncActionWithProgress[Double],
    moveSelected: Point => Rect,
    pasteFromClipboard: Point => Rect,
    saveAsync: IOutputStream => IAsyncOperationWithProgress[Double, Double],
    selectWithLine: (Point, Point) => Rect,
    selectWithPolyLine: IIterable[Point] => Rect,
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Unit
  ): IInkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1(addStroke), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = js.Any.fromFunction0(canPasteFromClipboard), copySelectedToClipboard = js.Any.fromFunction0(copySelectedToClipboard), deleteSelected = js.Any.fromFunction0(deleteSelected), getRecognitionResults = js.Any.fromFunction0(getRecognitionResults), getStrokes = js.Any.fromFunction0(getStrokes), loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1(updateRecognitionResults))
    __obj.asInstanceOf[IInkStrokeContainer]
  }
  @scala.inline
  implicit class IInkStrokeContainerOps[Self <: IInkStrokeContainer] (val x: Self) extends AnyVal {
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
    def withLoadAsync(value: IInputStream => IAsyncActionWithProgress[Double]): Self = {
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
    def withSaveAsync(value: IOutputStream => IAsyncOperationWithProgress[Double, Double]): Self = {
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

