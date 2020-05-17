package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.ObjectLiteralElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _objectLiteralBrand
- typingsSlinky.typescript.mod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait MethodDeclaration
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with ObjectLiteralElementLike
     with SignatureDeclaration {
  var _classElementBrand: js.Any = js.native
  var _objectLiteralBrand: js.Any = js.native
  @JSName("body")
  var body_MethodDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_MethodDeclaration: typingsSlinky.typescript.mod.SyntaxKind.MethodDeclaration = js.native
  @JSName("name")
  var name_MethodDeclaration: PropertyName = js.native
  @JSName("parent")
  var parent_MethodDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}

