package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
@js.native
trait InkStroke extends StObject {
  
  /** Gets the bounding box for the InkStroke . */
  var boundingRect: Rect = js.native
  
  /** Gets or sets the properties associated with an InkStroke . */
  var drawingAttributes: InkDrawingAttributes = js.native
  
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
  
  /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
  var pointTransform: Matrix3x2 = js.native
  
  /** Gets whether the stroke is recognized. */
  var recognized: Boolean = js.native
  
  /** Gets whether the stroke is selected. */
  var selected: Boolean = js.native
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
  implicit class InkStrokeMutableBuilder[Self <: InkStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawingAttributes(value: InkDrawingAttributes): Self = StObject.set(x, "drawingAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInkPoints(value: () => IVectorView[InkPoint]): Self = StObject.set(x, "getInkPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = StObject.set(x, "getRenderingSegments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointTransform(value: Matrix3x2): Self = StObject.set(x, "pointTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecognized(value: Boolean): Self = StObject.set(x, "recognized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
