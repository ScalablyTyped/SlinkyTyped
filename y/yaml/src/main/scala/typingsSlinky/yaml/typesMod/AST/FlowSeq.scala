package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Node
import typingsSlinky.yaml.typesMod.YAMLSeq
import typingsSlinky.yaml.utilMod.Type.FLOW_SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowSeq extends YAMLSeq {
  
  @JSName("cstNode")
  var cstNode_FlowSeq: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.FlowSeq] = js.native
  
  @JSName("items")
  var items_FlowSeq: js.Array[Node] = js.native
  
  @JSName("type")
  var type_FlowSeq: FLOW_SEQ = js.native
}
