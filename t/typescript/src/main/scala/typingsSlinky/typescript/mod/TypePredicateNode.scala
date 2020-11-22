package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypePredicateNode
  extends TypeNode
     with HasType {
  
  val assertsModifier: js.UndefOr[AssertsToken] = js.native
  
  @JSName("kind")
  val kind_TypePredicateNode: typingsSlinky.typescript.mod.SyntaxKind.TypePredicate = js.native
  
  val parameterName: Identifier | ThisTypeNode = js.native
  
  @JSName("parent")
  val parent_TypePredicateNode: SignatureDeclaration | JSDocTypeExpression = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
