package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingElement
  extends NamedDeclaration
     with ArrayBindingElement
     with BindingOrAssignmentElement
     with HasExpressionInitializer
     with VariableLikeDeclaration {
  var dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  var initializer: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_BindingElement: typingsSlinky.typescript.mod.SyntaxKind.BindingElement = js.native
  @JSName("name")
  var name_BindingElement: BindingName = js.native
  @JSName("parent")
  var parent_BindingElement: BindingPattern = js.native
  var propertyName: js.UndefOr[PropertyName] = js.native
}

