package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingElement
  extends NamedDeclaration
     with ArrayBindingElement
     with HasExpressionInitializer
     with ObjectBindingOrAssignmentElement
     with VariableLikeDeclaration
     with _ArrayBindingOrAssignmentElement {
  
  val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_BindingElement: typingsSlinky.typescript.mod.SyntaxKind.BindingElement = js.native
  
  @JSName("name")
  val name_BindingElement: BindingName = js.native
  
  @JSName("parent")
  val parent_BindingElement: BindingPattern = js.native
  
  val propertyName: js.UndefOr[PropertyName] = js.native
}
