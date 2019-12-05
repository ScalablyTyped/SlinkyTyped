package typingsSlinky.yaml.yamlMod.ast

import typingsSlinky.yaml.yamlStrings.BIN
import typingsSlinky.yaml.yamlStrings.BLOCK_FOLDED
import typingsSlinky.yaml.yamlStrings.BLOCK_LITERAL
import typingsSlinky.yaml.yamlStrings.HEX
import typingsSlinky.yaml.yamlStrings.OCT
import typingsSlinky.yaml.yamlStrings.PLAIN
import typingsSlinky.yaml.yamlStrings.QUOTE_DOUBLE
import typingsSlinky.yaml.yamlStrings.QUOTE_SINGLE
import typingsSlinky.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scalar extends Node {
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[BIN | HEX | OCT | TIME] = js.undefined
  var `type`: js.UndefOr[BLOCK_FOLDED | BLOCK_LITERAL | PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE] = js.undefined
  var value: Null | Boolean | Double | String
}

object Scalar {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typingsSlinky.yaml.yamlMod.cst.Node = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    `type`: BLOCK_FOLDED | BLOCK_LITERAL | PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE = null,
    value: Boolean | Double | String = null
  ): Scalar = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scalar]
  }
}

