package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.GetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.ReadonlyTextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typingsSlinky.typescript.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait GetAccessorDeclaration
  extends FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  
  var _classElementBrand: js.Any = js.native
  
  var _objectLiteralBrand: js.Any = js.native
  
  @JSName("body")
  val body_GetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_GetAccessorDeclaration: GetAccessor = js.native
  
  @JSName("name")
  val name_GetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_GetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}
