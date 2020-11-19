package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.segmentGroupMod.SegmentGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentGroup {
  
  @JSImport("semantic-ui-react", "SegmentGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: SegmentGroupProps): SharedBuilder_SegmentGroupProps1911915083 = new SharedBuilder_SegmentGroupProps1911915083(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SegmentGroup.type): SharedBuilder_SegmentGroupProps1911915083 = new SharedBuilder_SegmentGroupProps1911915083(js.Array(this.component, js.Dictionary.empty))()
}
