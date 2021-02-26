package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInkStrokeBuilder extends StObject {
  
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
  implicit class IInkStrokeBuilderMutableBuilder[Self <: IInkStrokeBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendToStroke(value: PointerPoint => PointerPoint): Self = StObject.set(x, "appendToStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginStroke(value: PointerPoint => Unit): Self = StObject.set(x, "beginStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateStroke(value: IIterable[Point] => InkStroke): Self = StObject.set(x, "createStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndStroke(value: PointerPoint => InkStroke): Self = StObject.set(x, "endStroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultDrawingAttributes(value: InkDrawingAttributes => Unit): Self = StObject.set(x, "setDefaultDrawingAttributes", js.Any.fromFunction1(value))
  }
}
