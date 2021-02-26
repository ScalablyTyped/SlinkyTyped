package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocTypedefTag
  extends NamedDeclaration
     with JSDocTag
     with DeclarationWithTypeParameters {
  
  val fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  
  @JSName("kind")
  val kind_JSDocTypedefTag: typingsSlinky.typescript.mod.SyntaxKind.JSDocTypedefTag = js.native
  
  @JSName("name")
  val name_JSDocTypedefTag: js.UndefOr[Identifier] = js.native
  
  @JSName("parent")
  val parent_JSDocTypedefTag: JSDoc = js.native
  
  val typeExpression: js.UndefOr[JSDocTypeExpression | JSDocTypeLiteral] = js.native
}
