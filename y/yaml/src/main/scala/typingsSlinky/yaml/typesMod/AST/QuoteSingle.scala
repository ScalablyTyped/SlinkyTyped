package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.utilMod.Type.QUOTE_SINGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuoteSingle
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_QuoteSingle: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.QuoteSingle] = js.native
  @JSName("type")
  var type_QuoteSingle: QUOTE_SINGLE = js.native
  /* InferMemberOverrides */
  override def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Any = js.native
}

