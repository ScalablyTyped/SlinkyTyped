package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _objectLiteralBrand
- typingsSlinky.typescript.mod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait SetAccessorDeclaration
  extends FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  
  var _classElementBrand: js.Any = js.native
  
  var _objectLiteralBrand: js.Any = js.native
  
  @JSName("body")
  var body_SetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  var kind_SetAccessorDeclaration: SetAccessor = js.native
  
  @JSName("name")
  var name_SetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  var parent_SetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}
