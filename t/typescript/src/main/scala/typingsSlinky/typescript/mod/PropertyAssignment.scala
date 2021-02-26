package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with HasExpressionInitializer
     with ObjectBindingOrAssignmentElement
     with ObjectLiteralElementLike
     with VariableLikeDeclaration
     with _HasJSDoc {
  
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val initializer: Expression = js.native
  
  @JSName("kind")
  val kind_PropertyAssignment: typingsSlinky.typescript.mod.SyntaxKind.PropertyAssignment = js.native
  
  @JSName("name")
  val name_PropertyAssignment: PropertyName = js.native
  
  @JSName("parent")
  val parent_PropertyAssignment: ObjectLiteralExpression = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
