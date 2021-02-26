package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.utilMod.Type.ALIAS
import typingsSlinky.yaml.utilMod.Type.BLOCK_FOLDED
import typingsSlinky.yaml.utilMod.Type.BLOCK_LITERAL
import typingsSlinky.yaml.utilMod.Type.FLOW_MAP
import typingsSlinky.yaml.utilMod.Type.FLOW_SEQ
import typingsSlinky.yaml.utilMod.Type.MAP
import typingsSlinky.yaml.utilMod.Type.PLAIN
import typingsSlinky.yaml.utilMod.Type.QUOTE_DOUBLE
import typingsSlinky.yaml.utilMod.Type.QUOTE_SINGLE
import typingsSlinky.yaml.utilMod.Type.SEQ
import typingsSlinky.yaml.yamlStrings.CLIP
import typingsSlinky.yaml.yamlStrings.KEEP
import typingsSlinky.yaml.yamlStrings.STRIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.parseCstMod.CST.Alias
  - typingsSlinky.yaml.parseCstMod.CST.Scalar
  - typingsSlinky.yaml.parseCstMod.CST.Map
  - typingsSlinky.yaml.parseCstMod.CST.Seq
  - typingsSlinky.yaml.parseCstMod.CST.FlowCollection
*/
trait ContentNode extends StObject
object ContentNode {
  
  @scala.inline
  def Alias(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: String,
    `type`: ALIAS,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.Alias = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.Alias]
  }
  
  @scala.inline
  def BlockValue(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_FOLDED | BLOCK_LITERAL,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.BlockValue = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.BlockValue]
  }
  
  @scala.inline
  def FlowCollection(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[
      FlowChar | BlankLine | Comment | Alias | Scalar | typingsSlinky.yaml.parseCstMod.CST.FlowCollection
    ],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_MAP | FLOW_SEQ,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.FlowCollection = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.FlowCollection]
  }
  
  @scala.inline
  def Map(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | Alias | Scalar | MapItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.Map = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.Map]
  }
  
  @scala.inline
  def PlainValue(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: PLAIN,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.PlainValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.PlainValue]
  }
  
  @scala.inline
  def QuoteValue(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.QuoteValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.QuoteValue]
  }
  
  @scala.inline
  def Seq(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | SeqItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ,
    valueRangeContainsNewline: Boolean
  ): typingsSlinky.yaml.parseCstMod.CST.Seq = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.yaml.parseCstMod.CST.Seq]
  }
}
