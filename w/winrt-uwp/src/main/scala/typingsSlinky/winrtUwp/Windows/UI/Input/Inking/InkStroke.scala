package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
@js.native
trait InkStroke extends js.Object {
  /** Gets the bounding box for the InkStroke . */
  var boundingRect: Rect = js.native
  /** Gets or sets the properties associated with an InkStroke . */
  var drawingAttributes: InkDrawingAttributes = js.native
  /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
  var pointTransform: Matrix3x2 = js.native
  /** Gets whether the stroke is recognized. */
  var recognized: Boolean = js.native
  /** Gets whether the stroke is selected. */
  var selected: Boolean = js.native
  /**
    * Gets the collection of InkPoint objects used to construct the InkStroke .
    * @return The collection of InkPoint objects used to construct the InkStroke .
    */
  def getInkPoints(): IVectorView[InkPoint] = js.native
  /**
    * Gets the rendering segments of the stroke.
    * @return The collection of InkStrokeRenderingSegment objects.
    */
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment] = js.native
}

object InkStroke {
  @scala.inline
  def apply(
    boundingRect: Rect,
    drawingAttributes: InkDrawingAttributes,
    getInkPoints: () => IVectorView[InkPoint],
    getRenderingSegments: () => IVectorView[InkStrokeRenderingSegment],
    pointTransform: Matrix3x2,
    recognized: Boolean,
    selected: Boolean
  ): InkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], drawingAttributes = drawingAttributes.asInstanceOf[js.Any], getInkPoints = js.Any.fromFunction0(getInkPoints), getRenderingSegments = js.Any.fromFunction0(getRenderingSegments), pointTransform = pointTransform.asInstanceOf[js.Any], recognized = recognized.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStroke]
  }
  @scala.inline
  implicit class InkStrokeOps[Self <: InkStroke] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawingAttributes(value: InkDrawingAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInkPoints(value: () => IVectorView[InkPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInkPoints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderingSegments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPointTransform(value: Matrix3x2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecognized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

