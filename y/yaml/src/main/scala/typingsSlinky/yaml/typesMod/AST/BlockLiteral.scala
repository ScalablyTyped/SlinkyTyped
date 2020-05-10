package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.utilMod.Type.BLOCK_LITERAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockLiteral
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_BlockLiteral: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.BlockLiteral] = js.native
  @JSName("type")
  var type_BlockLiteral: BLOCK_LITERAL = js.native
}

