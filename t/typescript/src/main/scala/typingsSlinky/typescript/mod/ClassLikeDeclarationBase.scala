package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassLikeDeclarationBase
  extends NamedDeclaration
     with JSDocContainer {
  
  val heritageClauses: js.UndefOr[NodeArray[HeritageClause]] = js.native
  
  @JSName("kind")
  val kind_ClassLikeDeclarationBase: typingsSlinky.typescript.mod.SyntaxKind.ClassDeclaration | typingsSlinky.typescript.mod.SyntaxKind.ClassExpression = js.native
  
  val members: NodeArray[ClassElement] = js.native
  
  @JSName("name")
  val name_ClassLikeDeclarationBase: js.UndefOr[Identifier] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
