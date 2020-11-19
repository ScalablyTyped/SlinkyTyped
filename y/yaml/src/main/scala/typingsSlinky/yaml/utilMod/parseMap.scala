package typingsSlinky.yaml.utilMod

import typingsSlinky.yaml.mod.Document
import typingsSlinky.yaml.parseCstMod.CST.FlowMap
import typingsSlinky.yaml.parseCstMod.CST.Map
import typingsSlinky.yaml.typesMod.AST.BlockMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/util", "parseMap")
@js.native
object parseMap extends js.Object {
  
  def apply(doc: Document, cst: FlowMap): typingsSlinky.yaml.typesMod.AST.FlowMap = js.native
  def apply(doc: Document, cst: Map): BlockMap = js.native
}
