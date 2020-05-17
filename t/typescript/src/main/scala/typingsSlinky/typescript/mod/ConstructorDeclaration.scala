package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because Already inherited
- typingsSlinky.typescript.mod.NamedDeclaration because Already inherited
- typingsSlinky.typescript.mod.ClassElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _classElementBrand */ @js.native
trait ConstructorDeclaration
  extends FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with SignatureDeclaration {
  var _classElementBrand: js.Any = js.native
  @JSName("body")
  var body_ConstructorDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("kind")
  var kind_ConstructorDeclaration: Constructor = js.native
  @JSName("parent")
  var parent_ConstructorDeclaration: ClassLikeDeclaration = js.native
}

