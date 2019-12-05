package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkStroke")
@js.native
class InkStroke () extends IInkStroke {
  /* CompleteClass */
  override var boundingRect: Rect = js.native
  /* CompleteClass */
  override var drawingAttributes: InkDrawingAttributes = js.native
  /* CompleteClass */
  override var recognized: Boolean = js.native
  /* CompleteClass */
  override var selected: Boolean = js.native
  /* CompleteClass */
  override def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment] = js.native
}

