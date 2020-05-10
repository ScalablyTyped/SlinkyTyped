package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.utilMod.Type.ALIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias
  extends Node
     with AstNode {
  @JSName("cstNode")
  var cstNode_Alias: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.Alias] = js.native
  var source: AstNode = js.native
  @JSName("type")
  var type_Alias: ALIAS = js.native
}

