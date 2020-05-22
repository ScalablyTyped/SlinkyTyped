package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.parseCstMod.CST.Seq
import typingsSlinky.yaml.typesMod.Node
import typingsSlinky.yaml.typesMod.YAMLSeq
import typingsSlinky.yaml.utilMod.Type.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockSeq extends YAMLSeq {
  @JSName("cstNode")
  var cstNode_BlockSeq: js.UndefOr[Seq] = js.native
  @JSName("items")
  var items_BlockSeq: js.Array[Node | Null] = js.native
  @JSName("type")
  var type_BlockSeq: SEQ = js.native
}

