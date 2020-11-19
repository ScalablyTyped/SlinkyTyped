package typingsSlinky.yaml.typesMod.AST

import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.utilMod.Type.PLAIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlainValue extends Scalar {
  
  @JSName("cstNode")
  var cstNode_PlainValue: js.UndefOr[typingsSlinky.yaml.parseCstMod.CST.PlainValue] = js.native
  
  @JSName("type")
  var type_PlainValue: PLAIN = js.native
}
