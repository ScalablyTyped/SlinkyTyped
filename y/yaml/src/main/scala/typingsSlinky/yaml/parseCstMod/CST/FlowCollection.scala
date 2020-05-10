package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.utilMod.Type.FLOW_MAP
import typingsSlinky.yaml.utilMod.Type.FLOW_SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowCollection
  extends Node
     with ContentNode {
  var items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection] = js.native
  @JSName("type")
  var type_FlowCollection: FLOW_MAP | FLOW_SEQ = js.native
}

object FlowCollection {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_MAP | FLOW_SEQ,
    valueRangeContainsNewline: Boolean
  ): FlowCollection = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowCollection]
  }
  @scala.inline
  implicit class FlowCollectionOps[Self <: FlowCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[FlowChar | BlankLine | Comment | Alias | Scalar | FlowCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: FLOW_MAP | FLOW_SEQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

