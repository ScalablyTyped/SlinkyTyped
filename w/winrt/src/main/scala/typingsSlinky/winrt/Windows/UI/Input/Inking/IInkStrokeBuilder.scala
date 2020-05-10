package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkStrokeBuilder extends js.Object {
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint = js.native
  def beginStroke(pointerPoint: PointerPoint): Unit = js.native
  def createStroke(points: IIterable[Point]): InkStroke = js.native
  def endStroke(pointerPoint: PointerPoint): InkStroke = js.native
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}

object IInkStrokeBuilder {
  @scala.inline
  def apply(
    appendToStroke: PointerPoint => PointerPoint,
    beginStroke: PointerPoint => Unit,
    createStroke: IIterable[Point] => InkStroke,
    endStroke: PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => Unit
  ): IInkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1(beginStroke), createStroke = js.Any.fromFunction1(createStroke), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1(setDefaultDrawingAttributes))
    __obj.asInstanceOf[IInkStrokeBuilder]
  }
  @scala.inline
  implicit class IInkStrokeBuilderOps[Self <: IInkStrokeBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendToStroke(value: PointerPoint => PointerPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginStroke(value: PointerPoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateStroke(value: IIterable[Point] => InkStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndStroke(value: PointerPoint => InkStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaultDrawingAttributes(value: InkDrawingAttributes => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDrawingAttributes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

