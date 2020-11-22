package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxAttribute
  extends ObjectLiteralElement
     with HasInitializer
     with JsxAttributeLike
     with VariableLikeDeclaration {
  
  val initializer: js.UndefOr[StringLiteral | JsxExpression] = js.native
  
  @JSName("kind")
  val kind_JsxAttribute: typingsSlinky.typescript.mod.SyntaxKind.JsxAttribute = js.native
  
  @JSName("name")
  val name_JsxAttribute: Identifier = js.native
  
  @JSName("parent")
  val parent_JsxAttribute: JsxAttributes = js.native
}
