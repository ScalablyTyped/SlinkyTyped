package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShorthandPropertyAssignment
  extends ObjectLiteralElement
     with JSDocContainer
     with BindingOrAssignmentElement
     with HasJSDoc
     with ObjectLiteralElementLike
     with VariableLikeDeclaration {
  var equalsToken: js.UndefOr[Token[typingsSlinky.typescript.mod.SyntaxKind.EqualsToken]] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  @JSName("kind")
  var kind_ShorthandPropertyAssignment: typingsSlinky.typescript.mod.SyntaxKind.ShorthandPropertyAssignment = js.native
  @JSName("name")
  var name_ShorthandPropertyAssignment: Identifier = js.native
  var objectAssignmentInitializer: js.UndefOr[Expression] = js.native
  @JSName("parent")
  var parent_ShorthandPropertyAssignment: ObjectLiteralExpression = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

