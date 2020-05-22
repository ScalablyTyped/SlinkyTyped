package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  @JSName("type")
  var type_ContinueStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
}

