package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalTypeNode extends TypeNode {
  
  var checkType: TypeNode = js.native
  
  var extendsType: TypeNode = js.native
  
  var falseType: TypeNode = js.native
  
  @JSName("kind")
  var kind_ConditionalTypeNode: typingsSlinky.typescript.mod.SyntaxKind.ConditionalType = js.native
  
  var trueType: TypeNode = js.native
}
