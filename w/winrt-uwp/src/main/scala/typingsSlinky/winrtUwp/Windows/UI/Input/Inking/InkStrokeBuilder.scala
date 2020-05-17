package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds strokes from raw pointer input. */
@js.native
trait InkStrokeBuilder extends js.Object {
  /**
    * Adds a new segment to the ink stroke.
    * @param pointerPoint The end point of the new segment.
    * @return The previous end point. This end point can be used when rendering the stroke.
    */
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint = js.native
  /**
    * Starts building the ink stroke.
    * @param pointerPoint The first point for the stroke.
    */
  def beginStroke(pointerPoint: PointerPoint): Unit = js.native
  /**
    * Creates a stroke from an array of Point coordinates.
    * @param points An array of Point coordinates.
    * @return The new stroke.
    */
  def createStroke(points: IIterable[Point]): InkStroke = js.native
  /**
    * Creates a stroke from collection of InkPoint objects.
    * @param inkPoints The collection of InkPoint objects.
    * @param transform A 2-D transformation matrix.
    * @return The ink stroke, including the Bézier curve parameters used for final rendering of the stroke.
    */
  def createStrokeFromInkPoints(inkPoints: IIterable[InkPoint], transform: Matrix3x2): InkStroke = js.native
  /**
    * Stops building the ink stroke.
    * @param pointerPoint The last point for the stroke.
    * @return The stroke built from the points.
    */
  def endStroke(pointerPoint: PointerPoint): InkStroke = js.native
  /**
    * Sets the default InkDrawingAttributes for all new ink strokes created after the current stroke.
    * @param drawingAttributes The default attributes.
    */
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}

object InkStrokeBuilder {
  @scala.inline
  def apply(
    appendToStroke: PointerPoint => PointerPoint,
    beginStroke: PointerPoint => Unit,
    createStroke: IIterable[Point] => InkStroke,
    createStrokeFromInkPoints: (IIterable[InkPoint], Matrix3x2) => InkStroke,
    endStroke: PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => Unit
  ): InkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1(beginStroke), createStroke = js.Any.fromFunction1(createStroke), createStrokeFromInkPoints = js.Any.fromFunction2(createStrokeFromInkPoints), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1(setDefaultDrawingAttributes))
    __obj.asInstanceOf[InkStrokeBuilder]
  }
  @scala.inline
  implicit class InkStrokeBuilderOps[Self <: InkStrokeBuilder] (val x: Self) extends AnyVal {
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
    def withCreateStrokeFromInkPoints(value: (IIterable[InkPoint], Matrix3x2) => InkStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStrokeFromInkPoints")(js.Any.fromFunction2(value))
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

