package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkStroke extends js.Object {
  var boundingRect: Rect = js.native
  var drawingAttributes: InkDrawingAttributes = js.native
  var recognized: Boolean = js.native
  var selected: Boolean = js.native
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment] = js.native
}

object IInkStroke {
  @scala.inline
  def apply(
    boundingRect: Rect,
    drawingAttributes: InkDrawingAttributes,
    getRenderingSegments: () => IVectorView[InkStrokeRenderingSegment],
    recognized: Boolean,
    selected: Boolean
  ): IInkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], drawingAttributes = drawingAttributes.asInstanceOf[js.Any], getRenderingSegments = js.Any.fromFunction0(getRenderingSegments), recognized = recognized.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkStroke]
  }
  @scala.inline
  implicit class IInkStrokeOps[Self <: IInkStroke] (val x: Self) extends AnyVal {
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
    def withGetRenderingSegments(value: () => IVectorView[InkStrokeRenderingSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderingSegments")(js.Any.fromFunction0(value))
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

