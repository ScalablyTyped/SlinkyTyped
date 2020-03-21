package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited
- typingsSlinky.solidityParserAntlr.mod.Expression because Already inherited
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ trait TupleExpression
  extends PrimaryExpression
     with BaseASTNode {
  var components: js.Array[Expression]
  var isArray: Boolean
  @JSName("type")
  var type_TupleExpression: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression
}

object TupleExpression {
  @scala.inline
  def apply(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleExpression]
  }
}

