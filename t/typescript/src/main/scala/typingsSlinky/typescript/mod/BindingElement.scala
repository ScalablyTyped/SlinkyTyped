package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingElement
  extends NamedDeclaration
     with ArrayBindingElement
     with HasExpressionInitializer
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement {
  
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
