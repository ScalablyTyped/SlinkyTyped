package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypePredicateNode
  extends TypeNode
     with HasType {
  
  var assertsModifier: js.UndefOr[AssertsToken] = js.native
  
  @JSName("kind")
  var kind_TypePredicateNode: typingsSlinky.typescript.mod.SyntaxKind.TypePredicate = js.native
  
  var parameterName: Identifier | ThisTypeNode = js.native
  
  @JSName("parent")
  var parent_TypePredicateNode: SignatureDeclaration | JSDocTypeExpression = js.native
  
  var `type`: js.UndefOr[TypeNode] = js.native
}
