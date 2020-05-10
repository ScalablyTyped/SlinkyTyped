package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.utilMod.Type.QUOTE_DOUBLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuoteDouble
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_QuoteDouble: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.QuoteDouble] = js.native
  @JSName("type")
  var type_QuoteDouble: QUOTE_DOUBLE = js.native
}

