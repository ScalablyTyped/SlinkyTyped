package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDeclaration
  extends ClassElement
     with JSDocContainer
     with HasExpressionInitializer
     with HasType
     with VariableLikeDeclaration
     with _HasJSDoc {
  
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  var initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  var kind_PropertyDeclaration: typingsSlinky.typescript.mod.SyntaxKind.PropertyDeclaration = js.native
  
  @JSName("name")
  var name_PropertyDeclaration: PropertyName = js.native
  
  @JSName("parent")
  var parent_PropertyDeclaration: ClassLikeDeclaration = js.native
  
  var questionToken: js.UndefOr[QuestionToken] = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
}
