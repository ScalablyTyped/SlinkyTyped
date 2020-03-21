package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecimalNumber
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_DecimalNumber: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber
  var value: String
}

object DecimalNumber {
  @scala.inline
  def apply(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalNumber]
  }
}

