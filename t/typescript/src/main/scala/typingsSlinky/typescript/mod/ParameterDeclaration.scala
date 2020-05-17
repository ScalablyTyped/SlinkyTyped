package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterDeclaration
  extends NamedDeclaration
     with JSDocContainer
     with BindingOrAssignmentElement
     with HasExpressionInitializer
     with HasJSDoc
     with HasType
     with VariableLikeDeclaration {
  var dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  var initializer: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_ParameterDeclaration: Parameter = js.native
  @JSName("name")
  var name_ParameterDeclaration: BindingName = js.native
  @JSName("parent")
  var parent_ParameterDeclaration: SignatureDeclaration = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
  var `type`: js.UndefOr[TypeNode] = js.native
}

