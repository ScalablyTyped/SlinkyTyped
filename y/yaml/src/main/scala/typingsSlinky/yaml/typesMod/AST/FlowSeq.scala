package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Pair
import typingsSlinky.yaml.typesMod.YAMLSeq
import typingsSlinky.yaml.utilMod.Type.FLOW_SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowSeq
  extends YAMLSeq
     with CollectionNode {
  @JSName("cstNode")
  var cstNode_FlowSeq: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.FlowSeq] = js.native
  @JSName("items")
  var items_FlowSeq: js.Array[AstNode | Pair] = js.native
  @JSName("type")
  var type_FlowSeq: FLOW_SEQ = js.native
}

