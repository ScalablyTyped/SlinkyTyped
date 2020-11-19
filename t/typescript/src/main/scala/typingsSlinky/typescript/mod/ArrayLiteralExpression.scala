package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLiteralExpression
  extends PrimaryExpression
     with ArrayBindingOrAssignmentPattern
     with AssignmentPattern
     with DestructuringPattern
     with _BindingOrAssignmentElement {
  
  var elements: NodeArray[Expression] = js.native
  
  @JSName("kind")
  var kind_ArrayLiteralExpression: typingsSlinky.typescript.mod.SyntaxKind.ArrayLiteralExpression = js.native
}
