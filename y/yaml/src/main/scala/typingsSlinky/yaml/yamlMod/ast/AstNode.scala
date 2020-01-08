package typingsSlinky.yaml.yamlMod.ast

import typingsSlinky.yaml.yamlStrings.ALIAS
import typingsSlinky.yaml.yamlStrings.BIN
import typingsSlinky.yaml.yamlStrings.BLOCK_FOLDED
import typingsSlinky.yaml.yamlStrings.BLOCK_LITERAL
import typingsSlinky.yaml.yamlStrings.FLOW_MAP
import typingsSlinky.yaml.yamlStrings.FLOW_SEQ
import typingsSlinky.yaml.yamlStrings.HEX
import typingsSlinky.yaml.yamlStrings.MAP
import typingsSlinky.yaml.yamlStrings.OCT
import typingsSlinky.yaml.yamlStrings.PLAIN
import typingsSlinky.yaml.yamlStrings.QUOTE_DOUBLE
import typingsSlinky.yaml.yamlStrings.QUOTE_SINGLE
import typingsSlinky.yaml.yamlStrings.SEQ
import typingsSlinky.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yaml.yamlMod.ast.ScalarNode
  - typings.yaml.yamlMod.ast.MapNode
  - typings.yaml.yamlMod.ast.SeqNode
  - typings.yaml.yamlMod.ast.Alias
*/
trait AstNode extends js.Object

object AstNode {
  @scala.inline
  def QuoteDouble(
    toJSON: () => js.Any,
    `type`: QUOTE_DOUBLE,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.QuoteDouble = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def Seq(
    items: js.Array[AstNode | Null],
    toJSON: () => js.Any,
    `type`: SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.Seq = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def Map(
    items: js.Array[Pair | Merge],
    toJSON: () => js.Any,
    `type`: MAP,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.Map = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def BlockFolded(
    toJSON: () => js.Any,
    `type`: BLOCK_FOLDED,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.BlockFolded = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def FlowSeq(
    items: js.Array[AstNode | Pair],
    toJSON: () => js.Any,
    `type`: FLOW_SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.FlowSeq = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def FlowMap(
    items: js.Array[Pair | Merge],
    toJSON: () => js.Any,
    `type`: FLOW_MAP,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.FlowMap = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def Alias(
    source: AstNode,
    toJSON: () => js.Any,
    `type`: ALIAS,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.Alias = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def BlockLiteral(
    toJSON: () => js.Any,
    `type`: BLOCK_LITERAL,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.BlockLiteral = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def QuoteSingle(
    toJSON: () => js.Any,
    `type`: QUOTE_SINGLE,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.QuoteSingle = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
  @scala.inline
  def PlainValue(
    toJSON: () => js.Any,
    `type`: PLAIN,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.PlainValue = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): AstNode = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstNode]
  }
}

