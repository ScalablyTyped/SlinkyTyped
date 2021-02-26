package typingsSlinky.yaml.typesMod

import typingsSlinky.yaml.typesMod.Schema.StringifyContext
import typingsSlinky.yaml.utilMod.Type.ALIAS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Alias")
@js.native
class Alias () extends Node {
  
  @JSName("cstNode")
  var cstNode_Alias: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.Alias] = js.native
  
  var source: Node = js.native
  
  def toString(ctx: StringifyContext): String = js.native
  
  @JSName("type")
  var type_Alias: ALIAS = js.native
}
