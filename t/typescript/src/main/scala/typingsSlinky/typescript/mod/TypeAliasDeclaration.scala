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
  var kind_TypeAliasDeclaration: typingsSlinky.typescript.mod.SyntaxKind.TypeAliasDeclaration = js.native
  
  @JSName("name")
  var name_TypeAliasDeclaration: Identifier = js.native
  
  var `type`: TypeNode = js.native
  
  var typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
