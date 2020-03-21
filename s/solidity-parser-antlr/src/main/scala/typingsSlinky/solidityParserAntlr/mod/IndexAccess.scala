package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ trait IndexAccess
  extends Expression
     with BaseASTNode {
  var base: Expression
  var index: Expression
  @JSName("type")
  var type_IndexAccess: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess
}

object IndexAccess {
  @scala.inline
  def apply(
    base: Expression,
    index: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IndexAccess,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexAccess]
  }
}

