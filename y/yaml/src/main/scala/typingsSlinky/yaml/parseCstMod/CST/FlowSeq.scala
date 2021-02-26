package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.utilMod.Type.FLOW_SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowSeq extends FlowCollection {
  
  @JSName("type")
  var type_FlowSeq: FLOW_SEQ = js.native
}
object FlowSeq {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_SEQ,
    valueRangeContainsNewline: Boolean
  ): FlowSeq = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSeq]
  }
  
  @scala.inline
  implicit class FlowSeqMutableBuilder[Self <: FlowSeq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FLOW_SEQ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
