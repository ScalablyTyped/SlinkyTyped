package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAliasDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with DeclarationWithTypeParameterChildren
     with HasType
     with _HasJSDoc {
  
  @JSName("kind")
  val kind_TypeAliasDeclaration: typingsSlinky.typescript.mod.SyntaxKind.TypeAliasDeclaration = js.native
  
  @JSName("name")
  val name_TypeAliasDeclaration: Identifier = js.native
  
  val `type`: TypeNode = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
