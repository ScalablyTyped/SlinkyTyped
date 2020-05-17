package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLiteralExpression
  extends PrimaryExpression
     with ArrayBindingOrAssignmentPattern
     with AssignmentPattern
     with BindingOrAssignmentElement
     with DestructuringPattern {
  var elements: NodeArray[Expression] = js.native
  @JSName("kind")
  var kind_ArrayLiteralExpression: typingsSlinky.typescript.mod.SyntaxKind.ArrayLiteralExpression = js.native
}

