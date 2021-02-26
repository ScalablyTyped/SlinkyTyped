package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.utilMod.Type.FLOW_MAP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowMap extends FlowCollection {
  
  @JSName("type")
  var type_FlowMap: FLOW_MAP = js.native
}
object FlowMap {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_MAP,
    valueRangeContainsNewline: Boolean
  ): FlowMap = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowMap]
  }
  
  @scala.inline
  implicit class FlowMapMutableBuilder[Self <: FlowMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FLOW_MAP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
