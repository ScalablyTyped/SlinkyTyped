package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TupleTypeNode extends TypeNode {
  
  var elementTypes: NodeArray[TypeNode] = js.native
  
  @JSName("kind")
  var kind_TupleTypeNode: typingsSlinky.typescript.mod.SyntaxKind.TupleType = js.native
}
