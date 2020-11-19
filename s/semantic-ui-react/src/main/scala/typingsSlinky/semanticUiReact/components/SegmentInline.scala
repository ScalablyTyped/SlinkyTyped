package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.segmentInlineMod.SegmentInlineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentInline {
  
  @JSImport("semantic-ui-react", "SegmentInline")
  @js.native
  object component extends js.Object
  
  def withProps(p: SegmentInlineProps): SharedBuilder_SegmentInlineProps1003700032 = new SharedBuilder_SegmentInlineProps1003700032(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SegmentInline.type): SharedBuilder_SegmentInlineProps1003700032 = new SharedBuilder_SegmentInlineProps1003700032(js.Array(this.component, js.Dictionary.empty))()
}
