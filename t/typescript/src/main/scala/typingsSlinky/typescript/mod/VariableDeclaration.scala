package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclaration
  extends NamedDeclaration
     with HasExpressionInitializer
     with HasType
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement {
  
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  var initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  var kind_VariableDeclaration: typingsSlinky.typescript.mod.SyntaxKind.VariableDeclaration = js.native
  
  @JSName("name")
  var name_VariableDeclaration: BindingName = js.native
  
  @JSName("parent")
  var parent_VariableDeclaration: VariableDeclarationList | CatchClause = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
}
